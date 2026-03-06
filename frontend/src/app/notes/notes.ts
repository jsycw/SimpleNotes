import {Component,ViewChild,ElementRef} from '@angular/core'
import {CommonModule} from '@angular/common'
import {FormsModule} from '@angular/forms'
import {HttpClient,HttpClientModule} from '@angular/common/http'

@Component({
  selector:'app-notes',
  standalone:true,
  imports:[CommonModule,FormsModule,HttpClientModule],
  templateUrl:'./notes.html',
  styleUrl:'./notes.css'
})
export class Notes{

  @ViewChild('noteInput') noteInput!:ElementRef

  notes:any[]=[]
  newNote=''
  showError=false

  apiUrl='http://localhost:8000/api/notes'

  constructor(private http:HttpClient){
    this.loadNotes()
  }

  loadNotes(){
    this.http.get<any[]>(this.apiUrl).subscribe(data=>{
      this.notes=data
        .sort((a,b)=>new Date(b.createdDate).getTime()-new Date(a.createdDate).getTime())
    })
  }

  addNote(){
    if(!this.newNote.trim()){
      this.showError=true
      return
    }

    const content=this.newNote
    this.newNote=''
    this.showError=false

    this.http.post(this.apiUrl,{content}).subscribe(()=>{
      window.location.reload()
    })
  }

  deleteNote(id:number){
    this.notes=this.notes.filter(n=>n.id!==id)
    this.http.delete(`${this.apiUrl}/${id}`).subscribe()
  }

  trackById(index:number,note:any){
    return note.id
  }

}
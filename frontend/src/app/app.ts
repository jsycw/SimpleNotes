import { Component } from '@angular/core';
import { Notes } from './notes/notes';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Notes],
  template: `<app-notes></app-notes>`
})
export class App {}
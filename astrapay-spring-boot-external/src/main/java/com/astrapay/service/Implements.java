package com.astrapay.service;

import java.time.LocalDateTime;
import java.util.List;

import com.astrapay.dto.NoteRequest;
import com.astrapay.entity.Note;
import com.astrapay.repository.NoteRepository;
import org.springframework.stereotype.Service;

@Service
public class Implements implements NoteService{
    private final NoteRepository noteRepository;

    public Implements(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note createNote(NoteRequest request) {
        Note note = new Note();
        note.setContent(request.getContent());
        note.setCreatedDate(LocalDateTime.now());
        return noteRepository.save(note);
    }

    @Override
    public void deleteNote(Long id) {
        Note note = noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
        noteRepository.delete(note.getId());
    }
}

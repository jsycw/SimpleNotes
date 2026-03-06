package com.astrapay.service;

import com.astrapay.dto.NoteRequest;
import com.astrapay.entity.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
    Note createNote(NoteRequest request);
    void deleteNote(Long id);
}
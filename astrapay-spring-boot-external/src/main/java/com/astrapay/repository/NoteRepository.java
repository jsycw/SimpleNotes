package com.astrapay.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

import com.astrapay.entity.Note;
import org.springframework.stereotype.Repository;

@Repository
public class NoteRepository {
     private final Map<Long, Note> notes = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public List<Note> findAll() {
        return new ArrayList<>(notes.values());
    }

    public Note save(Note note) {
        Long id = idGenerator.incrementAndGet();
        note.setId(id);
        notes.put(id, note);
        return note;
    }

    public Optional<Note> findById(Long id) {
        return Optional.ofNullable(notes.get(id));
    }

    public void delete(Long id) {
        notes.remove(id);
    }
}

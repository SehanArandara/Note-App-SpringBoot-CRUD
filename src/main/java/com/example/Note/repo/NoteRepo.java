package com.example.Note.repo;

import com.example.Note.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<Note,Integer> {
}

package com.example.Note.repo;

import com.example.Note.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NoteRepo extends JpaRepository<Note,Integer> {

    // SQL query to get one note
    @Query(value = "SELECT * FROM note WHERE id= ?1",nativeQuery = true)   // ?1 - first parameter of the getNoteById func
    Note getNoteById(String noteid);

}

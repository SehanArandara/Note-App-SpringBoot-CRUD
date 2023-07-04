package com.example.Note.Controller;


import com.example.Note.dto.NoteDTO;
import com.example.Note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "api/v1/note")
@CrossOrigin
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/getNotes")
    public List<NoteDTO> getNote (){
        return noteService.getAllNotes();
    }

    @PostMapping("/addNote")
    public NoteDTO addNote (@RequestBody NoteDTO noteDTO){
        return noteService.saveNote(noteDTO);
    }

    @PutMapping("/updateNote")
    public NoteDTO updateNote(@RequestBody NoteDTO noteDTO){
        return noteService.updateNote(noteDTO);
    }

    @DeleteMapping("/deleteNote")
    public boolean deleteNote(@RequestBody NoteDTO noteDTO){
        return noteService.deleteNote(noteDTO   );
    }
}

package com.example.Note.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "api/v1/note")
@CrossOrigin
public class NoteController {

    @GetMapping("/getNote")
    public String getNote (){
        return  "Do Spring boots";
    }

    @PostMapping("/addNote")
    public String addNote (){
        return "Add Note done!";
    }

    @PutMapping("/updateNote")
    public String updateNote(){
        return "Updated Note";
    }

    @DeleteMapping("/deleteNote")
    public String deleteNote(){
        return "deleted Note";
    }
}

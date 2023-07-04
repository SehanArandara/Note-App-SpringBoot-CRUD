package com.example.Note.service;

import com.example.Note.dto.NoteDTO;
import com.example.Note.entity.Note;
import com.example.Note.repo.NoteRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NoteService {
    @Autowired
    private NoteRepo noteRepo;
    @Autowired
    private ModelMapper modelMapper;
    public NoteDTO saveNote(NoteDTO noteDTO){
        noteRepo.save(modelMapper.map(noteDTO,Note.class));
        return noteDTO;
    }
}

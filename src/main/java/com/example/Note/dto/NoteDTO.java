package com.example.Note.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NoteDTO {
    private int id;
    private String topic;
    private String description;
}

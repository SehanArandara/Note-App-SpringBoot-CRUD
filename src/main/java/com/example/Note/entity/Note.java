package com.example.Note.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity       //  annotaion to say this is entity
@NoArgsConstructor    //  annoation to create primary constructor
@AllArgsConstructor   //  annotation tp create the constructor
@Data   // annotation for getters and setters
public class Note {
    @Id
    private int id;
    private String topic;
    private String description;
}

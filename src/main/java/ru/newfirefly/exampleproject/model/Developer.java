package ru.newfirefly.exampleproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private Long id;
    private String firsName;
    private String lastName;
}

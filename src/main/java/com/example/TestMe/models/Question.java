package com.example.TestMe.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Question {
    private Long id;
    private String discipline;
    private String question;
    private String answer;
    private String variables;
}

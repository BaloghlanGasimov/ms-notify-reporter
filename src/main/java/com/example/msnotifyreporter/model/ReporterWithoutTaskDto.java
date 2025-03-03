package com.example.msnotifyreporter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReporterWithoutTaskDto {

    private String id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String image;
}

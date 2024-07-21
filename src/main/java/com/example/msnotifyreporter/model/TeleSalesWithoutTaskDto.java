package com.example.msnotifyreporter.model;

import com.example.msnotifyreporter.enums.TeleSalePosition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeleSalesWithoutTaskDto {
    private String id;
    private String name;
    private String surname;
    private String email;
    private TeleSalePosition position;
    private LocalDate birthDate;
    private String image;
}

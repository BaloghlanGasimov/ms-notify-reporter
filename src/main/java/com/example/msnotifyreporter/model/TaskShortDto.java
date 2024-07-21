package com.example.msnotifyreporter.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TaskShortDto {
    private String id;
    private TeleSalesWithoutTaskDto assignee;
    private ReporterWithoutTaskDto reporter;
    private Date createdAt;
    private Date updatedAt;
    private Date deadline;
}

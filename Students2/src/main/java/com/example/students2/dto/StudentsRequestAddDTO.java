package com.example.students2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentsRequestAddDTO {
    private String nameStudents;
    private Integer ageStudents;
    private Long groupId;
}

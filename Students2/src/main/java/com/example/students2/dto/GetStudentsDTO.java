package com.example.students2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetStudentsDTO {
    private String nameStudents;
    private Integer ageStudents;
    private Long studentsId;
    private Long groupId;
}

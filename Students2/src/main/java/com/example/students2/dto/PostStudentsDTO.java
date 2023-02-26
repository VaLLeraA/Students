package com.example.students2.dto;

import com.sun.istack.NotNull;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostStudentsDTO {
    @NotNull
    private String nameStudents;
    @NotNull
    private Integer ageStudents;
}

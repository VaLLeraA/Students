package com.example.students2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetGroupDTO {
    private String nameGroup;
    private Set<StudentsRequestAddDTO> student;
}

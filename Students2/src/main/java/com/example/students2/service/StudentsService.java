package com.example.students2.service;


import com.example.students2.dto.GetStudentsDTO;
import com.example.students2.dto.PutStudentsDTO;
import com.example.students2.dto.StudentsRequestAddDTO;

public interface StudentsService {

    void add (StudentsRequestAddDTO studentsRequestAddDTO);

    GetStudentsDTO get (Long id);

    void delete (Long id);

    void put (PutStudentsDTO dto, Long id);

}

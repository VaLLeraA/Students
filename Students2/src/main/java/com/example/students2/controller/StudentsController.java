package com.example.students2.controller;

import com.example.students2.dto.GetStudentsDTO;
import com.example.students2.dto.PutStudentsDTO;
import com.example.students2.dto.StudentsRequestAddDTO;
import com.example.students2.service.StudentsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/students" )
public class StudentsController {

    private final StudentsService studentsService;

    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @PostMapping("/add")
    public void add(@RequestBody StudentsRequestAddDTO studentsRequestAddDTO){
        studentsService.add(studentsRequestAddDTO);
    }

    @GetMapping("/get")
    public GetStudentsDTO get(@RequestParam Long id){
        return studentsService.get(id);
    }

    @DeleteMapping("/delete")
    public void delete (@RequestParam Long id){
        studentsService.delete(id);
    }

    @PutMapping("/put/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void put (@RequestBody PutStudentsDTO dto, @PathVariable("id") Long id){
        studentsService.put(dto, id);
    }
}

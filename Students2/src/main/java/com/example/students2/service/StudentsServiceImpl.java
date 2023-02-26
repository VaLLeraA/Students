package com.example.students2.service;

import com.example.students2.dto.GetStudentsDTO;
import com.example.students2.dto.PutStudentsDTO;
import com.example.students2.dto.StudentsRequestAddDTO;
import com.example.students2.model.Students;
import com.example.students2.repository.GroupRepository;
import com.example.students2.repository.StudentsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentsServiceImpl implements StudentsService{

    private final StudentsRepository studentsRepository;

    private final GroupRepository groupRepository;


    public StudentsServiceImpl(StudentsRepository studentsRepository, GroupRepository groupRepository) {
        this.studentsRepository = studentsRepository;
        this.groupRepository = groupRepository;
    }

    @Override
    public void add(StudentsRequestAddDTO studentsRequestAddDTO){
        Students students =
                Students.builder()
                .nameStudents(studentsRequestAddDTO.getNameStudents())
                .ageStudents(studentsRequestAddDTO.getAgeStudents())
                .build();
       studentsRepository.save(students);
    }

    @Override
    public GetStudentsDTO get (Long id){
        Optional <Students> byName = studentsRepository.findById(id);
        if (byName.isPresent()){
            Students students = byName.get();

            GetStudentsDTO build = GetStudentsDTO.builder()
                    .nameStudents(students.getNameStudents())
                    .ageStudents(students.getAgeStudents())
                    .studentsId(students.getId())
                    .build();
            return build;
        }
        throw new IllegalArgumentException("его нет");
    }

    public void delete (Long id){
        studentsRepository.deleteById(id);
    }

    @Override
    public void put(PutStudentsDTO dto, Long id) {
        Students build = Students.builder()
                .nameStudents(dto.getNameStudents())
                .ageStudents(dto.getAgeStudents())
                .build();
        build.setId(id);
        studentsRepository.save(build);
    }
}

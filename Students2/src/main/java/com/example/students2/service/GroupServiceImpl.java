package com.example.students2.service;

import com.example.students2.dto.GetGroupDTO;
import com.example.students2.dto.GroupRequestAddDTO;
import com.example.students2.dto.StudentsRequestAddDTO;
import com.example.students2.model.Students;
import com.example.students2.model.UniversityGroup;
import com.example.students2.repository.GroupRepository;
import com.example.students2.repository.StudentsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService{

    private final GroupRepository groupRepository;
    private final StudentsRepository studentsRepository;

    public GroupServiceImpl(GroupRepository groupRepository, StudentsRepository studentsRepository) {
        this.groupRepository = groupRepository;
        this.studentsRepository = studentsRepository;
    }


    @Override
    public void add(GroupRequestAddDTO groupRequestAddDTO) {
        UniversityGroup universityGroup=
                UniversityGroup.builder()
                        .nameGroup(groupRequestAddDTO.getNameGroup())
                        .build();
        groupRepository.save(universityGroup);
    }

    @Override
    public GetGroupDTO get(Long id) {
        Optional<UniversityGroup> byId = groupRepository.findById(id);
        UniversityGroup universityGroup = byId.get();
        Set <Students> students = studentsRepository.findByUniversityGroupId(id);

        Set <StudentsRequestAddDTO> collect = students.stream().map(student -> StudentsRequestAddDTO.builder()
                .nameStudents(student.getNameStudents())
                .ageStudents(student.getAgeStudents())
                .groupId(student.getId())
                .build())
                .collect(Collectors.toSet());

        GetGroupDTO build = GetGroupDTO.builder()
                .nameGroup(universityGroup.getNameGroup())
                .student(collect)
                .build();
        return build;
    }

    public void delete (Long id){
        groupRepository.deleteById(id);
    }
}

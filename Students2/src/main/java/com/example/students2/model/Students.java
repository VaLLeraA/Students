package com.example.students2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@Data
@Entity
public class Students {

    public Students(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameStudents;
    private Integer ageStudents;

    @ManyToOne
    @JoinColumn(name ="group_id")
    private UniversityGroup universityGroup;
}



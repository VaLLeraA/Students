package com.example.students2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Builder
@AllArgsConstructor
@Data
@Entity
public class UniversityGroup {

    public UniversityGroup() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameGroup;

    @OneToMany
    private Set<Students> student;
}

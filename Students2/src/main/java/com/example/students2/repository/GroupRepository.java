package com.example.students2.repository;

import com.example.students2.model.UniversityGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends CrudRepository<UniversityGroup, Long> {

}


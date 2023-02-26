package com.example.students2.repository;

import com.example.students2.model.Students;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
;
import java.util.Set;

@Repository
public interface StudentsRepository extends CrudRepository <Students, Long>  {
    @Query("select s from Students s where s.universityGroup.id = ?1")
    Set<Students> findByUniversityGroupId (Long Id);
    @Query("select distinct s from Students s where s.ageStudents = ?1")
    void findDistinctByAgeStudents (Long id);
}

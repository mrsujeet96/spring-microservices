package com.employee.repository;

import com.employee.model.EducationalQualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationRepo extends JpaRepository<EducationalQualification,Long> {

}

package com.employee.repository;

import com.employee.model.EducationalQualification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QualificationRepo extends JpaRepository<EducationalQualification,Long> {

}

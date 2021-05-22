package com.employee.service;

import com.employee.model.EducationalQualification;
import com.employee.repository.QualificationRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class QualificationService {

    private QualificationRepo qualificationRepo;

    public QualificationService(QualificationRepo qualificationRepo) {
        this.qualificationRepo = qualificationRepo;
    }

    public void saveQualification(EducationalQualification educationalQualification){
        qualificationRepo.save(educationalQualification);
    }
}

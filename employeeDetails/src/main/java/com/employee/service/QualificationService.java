package com.employee.service;

import com.employee.model.EducationalQualification;
import com.employee.repository.QualificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class QualificationService {

    @Autowired
    private QualificationRepo qualificationRepo;

    public QualificationService(QualificationRepo qualificationRepo) {
        this.qualificationRepo = qualificationRepo;
    }

    public void saveQualification(EducationalQualification educationalQualification){
        qualificationRepo.save(educationalQualification);
    }
    public Optional<EducationalQualification> getQuaDetails(Long edu_id){
        return qualificationRepo.findById(edu_id);
    }

    public List<EducationalQualification> getAllQuaDetails(){
        return qualificationRepo.findAll();
    }

}

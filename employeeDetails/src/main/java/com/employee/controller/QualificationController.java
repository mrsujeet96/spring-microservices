package com.employee.controller;


import com.employee.model.EducationalQualification;
import com.employee.repository.QualificationRepo;
import com.employee.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class QualificationController {

    @Autowired
    private QualificationRepo qualificationRepo;
    @Autowired
    private QualificationService qualificationService;


    @GetMapping("/edu_id")
    public Optional<EducationalQualification> getEduDetails(Long edu_id){
        return qualificationService.getQuaDetails(edu_id);

    }

    @GetMapping("/edu1")
    public List<EducationalQualification> getAllEduDetails(){
        return qualificationService.getAllQuaDetails();
    }

    @PostMapping("edu")
    public String PostEduDetails(@ModelAttribute EducationalQualification educationalQualification){
        qualificationService.saveQualification(educationalQualification);
        return "Educational Qualification Details Successfully save";
    }



}

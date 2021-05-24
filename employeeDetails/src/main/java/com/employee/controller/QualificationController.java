package com.employee.controller;


import com.employee.model.EducationalQualification;
import com.employee.repository.QualificationRepo;
import com.employee.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;
import java.util.Optional;

@Controller
public class QualificationController {

    @Autowired
    private QualificationRepo qualificationRepo;
    @Autowired
    private QualificationService qualificationService;


    @RequestMapping("/edu_id")
    public Optional<EducationalQualification> getEduDetails(Long edu_id){
        return qualificationService.getQuaDetails(edu_id);

    }

    @RequestMapping("/edu1")
    public List<EducationalQualification> getAllEduDetails(){
        return qualificationService.getAllQuaDetails();
    }

    @RequestMapping("/edu")
    public String PostEduDetails(@ModelAttribute EducationalQualification educationalQualification){
        qualificationService.saveQualification(educationalQualification);
        return "success";
    }



}

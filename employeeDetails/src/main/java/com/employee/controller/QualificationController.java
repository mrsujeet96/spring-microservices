package com.employee.controller;


import com.employee.repository.QualificationRepo;
import com.employee.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QualificationController {

    @Autowired
    private QualificationRepo qualificationRepo;
    @Autowired
    private QualificationService qualificationService;



}

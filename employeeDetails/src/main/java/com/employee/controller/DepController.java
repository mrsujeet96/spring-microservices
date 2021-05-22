package com.employee.controller;

import com.employee.model.Dependants;
import com.employee.repository.DependantsRepo;
import com.employee.service.DependantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepController {

    @Autowired
    private DependantsRepo dependantsRepo;
    @Autowired
    private DependantsService dependantsService;


    @GetMapping("/{dep_id}")
    public Optional<Dependants> getEmployeeDetails(@PathVariable Long dep_id){
        return dependantsService.getDepDetails(dep_id);
    }

    @GetMapping("/dep1")
    public List<Dependants> getALLDep(){
        return dependantsService.getAllDepDetails();

    }

    @PostMapping("/dep")
    public String postDepDetails(@ModelAttribute Dependants dependants) {
        dependantsService.saveDependant(dependants);
        return " Dependants Details Successfully save";
    }



}

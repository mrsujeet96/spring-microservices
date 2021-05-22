package com.employee.controller;


import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/{id}")
    public Employee getEmployeeDetails(@PathVariable Long id){
        return EmployeeRepo.findByOne(id);

    }
    @GetMapping("/")
    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }


    @PostMapping("/employee")
    public String postEmployeeDetails(@ModelAttribute Employee employee){
        employeeService.saveEmployee(employee);
        return " Employee Details Successfully save";
    }


}

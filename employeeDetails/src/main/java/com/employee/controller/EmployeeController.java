package com.employee.controller;


import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepo employeeRepo;


    @GetMapping("/{emp_id}")
    public Optional<Employee> getEmployeeDetails(@PathVariable Long emp_id){
        return employeeService.getDetails(emp_id);
    }

    @GetMapping("/employee1")
    public List<Employee> getALLEmp(){
        return employeeService.getAllDetails();
    }

    @RequestMapping("/")
    public String homePage(){
        return "Employee1";
    }


    @PostMapping("/employee")
    public  String SaveEmpDetils(@ModelAttribute Employee employee){
        employeeService.saveEmployee(employee);
        return "Dependant";
    }



}

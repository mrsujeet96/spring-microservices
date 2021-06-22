package com.jpaapractice.controller;

import com.jpaapractice.model.Employee;
import com.jpaapractice.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return jpaService.getAllEmployee();
    }
    @GetMapping("/employee/{emp_id}")
    public Optional<Employee> findBYempid(@PathVariable int emp_id){
        return jpaService.getById(emp_id);

    }


    @PostMapping("/employee1")
    public void saveEmp(@RequestBody Employee employee){
        jpaService.saveEmployee(employee);

    }
    @DeleteMapping("/employeedel/{emp_id}")
    public void deleteEmp(@PathVariable int emp_id){
        jpaService.deleteByEmpID(emp_id);
    }




}

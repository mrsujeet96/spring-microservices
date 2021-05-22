package com.employee.service;


import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class EmployeeService {


    @Autowired
    private EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public  void saveEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public Optional<Employee> getDetails(Long emp_id){
        return employeeRepo.findById(emp_id);
    }
    public List<Employee> getAllDetails(){
        return employeeRepo.findAll();
    }


}

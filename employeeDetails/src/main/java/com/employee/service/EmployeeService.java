package com.employee.service;


import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public void saveEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

}

package com.employee.service;


import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
//    public Optional<Doc> getFile(Integer fileId) {
//        return docRepository.findById(fileId);
//    }

    public Optional<Employee> getDetails(Long id){
        return employeeRepo.findById(id);
    }


}

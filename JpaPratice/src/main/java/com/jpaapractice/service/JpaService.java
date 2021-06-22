package com.jpaapractice.service;

import com.jpaapractice.model.Employee;
import com.jpaapractice.respository.JpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JpaService {


    @Autowired
    private JpaRepo repo;

    public JpaService(JpaRepo repo) {
        this.repo = repo;
    }

    public void saveEmployee(Employee employee){
        repo.save(employee);

    }

    public List<Employee> getAllEmployee(){
        return repo.findAll();
    }
   public Optional<Employee> getById(int emp_id){
        return repo.findById(emp_id);
   }

   public void  deleteByEmpID(int emp_id){
        repo.deleteById(emp_id);
   }


}

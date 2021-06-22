package com.jpaapractice.respository;

import com.jpaapractice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepo extends JpaRepository<Employee,Integer> {


}

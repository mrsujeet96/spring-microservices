package com.employee.repository;

import com.employee.model.Dependants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DependantsRepo  extends JpaRepository<Dependants,Long> {
}

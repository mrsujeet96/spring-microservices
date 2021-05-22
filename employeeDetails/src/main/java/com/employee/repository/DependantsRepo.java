package com.employee.repository;

import com.employee.model.Dependants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependantsRepo  extends JpaRepository<Dependants,Long> {
}

package com.employee.service;

import com.employee.model.Dependants;
import com.employee.repository.DependantsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DependantsService {

    private DependantsRepo dependantsRepo;

    public DependantsService(DependantsRepo dependantsRepo) {
        this.dependantsRepo = dependantsRepo;
    }

    public void saveDependant(Dependants dependants){
        dependantsRepo.save(dependants);
    }
}

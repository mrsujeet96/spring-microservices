package com.employee.service;

import com.employee.model.Dependants;
import com.employee.repository.DependantsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DependantsService {

    @Autowired
    private DependantsRepo dependantsRepo;

    public DependantsService(DependantsRepo dependantsRepo) {
        this.dependantsRepo = dependantsRepo;
    }

    public void saveDependant(Dependants dependants){
        dependantsRepo.save(dependants);
    }

    public Optional<Dependants> getDepDetails(Long dep_id){
        return dependantsRepo.findById(dep_id);
    }

    public List<Dependants> getAllDepDetails(){
        return dependantsRepo.findAll();
    }
}

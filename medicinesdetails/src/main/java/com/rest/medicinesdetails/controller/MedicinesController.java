package com.rest.medicinesdetails.controller;

import com.rest.medicinesdetails.MedicinesNotFoundException;
import com.rest.medicinesdetails.model.Medicines;
import com.rest.medicinesdetails.repository.MediceneRepository;

import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.domain.Specification;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

@RestController
public class MedicinesController {

    @Autowired
    private MediceneRepository mediceneRepository;


   @GetMapping("/uploadCSV")
    public List<Medicines> getAllMedicines(){
        return mediceneRepository.findAll();
    }

    @GetMapping("/getMedicineDetails/{id}")
    public Medicines getNoteById(@PathVariable(value = "id") int unique_code) throws MedicinesNotFoundException {
        return mediceneRepository.findById(unique_code)
                .orElseThrow(() -> new MedicinesNotFoundException(unique_code));
    }

    @GetMapping("/searchMedicine")
    public ResponseEntity<List<Medicines>> searchForMedicine(@SearchSpec Specification<Medicines> specs) {
        return new ResponseEntity<>(mediceneRepository.findAll(Specification.where(specs)), HttpStatus.OK);
    }


    @PostMapping("/uploadCSV")
    public Medicines createNote(@Valid @RequestBody Medicines medicines) {
        return mediceneRepository.save(medicines);
    }
}

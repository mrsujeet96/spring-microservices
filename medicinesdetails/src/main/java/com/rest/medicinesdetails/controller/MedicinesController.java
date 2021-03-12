package com.rest.medicinesdetails.controller;

import com.rest.medicinesdetails.MedicinesNotFoundException;
import com.rest.medicinesdetails.model.Medicines;
import com.rest.medicinesdetails.repository.MediceneRepository;
import org.springframework.beans.factory.annotation.Autowired;

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

    @PostMapping("/uploadCSV")
    public Medicines createNote(@Valid @RequestBody Medicines medicines) {
        return mediceneRepository.save(medicines);
    }
}

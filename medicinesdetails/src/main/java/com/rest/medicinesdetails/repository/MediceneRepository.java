package com.rest.medicinesdetails.repository;

import com.rest.medicinesdetails.model.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MediceneRepository extends JpaRepository<Medicines, Integer>, JpaSpecificationExecutor<Medicines> {


    static Optional<Medicines> findOne() {
        return MediceneRepository.findOne();
    }
}

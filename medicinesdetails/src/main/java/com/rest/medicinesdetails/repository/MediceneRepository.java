package com.rest.medicinesdetails.repository;

import com.rest.medicinesdetails.model.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MediceneRepository extends JpaRepository<Medicines, Integer> {


}

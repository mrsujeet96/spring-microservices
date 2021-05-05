package com.image.repository;


import com.image.Model.Doc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository<Doc, Integer> {

}

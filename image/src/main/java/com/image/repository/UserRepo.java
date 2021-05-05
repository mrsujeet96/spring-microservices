package com.image.repository;

import com.image.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {


    User findByUsernameAndPassword(String username, String password);
}


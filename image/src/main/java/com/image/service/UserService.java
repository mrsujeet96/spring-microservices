package com.image.service;

import com.image.Model.User;
import com.image.repository.UserRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {

    private UserRepo userRepository;


    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public void saveMyUser(User user) {
        userRepository.save(user);
    }


    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

}

	
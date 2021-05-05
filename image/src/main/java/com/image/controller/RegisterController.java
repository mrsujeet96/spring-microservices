package com.image.controller;

import com.image.Model.User;
import com.image.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegisterController {

    private UserService userService;


    @GetMapping("/saveuser")
    public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age, @RequestParam String password) {
        User user = new User(username, firstname, lastname, age, password);
        userService.saveMyUser(user);
        return "User Saved";
    }
}

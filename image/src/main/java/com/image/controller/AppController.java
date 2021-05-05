package com.image.controller;


import com.image.Model.User;
import com.image.repository.UserRepo;


import com.image.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Controller
public class AppController {


    @Autowired
    private UserRepo userRepository;
    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String checkMvc() {
        return "login";
    }


    @RequestMapping("/login")
    public String loginHomePage(@RequestParam("username") String username,
                                @RequestParam("password") String password, Model model) {
        User u = null;
        try {
            u = userService.findByUsernameAndPassword(username, password);
        } catch (Exception e) {
            System.out.println("User Not Found!!!");

        }
        if (u != null) {


            model.addAttribute("username", username);
            return "homePage";
        } else {
            model.addAttribute("error", "User not found please register");
            return "login";
        }
    }

    @RequestMapping("/register")
    public String RegistrationPage() {
        return "register";
    }


    @RequestMapping("/set-user")
    public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
        userService.saveMyUser(user);
        return "login";
    }


}

package com.sujeet.rest.webservices.user;

import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDoaService service;

    @GetMapping("/users")
    public List<User> retriveAllUser() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public EntityModel<User> retriveUser(@PathVariable int id) {
        User user =service.findOne(id);
        if(user==null){
            throw new UserNotFoundException("id"+id);
        }
//        HATEOAS
        EntityModel<User> resoure=EntityModel.of(user);

        WebMvcLinkBuilder linkTo =linkTo(methodOn(this.getClass()).retriveAllUser());


        resoure.add(linkTo.withRel("all-users"));




        return resoure;


    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user =service.deleteById(id);

        if(user==null){
            throw new UserNotFoundException("id"+id);
        }


    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
        User savedUser = service.save(user);

        URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
       return ResponseEntity.created (location).build();


    }




}

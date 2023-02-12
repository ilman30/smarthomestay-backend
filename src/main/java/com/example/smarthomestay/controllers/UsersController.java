package com.example.smarthomestay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smarthomestay.impl.UsersJdbc;
import com.example.smarthomestay.models.Users;
import com.example.smarthomestay.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users-management", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UsersController {

    @Autowired
    private UserRepository userRepository;
    
    public UserRepository getRepository() {
        return userRepository;
    }

    public void setRepository(UserRepository repository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/users")
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    Users createOrSaveUser(@RequestBody Users newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users/{id}")
    Users getUserById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @PutMapping("/users/{id}")
    Users updateUser(@RequestBody Users newUsers, @PathVariable int id) {
    
        return userRepository.findById((long) id).map(users -> {
            users.setName(newUsers.getName());
            users.setPhone(newUsers.getPhone());
            return userRepository.save(users);
        }).orElseGet(() -> {
            newUsers.setId(id);
            return userRepository.save(newUsers);
          });
    }

    @DeleteMapping("/users/{id}")
    void deleteUsers(@PathVariable Long id) {
        userRepository.deleteById((long)id);
    }
    
    
}

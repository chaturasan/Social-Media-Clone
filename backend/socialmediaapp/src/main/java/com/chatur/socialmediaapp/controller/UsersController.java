package com.chatur.socialmediaapp.controller;

import java.util.List;

import com.chatur.socialmediaapp.model.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable int userId) {
        return null;
    }

    @PostMapping("/{userId}")
    public ResponseEntity<User> createUser() {
        return null;
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser() {
        return null;
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser() {
        return null;
    }
}

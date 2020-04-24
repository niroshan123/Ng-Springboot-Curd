package io.niroshan.curd.controllers;

import io.niroshan.curd.entities.User;
import io.niroshan.curd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController//This makes this class as a controller to spring boot
@RequestMapping("/api")//this class maps with url /api
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")//This allows to connect to the client side requests
public class UserController {
    @Autowired
    private UserRepository userRepository;//This controller requests implementations from UserRepository

    @GetMapping("/users")//In order to get the users
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @DeleteMapping("/user/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return true;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
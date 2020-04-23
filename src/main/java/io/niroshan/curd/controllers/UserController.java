package io.niroshan.curd.controllers;

import io.niroshan.curd.entities.User;
import io.niroshan.curd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userRepository.findById(id);
    }
    @DeleteMapping("/users/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return true;
    }

    @PostMapping("/users")
    public User createUser(User user){
        return userRepository.save(user);

    }

    @PutMapping("/users")
    public User updateUser(User user){
        return userRepository.save(user);

    }


}

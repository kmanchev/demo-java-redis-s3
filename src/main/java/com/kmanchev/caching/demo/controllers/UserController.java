package com.kmanchev.caching.demo.controllers;

import com.kmanchev.caching.demo.model.User;
import com.kmanchev.caching.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        return newUser;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
}

package com.mrshopper.project.controller;

import com.mrshopper.project.entity.User;
import com.mrshopper.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/save")
    public User saveUser(){
        return userService.save(new User(null, "stas", "konkov", "kon'", "pass", "konkov@mail.ru"));
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}

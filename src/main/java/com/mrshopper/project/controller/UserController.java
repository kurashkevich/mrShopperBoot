package com.mrshopper.project.controller;

import com.mrshopper.project.entity.User;
import com.mrshopper.project.entity.UserRole;
import com.mrshopper.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getAllUsers(){
        return userService.getAllUsers().toString();
    }

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable Long id){
        return userService.getUserById(id).toString();
    }

    @GetMapping("/save/stas")
    public User saveUserStas(){
        return userService.save(new User( "email", "firstname", "lastname'", "pass", "konkov@mail.ru"));
    }

}

package com.mrshopper.project.controller;

import com.mrshopper.project.entity.User;
import com.mrshopper.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/save/stas")
    public User saveUserStas(){
        return userService.save(new User(null, "stas", "konkov", "kon'", "pass", "konkov@mail.ru"));
    }
    @GetMapping("/save/vlad")
    public User saveUserVlad(){
        return userService.save(new User(null, "vlad", "kurash", "vlad'", "pass", "kur@mail.ru"));
    }
    @GetMapping("/save/igor")
    public User saveUserIgor(){
        return userService.save(new User(null, "igot", "tishko", "igor'", "pass", "tish@mail.ru"));
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
}

package com.mrshopper.project.service;

import com.mrshopper.project.entity.User;
import com.mrshopper.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return  userRepository.findAll();
    }
}

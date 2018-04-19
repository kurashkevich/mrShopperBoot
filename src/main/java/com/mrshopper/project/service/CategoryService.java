package com.mrshopper.project.service;

import com.mrshopper.project.entity.User;
import com.mrshopper.project.repository.CategoryRepository;
import com.mrshopper.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

}

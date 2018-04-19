package com.mrshopper.project.service;

import com.mrshopper.project.repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService {
    @Autowired
    private DetailRepository detailRepository;
}

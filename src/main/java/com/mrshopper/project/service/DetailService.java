package com.mrshopper.project.service;

import com.mrshopper.project.entity.Detail;
import com.mrshopper.project.entity.Product;
import com.mrshopper.project.repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService {
    @Autowired
    private DetailRepository detailRepository;
    public Detail getProductById(Long id){
        return detailRepository.findById(id).orElse(null);
    }

}

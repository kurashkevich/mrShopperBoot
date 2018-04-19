package com.mrshopper.project.service;

import com.mrshopper.project.entity.Product;
import com.mrshopper.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public String getProductById(Long id){
        return productRepository.findById(id).toString();
    }
}

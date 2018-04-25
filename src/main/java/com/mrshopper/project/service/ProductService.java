package com.mrshopper.project.service;

import com.mrshopper.project.entity.Detail;
import com.mrshopper.project.entity.Product;
import com.mrshopper.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ListIterator;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getProductsByManufacturer(String manufacturer){
         return productRepository.getProductsByManufacturer(manufacturer);
    }


    public Product save(Product product){
        return productRepository.save(product);
    }

    public Long deleteProduct(Long idProduct){
        return productRepository.deleteByIdProduct(idProduct);
    }

    public List<Product> getProductsByOsName(String manufacturer, String osName){
        return productRepository.getProductsByOsName(manufacturer, osName);
    }

    public List<Product> getProductsByFilter(String manufacturer, String osName, String minD, String maxD){
        return productRepository.getProductsByFilter(manufacturer, osName, minD, maxD);
    }

}

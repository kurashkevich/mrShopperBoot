package com.mrshopper.project.controller;

import com.mrshopper.project.entity.Product;
import com.mrshopper.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productsRest")
public class TestRestController {
    @Autowired
    ProductService productService;

    @GetMapping
    List<Product> getRestSearchByFilter(@RequestParam String manufacturer,@RequestParam String osName, @RequestParam String minD, @RequestParam String maxD){
        System.out.println(productService.getProductsByFilter(manufacturer, osName, minD, maxD).size());

        return productService.getProductsByFilter(manufacturer, osName, minD, maxD);
    }


}

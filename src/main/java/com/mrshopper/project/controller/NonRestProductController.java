package com.mrshopper.project.controller;

import com.mrshopper.project.entity.Detail;
import com.mrshopper.project.entity.Product;
import com.mrshopper.project.service.DetailService;
import com.mrshopper.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/nonRestProducts")
public class NonRestProductController {
    @Autowired
    ProductService productService;
    @Autowired
    DetailService detailService;

    @GetMapping
    public String getProducts(Model model){
        System.out.println("non rest product");
        model.addAttribute("products", productService.getProducts());
        return "product/main";
    }

    @Transactional
    @GetMapping("/delete")
    public String delProduct(@RequestParam Long id){
        System.out.println(id);
        productService.deleteProduct(id);
        return "product/main";
    }

    @GetMapping("/crete")
    public String addProductForm(){
        return "product/add-product-form";
    }

    @PostMapping("/create/product")
    public String addProduct(@RequestParam String manufacturer,@RequestParam Double price, @RequestParam Integer count,
                             @RequestParam String model, @RequestParam String os, @RequestParam String rom, @RequestParam String ram,
                             @RequestParam String screenSize, @RequestParam String description){
        Detail detail = new Detail();
        detail.setModel(model);
        detail.setOs(os);
        detail.setRom(rom);
        detail.setRam(ram);
        detail.setScreenSize(screenSize);
        detail.setDescription(description);

        detailService.save(detail);

        Product product = new Product();
        //product.setIdProduct(idProduct);
        product.setManufacturer(manufacturer);
        product.setPrice(price);
        product.setCount(count);
        product.setDetail(detail);
        productService.save(product);
        return "product/main";
    }
}

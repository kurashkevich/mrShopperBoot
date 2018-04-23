package com.mrshopper.project.repository;

import com.mrshopper.project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getProductsByManufacturer(String manufacturer);
    List<Product> findAllByDetailOs(String os);
    List<Product> findAllByDetailOsAndPriceBetween(String os, double a, double b);
    Long deleteByIdProduct(Long idProduct);
}

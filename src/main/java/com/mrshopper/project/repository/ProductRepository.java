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
    Long deleteByIdProduct(Long idProduct);

    @Query("select p from Product p join p.detail d" +
            " where upper(p.manufacturer)  = upper(:manufacturer)  and upper(d.os)  = upper(:os) ")
    List<Product>  getProductsByOsName(@Param("manufacturer") String manufacturer,@Param("os") String osName);

    @Query("select p from Product p join p.detail d" +
            " where  UPPER(p.manufacturer) = UPPER(:manufacturer)and upper(d.os)  = upper(:os)  " +
            "and d.screenSize between :minDiagonal and :maxDiagonal")
    List<Product>  getProductsByFilter(@Param("manufacturer") String manufacturer,@Param("os") String osName,
                                       @Param("minDiagonal") String minD, @Param("maxDiagonal") String maxD);
}

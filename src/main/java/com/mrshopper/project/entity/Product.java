package com.mrshopper.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    //category id
    @Column
    private Integer count; // количество на складе
    @Column
    private Double price;
    @Column
    private String manufacturer;
    @Column
    private Date developedDate; //дата изготовления

    @ManyToOne
    private Order order;

    @ManyToOne
    private Category category;
}

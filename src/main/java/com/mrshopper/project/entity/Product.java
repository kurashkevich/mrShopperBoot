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
    private Long idProduct;
    @Column
    private Integer count; // количество на складе
    @Column
    private Double price;
    @Column
    private String manufacturer;
    @Column
    private Date developedDate; //дата изготовления

    @ManyToOne
    @JoinColumn(name = "idOrder")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", count=" + count +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", developedDate=" + developedDate +
                ", category=" + category.getCategoryName()  +
                '}';
    }
}

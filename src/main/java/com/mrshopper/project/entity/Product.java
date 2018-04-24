package com.mrshopper.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @JsonIgnore
    private Order order;

    @ManyToOne
    @JoinColumn(name = "idDetail")
    @JsonIgnore
    private Detail detail;

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", count=" + count +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", developedDate=" + developedDate +
                '}';
    }

    public Product(Integer count, Double price, String manufacturer) {
        this.count = count;
        this.price = price;
        this.manufacturer = manufacturer;
    }
}

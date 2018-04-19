package com.mrshopper.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="`Order`")
public class Order implements Serializable{
    @Id
    @GeneratedValue
    private Long idOrder;
    @Column
    private Double finalAmount;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "order")
    private List<Product> product;

}

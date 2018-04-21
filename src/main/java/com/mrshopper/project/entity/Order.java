package com.mrshopper.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="`order`")
public class Order implements Serializable{
    @Id
    @GeneratedValue
    private Long idOrder;
    @Column
    private Double finalAmount;

    @ManyToOne
    @JoinColumn(name = "idUser")
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "order")
    @JsonIgnore
    private List<Product> product;

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", finalAmount=" + finalAmount +
                '}';
    }
}

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
public class Category implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    @ManyToOne
    private Detail detail;
}

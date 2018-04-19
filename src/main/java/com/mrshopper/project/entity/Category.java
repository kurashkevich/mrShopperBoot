package com.mrshopper.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



/*
 * Между категорией и деталью, связь многие ко многим, так как у одной детали(экран 5 дюймов)
 * может быть несколько категорий (телефон, электронная книга, планшет)
 * У одной категории, есть несколько деталей (экран, ОС, вес, толщина)
 * */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category implements Serializable{
    @Id
    @GeneratedValue
    private Long idCategory;
    @Column
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

   /* @ManyToOne
    @JoinColumn(name = "idDetail")
    private Detail detail;*/

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Category_Detail", joinColumns = {@JoinColumn(name = "idCategory")},
            inverseJoinColumns = {@JoinColumn(name = "idDetail")})
    private List<Detail> details = new ArrayList<>();


}

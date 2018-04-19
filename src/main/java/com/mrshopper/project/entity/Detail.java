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
public class Detail implements Serializable {
    @Id
    @GeneratedValue
    private Long idDetail;
    @Column
    private String name;
    @Column
    private String unit;   // единицы измерения
    @Column
    private String description;

    @OneToMany(mappedBy = "detail")
    private List<Category> categoryList;


}

package com.mrshopper.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Detail implements Serializable {
    @Id
    @GeneratedValue
    private Long idDetail;
    private String model; //iphone 8
    private String os; //ios
    private String rom;
    private String ram;
    private String screenSize;
    private String description;

    @OneToMany(mappedBy = "detail")
    private List<Product> products;

    @Override
    public String toString() {
        return "Detail{" +
                "idDetail=" + idDetail +
                ", model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", rom='" + rom + '\'' +
                ", ram='" + ram + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", description='" + description + '\'' +
                ", products=" + products.size() +
                '}';
    }
}

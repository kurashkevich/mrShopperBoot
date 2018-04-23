package com.mrshopper.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
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
    @JsonIgnore
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
                ", products.json=" + products.size() +
                '}';
    }

    public Detail(String model, String os, String rom, String ram, String screenSize, String description) {
        this.model = model;
        this.os = os;
        this.rom = rom;
        this.ram = ram;
        this.screenSize = screenSize;
        this.description = description;
    }
}

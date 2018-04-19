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
public class UserRole implements Serializable{
    @Id
    @GeneratedValue
    private Long idUserRole;
    @Column
    private String role;

    @OneToMany(mappedBy = "userRole")
    private List<User> users;
}

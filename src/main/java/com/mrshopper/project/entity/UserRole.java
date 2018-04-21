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
public class UserRole implements Serializable{
    @Id
    @GeneratedValue
    private Long idUserRole;
    @Column
    private String role;

    @OneToMany(mappedBy = "userRole")
    @JsonIgnore
    private List<User> users;

    @Override
    public String toString() {
        return "UserRole{" +
                "idUserRole=" + idUserRole +
                ", role='" + role + '\'' +
                '}';
    }
}

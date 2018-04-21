package com.mrshopper.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long idUser;
    private String email;
    private String firstName;
    private String lastName;
    private String login;
    private String password;


    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Order> orders = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "idUserRole")
    @JsonIgnore
    private UserRole userRole;

    public User(String email, String firstName, String lastName, String login, String password ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

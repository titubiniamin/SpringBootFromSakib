package com.mles.tutorial.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;
@Getter
@Setter
@Table(name="employees")
@Entity
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id",nullable=false)
    private Long id;

    @Column(name="email")
    private String email;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

}

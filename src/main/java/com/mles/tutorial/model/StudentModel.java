package com.mles.tutorial.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="student")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;

    @Column(name="name",nullable=false)
    private String name;

    @Column(name="address", nullable=false)
    private String address;

    @ManyToOne
    @JoinColumn(name = "student_class_id")
    private StudentClass studentClass;

}

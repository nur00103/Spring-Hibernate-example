package com.spring.hibernate.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name",length = 25)
    private String name;

    @Column(length = 25)
    private String surname;

    private int age;

    private double salary;


}

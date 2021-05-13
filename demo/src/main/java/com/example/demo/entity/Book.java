package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Entity
//@NoArgsConstructor
//@Data
//@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;

    @Column(nullable = false,unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

}

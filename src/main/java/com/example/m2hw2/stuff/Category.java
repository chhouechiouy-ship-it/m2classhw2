package com.example.m2hw2.stuff;

import jakarta.persistence.*;
import lombok.Data; // Requires Lombok plugin

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String icon;

    @Column(nullable = false)
    private Boolean isDeleted = false;

    @Column(nullable = false, length = 50)
    private String name;
}
package com.example.m2hw2.stuff;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer countRating;
    private LocalDateTime createdAt;

    @Column(length = 255)
    private String description;

    private Float discountPercent;
    private Boolean isDeleted = false;
    private Boolean isPublished = false;

    @Column(length = 255)
    private String keyword;

    @Column(length = 255)
    private String level;

    @Column(precision = 38, scale = 2)
    private BigDecimal price;

    @Column(length = 255)
    private String slug;

    private Float starRating;

    @Column(length = 255)
    private String thumbnail;

    @Column(length = 255)
    private String title;

    private Float totalHours;
    private LocalDateTime updatedAt;

    // Foreign Keys
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructor;
}
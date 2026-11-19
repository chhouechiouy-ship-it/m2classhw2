package com.example.m2hw2.stuff;

import jakarta.persistence.*;
import lombok.*;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String duration;

    private Boolean isDeleted = false;
    private Boolean isPublished = false;

    @Column(length = 255)
    private String slug;

    @Column(length = 255)
    private String thumbnail;

    @Column(length = 255)
    private String title;

    @Column(length = 255)
    private String youtube;

    // Foreign Key to Course
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;
}

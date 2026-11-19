package com.example.m2hw2.stuff;

import jakarta.persistence.*;
import lombok.*;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student_profiles")
public class StudentProfile {
    @Id
    @Column(name = "user_id", nullable = false, length = 255)
    private String userId;

    @Column(length = 255)
    private String biography;

    @Column(length = 255)
    private String facebookLink;

    @Column(length = 255)
    private String githubLink;

    @Column(length = 255)
    private String major;

    @Column(length = 255)
    private String phoneNumber;

    @Column(length = 255)
    private String university;
}
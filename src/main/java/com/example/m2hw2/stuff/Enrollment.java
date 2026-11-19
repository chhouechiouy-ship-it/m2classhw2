package com.example.m2hw2.stuff;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime enrolledAt;
    private LocalDateTime paymentAt;

    @Column(length = 255)
    private String paymentMethod;

    private Boolean paymentStatus = false;

    // Foreign Key to Course
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    // Foreign Key to StudentProfile (String ID)
    @Column(name = "student_id", length = 255)
    private String studentId;
}
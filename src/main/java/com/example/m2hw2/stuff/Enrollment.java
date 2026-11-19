package com.example.m2hw2.stuff;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "enrollments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "enrolled_at", columnDefinition = "timestamp(6)")
    private LocalDateTime enrolledAt;

    @Column(name = "payment_at", columnDefinition = "timestamp(6)")
    private LocalDateTime paymentAt;

    @Column(name = "payment_method", length = 255)
    private String paymentMethod;

    @Column(name = "payment_status")
    private Boolean paymentStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private StudentProfile student;
}

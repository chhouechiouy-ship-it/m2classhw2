package com.example.m2hw2.stuff;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "count_rating")
    private Integer countRating;

    @Column(name = "created_at", columnDefinition = "timestamp(6)")
    private LocalDateTime createdAt;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "discount_percent")
    private Float discountPercent;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "is_published")
    private Boolean isPublished;

    @Column(name = "keyword", length = 255)
    private String keyword;

    @Column(name = "level", length = 255)
    private String level;

    @Column(name = "price", precision = 38, scale = 2)
    private BigDecimal price;

    @Column(name = "slug", length = 255)
    private String slug;

    @Column(name = "star_rating")
    private Float starRating;

    @Column(name = "thumbnail", length = 255)
    private String thumbnail;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "total_hours")
    private Float totalHours;

    @Column(name = "updated_at", columnDefinition = "timestamp(6)")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructor;
}

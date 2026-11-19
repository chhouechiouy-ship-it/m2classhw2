package com.example.m2hw2.stuff;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "instructor_profiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InstructorProfile {

    @Id
    @Column(name = "user_id", nullable = false, length = 255)
    private String userId;

    @Column(name = "biography", length = 255)
    private String biography;

    @Column(name = "facebook_link", length = 255)
    private String facebookLink;

    @Column(name = "github_link", length = 255)
    private String githubLink;

    @Column(name = "job_title", length = 255)
    private String jobTitle;

    @Column(name = "phone_number", length = 255)
    private String phoneNumber;
}

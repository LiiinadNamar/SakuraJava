package com.example.laba.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotBlank(message = "Title must not be blank")
    private String title;

    @Size(max = 500, message = "Description must be at most 500 characters")
    private String description;

    private LocalDateTime createdAt = LocalDateTime.now();
}

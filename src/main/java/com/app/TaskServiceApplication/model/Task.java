package com.app.TaskServiceApplication.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.*;

@Entity
@Data
@Table(name="app_task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
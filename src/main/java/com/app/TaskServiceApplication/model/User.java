package com.app.TaskServiceApplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

}
package com.app.TaskServiceApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.TaskServiceApplication.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
package com.app.TaskServiceApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.TaskServiceApplication.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);
}

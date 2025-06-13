package com.app.TaskServiceApplication.service;

import org.springframework.stereotype.Service;

import com.app.TaskServiceApplication.model.User;
import com.app.TaskServiceApplication.repo.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User saveUser(User user) {
    	return userRepository.save(user);
    }
}

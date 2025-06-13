package com.app.TaskServiceApplication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.TaskServiceApplication.model.User;
import com.app.TaskServiceApplication.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	UserService userService;
	
	public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}

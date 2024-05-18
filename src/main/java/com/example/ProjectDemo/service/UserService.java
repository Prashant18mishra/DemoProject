package com.example.ProjectDemo.service;

import com.example.ProjectDemo.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();
}
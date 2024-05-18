package com.example.ProjectDemo.repository;

import com.example.ProjectDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

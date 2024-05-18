package com.example.ProjectDemo.Service;

import com.example.ProjectDemo.entity.User;
import com.example.ProjectDemo.repository.UserRepository;
import com.example.ProjectDemo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateUser() {
        User user = new User();
        user.setUsername("testUser");
        user.setPassword("password");
        user.setEmail("test@example.com");

        when(userRepository.save(any(User.class))).thenReturn(user);

    }
}

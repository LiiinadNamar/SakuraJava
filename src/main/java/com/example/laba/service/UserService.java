package com.example.laba.service;

import com.example.laba.model.User;
import com.example.laba.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User authenticateUser(String email, String password) {
        return userRepository.findByEmail(email)
            .filter(u -> u.getPassword().equals(password)) 
            .orElse(null);
    }
}

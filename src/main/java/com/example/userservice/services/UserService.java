package com.example.userservice.services;

import com.example.userservice.models.User;
import com.example.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        // Ensure the user doesn't already have an ID (to avoid accidental updates)
        user.setId(null);
        return userRepository.save(user);
    }

    public User updateUser(Long id, User updatedUser) {
        // Load existing user from DB
        User existingUser = userRepository.findById(String.valueOf(id))
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));

        // Update fields
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());

        return userRepository.save(existingUser);
    }
}

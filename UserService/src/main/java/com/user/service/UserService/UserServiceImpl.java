package com.user.service.UserService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.Exception.ResourceNotFoundException;
import com.user.service.Repository.UserRepository;
import com.user.service.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserID = UUID.randomUUID().toString();
        user.setUserId(randomUserID); // Generate a random UUID for the user ID
        userRepository.save(user); // Save the user entity to the database
        return user; // Return the saved user entity
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = userRepository.findAll(); // Retrieve all users from the database
        return users; // Return the list of users
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId)
                             .orElseThrow(() -> new ResourceNotFoundException("User with id " + userId + " not found")); // Find user by ID or throw ResourceNotFoundException if not found
    }

    @Override
    public List<User> saveAllUser(List<User> users) {
        return userRepository.saveAll(users); // Save all users provided in the list to the database
    }

}

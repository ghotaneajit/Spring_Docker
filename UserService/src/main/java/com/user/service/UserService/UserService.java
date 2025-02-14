package com.user.service.UserService;

import java.util.List;
import com.user.service.entity.User;

public interface UserService {
    
    // Save a single user
    User saveUser(User user);
    
    // Get all users
    List<User> getAllUser();
    
    // Get a single user by userId
    User getUser(String userId);

    // Save a list of users
    List<User> saveAllUser(List<User> users);
    
}

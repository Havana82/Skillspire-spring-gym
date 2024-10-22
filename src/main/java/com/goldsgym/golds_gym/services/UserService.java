package com.goldsgym.golds_gym.services;

import com.goldsgym.golds_gym.models.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
    User updateUserLastNameById(int id, String lastName);
    String deleteUserById(int id);
}

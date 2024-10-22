package com.goldsgym.golds_gym.services.impl;

import com.goldsgym.golds_gym.models.User;
import com.goldsgym.golds_gym.repositories.UserRepository;
import com.goldsgym.golds_gym.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User updateUserLastNameById(int id, String lastName) {
        return null;
    }

    @Override
    public String deleteUserById(int id) {
        return "";
    }
}

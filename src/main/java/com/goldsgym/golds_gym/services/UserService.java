package com.goldsgym.golds_gym.services;

import com.goldsgym.golds_gym.dto.UserDto;
import com.goldsgym.golds_gym.models.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    User getUserById(int id);
    List<User> getAllUsers();
    User updateUserLastNameById(int id, String lastName);
    String deleteUserById(int id);
}

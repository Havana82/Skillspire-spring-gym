package com.goldsgym.golds_gym.services;

import com.goldsgym.golds_gym.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(int id);
    List<UserDto> getAllUsers();
    UserDto updateUserLastNameById(int id, String lastName);
    String deleteUserById(int id);
}

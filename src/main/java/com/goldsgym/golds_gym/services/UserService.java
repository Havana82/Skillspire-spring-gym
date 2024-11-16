package com.goldsgym.golds_gym.services;

import com.goldsgym.golds_gym.dto.UserDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(int id);
    List<UserDto> getAllUsers();
    List<UserDto> getUsersByGymId(int gymId);
    UserDto updateUserAddressById(int id, String lastName);
    String deleteUserById(int id);
}

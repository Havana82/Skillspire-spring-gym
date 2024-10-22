package com.goldsgym.golds_gym.services.impl;

import com.goldsgym.golds_gym.dto.UserDto;
import com.goldsgym.golds_gym.mapper.UserMapper;
import com.goldsgym.golds_gym.models.User;
import com.goldsgym.golds_gym.repositories.UserRepository;
import com.goldsgym.golds_gym.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return userMapper.mapToUserDto(savedUser);
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

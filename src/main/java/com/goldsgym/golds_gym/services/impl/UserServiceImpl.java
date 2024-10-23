package com.goldsgym.golds_gym.services.impl;

import com.goldsgym.golds_gym.dto.UserDto;
import com.goldsgym.golds_gym.mapper.UserMapper;
import com.goldsgym.golds_gym.models.User;
import com.goldsgym.golds_gym.repositories.UserRepository;
import com.goldsgym.golds_gym.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return userMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(int id) {
        User user = userRepository.
                findById(id).
                orElseThrow(() -> new RuntimeException("User Id doesnt exist"));
        return userMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserDto updateUserAddressById(int id, String address) {
        User user = userRepository.
                findById(id).
                orElseThrow(() -> new RuntimeException("User Id doesnt exist"));
        user.setAddress(address);
        User savedProduct = userRepository.save(user);
        return userMapper.mapToUserDto(savedProduct);
    }

    @Override
    public String deleteUserById(int id) {
        return "";
    }
}

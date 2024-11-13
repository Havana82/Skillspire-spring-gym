package com.goldsgym.golds_gym.mapper;

import com.goldsgym.golds_gym.dto.UserDto;
import com.goldsgym.golds_gym.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    // Convert DTO object into a Entity object
    public User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getAddress(),
                userDto.getGymId()
        );
        return user;
    }

    // Convert a Entity object into a DTO object
    public UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getAddress(),
                user.getGym_id()
        );
        return userDto;
    }
}


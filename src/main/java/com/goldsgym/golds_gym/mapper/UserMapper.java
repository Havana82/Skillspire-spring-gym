package com.goldsgym.golds_gym.mapper;

import com.goldsgym.golds_gym.dto.UserDto;
import com.goldsgym.golds_gym.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getAddress()
        );
        return user;
    }
}


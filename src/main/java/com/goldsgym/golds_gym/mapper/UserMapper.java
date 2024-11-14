package com.goldsgym.golds_gym.mapper;

import com.goldsgym.golds_gym.dto.UserDto;
import com.goldsgym.golds_gym.models.Gym;
import com.goldsgym.golds_gym.models.User;
import com.goldsgym.golds_gym.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    @Autowired
    private GymService gymService;
    @Autowired
    private GymMapper gymMapper;
    // Convert DTO object into a Entity object
    public User mapToUser(UserDto userDto){
        Gym gymFromDb = gymMapper.mapToGym(gymService.getGymById(userDto.getGymId()));
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getAddress(),
                gymFromDb
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
                user.getGym_id().getId()
        );
        return userDto;
    }
}


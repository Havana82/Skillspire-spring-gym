package com.goldsgym.golds_gym.dto;

import com.goldsgym.golds_gym.models.Gym;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private int gymId;
}
//

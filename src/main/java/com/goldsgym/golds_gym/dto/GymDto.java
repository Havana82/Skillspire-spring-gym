package com.goldsgym.golds_gym.dto;


import com.goldsgym.golds_gym.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class GymDto {
    private int id;
    private String address;
    private String managerName;

}

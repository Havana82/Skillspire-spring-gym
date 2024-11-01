package com.goldsgym.golds_gym.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GymDto {
    private int id;
    private String address;
    private String managerName;
}

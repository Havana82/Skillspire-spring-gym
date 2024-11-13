package com.goldsgym.golds_gym.mapper;

import com.goldsgym.golds_gym.dto.GymDto;
import com.goldsgym.golds_gym.models.Gym;
import org.springframework.stereotype.Component;

@Component
public class GymMapper {

    public Gym mapToGym(GymDto gymDto){
        Gym gym = new Gym(
                gymDto.getId(),
                gymDto.getAddress(),
                gymDto.getManagerName(),
                gymDto.getUsers()

        );
        return gym;
    }


    public GymDto mapToGymDto(Gym gym){
        GymDto gymDto = new GymDto(
                gym.getId(),
                gym.getAddress(),
                gym.getManagerName(),
                gym.getUsers()

        );
        return gymDto;
    }
}


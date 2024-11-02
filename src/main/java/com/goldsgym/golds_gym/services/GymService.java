package com.goldsgym.golds_gym.services;
import com.goldsgym.golds_gym.dto.GymDto;

import java.util.List;

public interface GymService {
    GymDto createGym(GymDto gymDto);
    GymDto getGymById(int id);
    List<GymDto> getAllGyms();
    GymDto updateGymById(int id, GymDto gymDto);
    String deleteGymById(int id);
}

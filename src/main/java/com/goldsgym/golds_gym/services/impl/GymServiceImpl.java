package com.goldsgym.golds_gym.services.impl;

import com.goldsgym.golds_gym.dto.GymDto;
import com.goldsgym.golds_gym.models.User;
import com.goldsgym.golds_gym.services.GymService;

import java.util.List;

import com.goldsgym.golds_gym.mapper.GymMapper;
import com.goldsgym.golds_gym.models.Gym;
import com.goldsgym.golds_gym.repositories.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GymServiceImpl implements GymService {

    @Autowired
    private GymRepository gymRepository;

    @Autowired
    private GymMapper gymMapper;

    @Override
    public GymDto createGym(GymDto gymDto) {
        Gym gym = gymMapper.mapToGym(gymDto);
        Gym savedGym = gymRepository.save(gym);
        return gymMapper.mapToGymDto(savedGym);
    }

    @Override
    public GymDto getGymById(int id) {
        return null;
    }

    @Override
    public List<GymDto> getAllGyms() {
        return List.of();
    }

    @Override
    public GymDto updateGymById(int id, GymDto gymDto) {
        return null;
    }

    @Override
    public String deleteGymById(int id) {
        return "";
    }
}

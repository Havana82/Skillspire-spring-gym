package com.goldsgym.golds_gym.services.impl;

import com.goldsgym.golds_gym.dto.GymDto;
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
        Gym gym = gymRepository.
                findById(id).
                orElseThrow(() -> new RuntimeException("Gym Id doesnt exist"));
        return gymMapper.mapToGymDto(gym);
    }

    @Override
    public List<GymDto> getAllGyms() {
        List<Gym> gyms = gymRepository.findAll();
        List<GymDto> gymDtos = gyms.stream().map(gymMapper::mapToGymDto)
                .collect(Collectors.toList());

        return gymDtos;
    }

    @Override
    public GymDto updateGymById(int id, GymDto gymDto) {
        Gym gym = gymRepository.
                findById(id).
                orElseThrow( () -> new RuntimeException("Gym of this ID does not exist") );


       gym.setAddress(gymDto.getAddress());
       gym.setManagerName(gymDto.getManagerName());

       Gym savedGym = gymRepository.save(gym);

        return gymMapper.mapToGymDto(savedGym);
    }

    @Override
    public String deleteGymById(int id) {

        if (gymRepository.existsById(id)) {
            gymRepository.deleteById(id);
            return "Successfully deleted gym " + id;
        }
        else {
            return "No record of that ID found.";
        }
    }
}

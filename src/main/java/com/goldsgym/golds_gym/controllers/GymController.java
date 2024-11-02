package com.goldsgym.golds_gym.controllers;

import com.goldsgym.golds_gym.dto.GymDto;
import com.goldsgym.golds_gym.services.GymService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gym")
public class GymController {
    private GymService gymService;

    public GymController(GymService gymService) {
        this.gymService = gymService;
    }

    @PostMapping
    public ResponseEntity<GymDto> addGym(@RequestBody GymDto gymDto){
        return new ResponseEntity<>(gymService.createGym(gymDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GymDto> getGymById(@PathVariable int id ){
        GymDto gymDto = gymService.getGymById(id);
        return ResponseEntity.ok(gymDto);
    }

    @GetMapping
    public ResponseEntity<List<GymDto>> getAllGyms() {
        List<GymDto> gymDtos = gymService.getAllGyms();
        return ResponseEntity.ok(gymDtos);
    }

    @PutMapping("{id}")
    public ResponseEntity<GymDto> updateGymById(@PathVariable int id, @RequestBody GymDto gymDto) {
        GymDto updatedGymDto = gymService.updateGymById(id, gymDto);
        return ResponseEntity.ok(updatedGymDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteGymById(@PathVariable int id) {
        String response = gymService.deleteGymById(id);
        return ResponseEntity.ok(response);
    }
}

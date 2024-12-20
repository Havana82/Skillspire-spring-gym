package com.goldsgym.golds_gym.controllers;

import com.goldsgym.golds_gym.dto.UserDto;
import com.goldsgym.golds_gym.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
       return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable int id ){
        UserDto userDto = userService.getUserById(id);
        return ResponseEntity.ok(userDto);
    }
    @GetMapping("/gym/{gym_id}")
    public ResponseEntity<List<UserDto>> getUsersByGymId(@PathVariable int gymId){
        return ResponseEntity.ok(userService.getUsersByGymId(gymId));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> userDtos = userService.getAllUsers();
        return ResponseEntity.ok(userDtos);
    }

    @PutMapping("{id}/address")
    public ResponseEntity<UserDto> updateUserAddressById(@PathVariable int id, @RequestBody Map<String, String> request){
        String updatedAddress = request.get("address");
        UserDto userDto = userService.updateUserAddressById(id, updatedAddress);
        return ResponseEntity.ok(userDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable int id) {
        String response = userService.deleteUserById(id);
        return ResponseEntity.ok(response);
    }
}

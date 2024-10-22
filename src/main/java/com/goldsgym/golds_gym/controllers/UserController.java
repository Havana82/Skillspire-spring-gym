package com.goldsgym.golds_gym.controllers;

import com.goldsgym.golds_gym.dto.UserDto;
import com.goldsgym.golds_gym.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}

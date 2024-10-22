package com.goldsgym.golds_gym.controllers;

import com.goldsgym.golds_gym.dto.UserDto;
import com.goldsgym.golds_gym.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(UserDto userDto){
       userService.createUser(userDto);
    }
}

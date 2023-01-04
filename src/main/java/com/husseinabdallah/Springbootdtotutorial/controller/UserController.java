package com.husseinabdallah.Springbootdtotutorial.controller;

import com.husseinabdallah.Springbootdtotutorial.dto.UserLocationDTO;
import com.husseinabdallah.Springbootdtotutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }
}

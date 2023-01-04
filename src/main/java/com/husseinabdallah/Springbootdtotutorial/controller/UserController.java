package com.husseinabdallah.Springbootdtotutorial.controller;

import com.husseinabdallah.Springbootdtotutorial.dto.UserLocationDTO;
import com.husseinabdallah.Springbootdtotutorial.model.User;
import com.husseinabdallah.Springbootdtotutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add-user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User addUser(@RequestBody User user){
        System.out.println(user);
        return userService.addUser(user);
    }

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }
}

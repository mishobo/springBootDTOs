package com.husseinabdallah.Springbootdtotutorial.service;

import com.husseinabdallah.Springbootdtotutorial.dto.UserLocationDTO;
import com.husseinabdallah.Springbootdtotutorial.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepository {

    @Autowired
    private UserRepository userRepository;

    public UserLocationDTO convertingEntityToDTO(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;
    }

}

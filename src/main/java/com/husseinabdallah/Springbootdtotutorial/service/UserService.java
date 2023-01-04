package com.husseinabdallah.Springbootdtotutorial.service;

import com.husseinabdallah.Springbootdtotutorial.dto.UserLocationDTO;
import com.husseinabdallah.Springbootdtotutorial.model.User;
import com.husseinabdallah.Springbootdtotutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::convertingEntityToDTO)
                .collect(Collectors.toList());
    }

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

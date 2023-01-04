package com.husseinabdallah.Springbootdtotutorial;

import com.husseinabdallah.Springbootdtotutorial.model.Location;
import com.husseinabdallah.Springbootdtotutorial.model.User;
import com.husseinabdallah.Springbootdtotutorial.repository.LocationRepository;
import com.husseinabdallah.Springbootdtotutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoTutorialApplication.class, args);
	}



}

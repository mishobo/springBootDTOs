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
public class SpringbootDtoTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoTutorialApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location1 = new Location();
		location1.setPlace("Kabiria");
		location1.setDescription("Kabiria is a great place to live");
		location1.setLongitude(40.5);
		location1.setLongitude(30.6);
		locationRepository.save(location1);


		User user1 = new User();
		user1.setFirstName("Hussein");
		user1.setLastName("Mishobo");
		user1.setEmail("husseinabdallah@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location1);
		userRepository.save(user1);

		Location location2 = new Location();
		location2.setPlace("Kabiria");
		location2.setDescription("Kabiria is a great place to live");
		location2.setLongitude(40.5);
		location2.setLongitude(30.6);
		locationRepository.save(location2);

		User user2 = new User();
		user2.setFirstName("Eric");
		user2.setLastName("Ngari");
		user2.setEmail("leopardngari@gmail.com");
		user2.setPassword("secret2");
		user2.setLocation(location2);
		userRepository.save(user2);
	}
}

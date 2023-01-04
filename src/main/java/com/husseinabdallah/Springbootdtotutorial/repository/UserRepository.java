package com.husseinabdallah.Springbootdtotutorial.repository;

import com.husseinabdallah.Springbootdtotutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.husseinabdallah.Springbootdtotutorial.repository;

import com.husseinabdallah.Springbootdtotutorial.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}

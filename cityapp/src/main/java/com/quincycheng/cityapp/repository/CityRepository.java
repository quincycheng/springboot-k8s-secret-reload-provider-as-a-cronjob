package com.quincycheng.cityapp.repository;

import com.quincycheng.cityapp.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}

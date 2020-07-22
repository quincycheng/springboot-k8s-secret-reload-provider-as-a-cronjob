package com.quincycheng.cityapp.repository;

import com.quincycheng.cityapp.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}

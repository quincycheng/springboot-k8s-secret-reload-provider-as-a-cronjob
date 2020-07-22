package com.quincycheng.cityapp.repository;

import com.quincycheng.cityapp.entity.CountryLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {
}

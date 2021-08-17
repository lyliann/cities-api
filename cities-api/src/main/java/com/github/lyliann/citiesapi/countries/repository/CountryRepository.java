package com.github.lyliann.citiesapi.countries.repository;

import com.github.lyliann.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

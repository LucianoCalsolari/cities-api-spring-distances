package com.github.lucianocalsolari.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.lucianocalsolari.citiesapi.countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
	
}

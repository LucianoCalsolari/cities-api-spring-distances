package com.github.lucianocalsolari.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.lucianocalsolari.citiesapi.states.State;


public interface StateRepository extends JpaRepository<State, Long> {
	
}

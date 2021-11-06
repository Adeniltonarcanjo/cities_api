package com.github.adeniltonarcanjo.citiesapi.cities.repository;
import com.github.adeniltonarcanjo.citiesapi.cities.City;
import com.github.adeniltonarcanjo.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

}

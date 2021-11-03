package com.github.adeniltonarcanjo.citiesapi.reposytory;

import com.github.adeniltonarcanjo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {

}

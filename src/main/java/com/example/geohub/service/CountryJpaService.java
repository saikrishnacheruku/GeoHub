

package com.example.geohub.service;/*
                                   *
                                   * You can use the following import statements
                                   * 
                                   * import org.springframework.beans.factory.annotation.Autowired;
                                   * import org.springframework.http.HttpStatus;
                                   * import org.springframework.stereotype.Service;
                                   * import org.springframework.web.server.ResponseStatusException;
                                   * import java.util.ArrayList;
                                   * import java.util.List;
                                   * 
                                   */

// Write your code here

import com.example.geohub.model.Country;
import com.example.geohub.repository.CountryJpaRepository;
import com.example.geohub.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CountryJpaService implements CountryRepository {

    @Autowired
    private CountryJpaRepository countryJpaRepository;

    @Override
    public List<Country> getCountries() {
        return countryJpaRepository.findAll();
    }

    @Override
    public Country getCountryById(int countryId) {
        try {
            Country country = countryJpaRepository.findById(countryId).get();
            return country;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Country addCountry(Country country) {
        return countryJpaRepository.save(country);
    }

    @Override
    public Country updateCountry(int countryId, Country country) {
        try {
            Country newCountry = countryJpaRepository.findById(countryId).get();

            if (country.getCountryName() != null) {
                newCountry.setCountryName(country.getCountryName());

            }
            countryJpaRepository.save(newCountry);
            return newCountry;

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void deleteCountry(int countryId) {
        try {
            countryJpaRepository.deleteById(countryId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }

}


package com.example.geohub.controller;/*
                                      *
                                      * You can use the following import statements
                                      * 
                                      * import org.springframework.beans.factory.annotation.Autowired;
                                      * import org.springframework.web.bind.annotation.*;
                                      * import java.util.ArrayList;
                                      * 
                                      */

// Write your code here

import java.util.*;
import com.example.geohub.model.Country;
import com.example.geohub.service.CountryJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryJpaService countryJpaService;

    @GetMapping("/countries")

    public List<Country> getCountries() {

        return countryJpaService.getCountries();

    }

    @GetMapping("/countries/{countryId}")
    public Country getCountryById(@PathVariable int countryId) {
        return countryJpaService.getCountryById(countryId);
    }

    @PostMapping("/countries")
    public Country addCountry(@RequestBody Country country) {
        return countryJpaService.addCountry(country);
    }

    @PutMapping("/countries/{countryId}")
    public Country updateCountry(@PathVariable int countryId, @RequestBody Country country) {
        return countryJpaService.updateCountry(countryId, country);
    }

    @DeleteMapping("/countries/{countryId}")
    public void deleteCountry(@PathVariable int countryId) {
        countryJpaService.deleteCountry(countryId);
    }

}

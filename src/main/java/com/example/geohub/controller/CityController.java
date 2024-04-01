

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

import com.example.geohub.model.City;
import com.example.geohub.model.Country;
import com.example.geohub.service.CityJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityJpaService cityJpaService;

    @GetMapping("/countries/cities")
    public List<City> getCities() {
        return cityJpaService.getCities();

    }

    @GetMapping("/countries/cities/{cityId}")
    public City getCityById(@PathVariable int cityId) {
        return cityJpaService.getCityById(cityId);
    }

    @PostMapping("/countries/cities")
    public City addCity(@RequestBody City city) {
        return cityJpaService.addCity(city);
    }

    @PutMapping("/countries/cities/{cityId}")
    public City updateCity(@PathVariable int cityId, @RequestBody City city) {
        return cityJpaService.updateCity(cityId, city);
    }

    @DeleteMapping("/countries/cities/{cityId}")

    public void deleteCity(@PathVariable int cityId) {
        cityJpaService.deleteCity(cityId);
    }

    @GetMapping("/cities/{cityId}/country")

    public Country getCountryByCityId(@PathVariable int cityId) {
        return cityJpaService.getCountryByCityId(cityId);
    }

}



package com.example.geohub.repository;/*
                                      *
                                      * You can use the following import statements
                                      * 
                                      * java.util.ArrayList;
                                      * 
                                      */

// Write your code here

import com.example.geohub.model.City;
import com.example.geohub.model.Country;

import java.util.List;

public interface CityRepository {
    List<City> getCities();

    City getCityById(int cityId);

    City addCity(City city);

    City updateCity(int cityId, City city);

    void deleteCity(int cityId);

    Country getCountryByCityId(int cityId);
}
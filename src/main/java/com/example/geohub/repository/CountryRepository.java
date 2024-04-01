

package com.example.geohub.repository;/*
                                      *
                                      * You can use the following import statements
                                      * 
                                      * java.util.ArrayList;
                                      * 
                                      */

// Write your code here

import com.example.geohub.model.Country;

import java.util.*;

public interface CountryRepository {

    List<Country> getCountries();

    Country getCountryById(int countryId);

    Country addCountry(Country country);

    Country updateCountry(int countryId, Country country);

    void deleteCountry(int countryId);
}
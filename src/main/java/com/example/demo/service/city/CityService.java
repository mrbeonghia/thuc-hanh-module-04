package com.example.demo.service.city;

import com.example.demo.model.City;

import java.util.Optional;

public interface CityService {
    Iterable<City> findAll();

    Optional<City> findById(Long id);

    City save(City city);

    void delete(Long id);
}

package com.example.demo.service;

import com.example.demo.model.City;

import java.util.Optional;

public interface CityService {
    Iterable<City> findAll();

    Optional<City> findById(Long id);

    void save(City city);

    void delete(Long id);
}

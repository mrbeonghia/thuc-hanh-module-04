package com.example.demo.service.country;

import com.example.demo.model.Country;

import java.util.Optional;

public interface CountryService {
    Iterable<Country> findAll();

    Optional<Country> findById(Long id);
}

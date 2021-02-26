package com.example.demo.service;

import com.example.demo.model.Country;

import java.util.Optional;

public interface CountryService {
    Iterable<Country> findAll();

    Optional<Country> findById(Long id);

}

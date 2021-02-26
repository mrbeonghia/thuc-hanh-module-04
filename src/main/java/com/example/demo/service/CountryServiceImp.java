package com.example.demo.service;

import com.example.demo.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CountryServiceImp implements CountryService {
    @Autowired
    private CountryService countryService;
    @Override
    public Iterable<Country> findAll() {
        return countryService.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryService.findById(id);
    }
}

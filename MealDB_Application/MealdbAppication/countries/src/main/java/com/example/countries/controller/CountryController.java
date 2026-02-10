package com.example.countries.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.countries.dto.CountryDTO;
import com.example.countries.service.CountryService;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping
    public List<CountryDTO> getAllCountries() {
        return service.getAllCountries();
    }

    @GetMapping("/name/{name}")
    public List<CountryDTO> getByName(@PathVariable String name) {
        return service.searchByName(name);
    }

    @GetMapping("/code/{code}")
    public List<CountryDTO> getByCode(@PathVariable String code) {
        return service.searchByCode(code);
    }

    @GetMapping("/region/{region}")
    public List<CountryDTO> getByRegion(@PathVariable String region) {
        return service.filterByRegion(region);
    }

    @GetMapping("/capital/{capital}")
    public List<CountryDTO> getByCapital(@PathVariable String capital) {
        return service.searchByCapital(capital);
    }
}

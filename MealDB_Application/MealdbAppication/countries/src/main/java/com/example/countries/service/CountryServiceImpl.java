package com.example.countries.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.countries.dto.CountryDTO;

@Service
public class CountryServiceImpl implements CountryService {

    private static final String BASE_URL = "https://restcountries.eu/rest/v2";

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<CountryDTO> getAllCountries() {
        CountryDTO[] response =
                restTemplate.getForObject(BASE_URL + "/all", CountryDTO[].class);
        return Arrays.asList(response);
    }

    @Override
    public List<CountryDTO> searchByName(String name) {
        CountryDTO[] response =
                restTemplate.getForObject(BASE_URL + "/name/" + name, CountryDTO[].class);
        return Arrays.asList(response);
    }

    @Override
    public List<CountryDTO> searchByCode(String code) {
        CountryDTO country =
                restTemplate.getForObject(BASE_URL + "/alpha/" + code, CountryDTO.class);
        return List.of(country);
    }

    @Override
    public List<CountryDTO> filterByRegion(String region) {
        CountryDTO[] response =
                restTemplate.getForObject(BASE_URL + "/region/" + region, CountryDTO[].class);
        return Arrays.asList(response);
    }

    @Override
    public List<CountryDTO> searchByCapital(String capital) {
        return getAllCountries()
                .stream()
                .filter(c -> c.getCapital() != null &&
                             c.getCapital().toLowerCase().contains(capital.toLowerCase()))
                .collect(Collectors.toList());
    }
}

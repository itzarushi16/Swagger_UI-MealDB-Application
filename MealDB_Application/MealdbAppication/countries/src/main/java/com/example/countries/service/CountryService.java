package com.example.countries.service;

import java.util.List;
import com.example.countries.dto.CountryDTO;

public interface CountryService {

    List<CountryDTO> getAllCountries();

    List<CountryDTO> searchByName(String name);

    List<CountryDTO> searchByCode(String code);

    List<CountryDTO> filterByRegion(String region);

    List<CountryDTO> searchByCapital(String capital);
}

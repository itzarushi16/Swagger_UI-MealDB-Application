package com.example.countries.dto;

import java.util.List;

public class CountryDTO {

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAlpha2Code() {
		return alpha2Code;
	}
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}
	public String getAlpha3Code() {
		return alpha3Code;
	}
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public List<String> getBorders() {
		return borders;
	}
	public void setBorders(List<String> borders) {
		this.borders = borders;
	}
	private String name;
    private String capital;
    private String region;
    private String alpha2Code;
    private String alpha3Code;
    private Long population;
    private List<String> borders;

    // Getters and Setters
}

package com.bilgeadam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "countryName")
	String countryName;

	@Column(name = "population")
	int population;

	@Column(name = "imageUrl")
	String imageUrl;

	public Country() {
		super();
	}

	public Country(int i, String countryName, int population, String imageUrl) {
		super();
		this.id = i;
		this.countryName = countryName;
		this.population = population;
		this.imageUrl = imageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
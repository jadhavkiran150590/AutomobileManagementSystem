package com.automobile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue

	@Column(name = "car_id")
	private long carId;

	@Column(name = "car_name")
	private String carName;

	@Column(name = "car_price")
	private double carPrice;

	@Column(name = "car_model")
	private String carModel;

	@Column(name = "car_year_of_manufacture")
	private int carYearOfManufacture;

	@Column(name = "car_fuel_type")
	private String carFuelType;

}

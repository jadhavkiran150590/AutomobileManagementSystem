package com.automobile.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

	private long carId;

	private String carName;

	private double carPrice;

	private String carModel;

	private int carYearOfManufacture;

	private String carFuelType;
}

package com.automobile.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.automobile.model.Car;
import com.automobile.repository.CarRepository;

@Component
public class CarDaoImpl {

	@Autowired
	CarRepository carRepositoryImpl;

	public Optional<Car> getCarDataById(long carId) {
		// TODO Auto-generated method stub
		return carRepositoryImpl.findById(carId);
	}

	public List<Car> getAllCarData() {
		// TODO Auto-generated method stub
		return carRepositoryImpl.findAll();
	}

	public Car addCarData(Car car) {
		// TODO Auto-generated method stub
		return carRepositoryImpl.save(car);
	}

	public Car updateCarData(Car car) {
		// TODO Auto-generated method stub
		return carRepositoryImpl.save(car);
	}

	public void deleteCarData(long carId) {
		// TODO Auto-generated method stub
		carRepositoryImpl.deleteById(carId);
	}
	
	
}

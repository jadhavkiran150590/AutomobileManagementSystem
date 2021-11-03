package com.automobile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobile.dao.CarDaoImpl;
import com.automobile.model.Car;

@Service
public class CarServiceImpl {

	@Autowired
	CarDaoImpl carDaoImpl;

	public Optional<Car> getDataByCarId(long carId) {
		// TODO Auto-generated method stub
		return carDaoImpl.getCarDataById(carId);
	}

	public List<Car> getAllCarData() {
		// TODO Auto-generated method stub
		return carDaoImpl.getAllCarData();
	}

	public Car addCarData(Car car) {
		// TODO Auto-generated method stub
		return carDaoImpl.addCarData(car);
	}

	public Car updateCarData(Car car) {
		// TODO Auto-generated method stub
		return carDaoImpl.updateCarData(car);
	}

	public void deleteCarData(long carId) {
		// TODO Auto-generated method stub
		carDaoImpl.deleteCarData(carId);
	}
	
	
}

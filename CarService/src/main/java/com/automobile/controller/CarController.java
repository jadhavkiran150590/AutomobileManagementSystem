package com.automobile.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automobile.exception.RecordNotFoundException;
import com.automobile.model.Car;
import com.automobile.service.CarServiceImpl;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	CarServiceImpl carServiceImpl;

	@GetMapping("/{carId}")
	public ResponseEntity<Optional<Car>> getDataByCarId(@PathVariable long carId) {
		return ResponseEntity.ok(carServiceImpl.getDataByCarId(carId));
	}

	@GetMapping("/")
	public ResponseEntity<List<Car>> getAllCarData() {
		return ResponseEntity.ok(carServiceImpl.getAllCarData());
	}

	@PostMapping("/")
	public ResponseEntity<Car> addCarData(@RequestBody Car car) {
		return ResponseEntity.ok(carServiceImpl.addCarData(car));
	}

	@PutMapping("/{carId}")
	public ResponseEntity<Car> updateCarData(@PathVariable long carId, @RequestBody Car car) throws RecordNotFoundException {
		Car cc = carServiceImpl.getDataByCarId(carId).orElseThrow(()-> new RecordNotFoundException("Car Doesn't exist"));
		return ResponseEntity.ok(carServiceImpl.updateCarData(car));
	}

	@DeleteMapping("/{carId}")
	public ResponseEntity<String> deleteCarData(@PathVariable long carId) {
		carServiceImpl.deleteCarData(carId);
		return ResponseEntity.ok("Car Data Deleted Succeessfully");
	}
}

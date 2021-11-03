package com.automobile.dao.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.automobile.dao.CarDaoImpl;
import com.automobile.model.Car;
import com.automobile.repository.CarRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarDaoImplTest {

	@Autowired
	CarDaoImpl carDaoImpl;

	@MockBean
	CarRepository carRepositoryImpl;

	@Test
	public void getAllCarDataTest() {
		when(carRepositoryImpl.findAll()).thenReturn(Stream.of(new Car(11, "Toyota", 56565.78, "UC", 2021, "PETROL"),
				new Car(22, "MARUTI", 568767.78, "S1", 2018, "ELECTRIC")).collect(Collectors.toList()));
		assertEquals(2, carDaoImpl.getAllCarData().size());
	}

	@Test
	public void addCarDataTest() {
		Car car = new Car(22, "MARUTI", 568767.78, "S1", 2018, "ELECTRIC");

		carDaoImpl.addCarData(car);
		verify(carRepositoryImpl, times(1)).save(car);
	}

	@Test
	public void updateCarDataTest() {
		Car car = new Car(22, "MARUTI", 568767.78, "S1", 2018, "ELECTRIC");

		carDaoImpl.updateCarData(car);
		verify(carRepositoryImpl, times(1)).save(car);
	}

	@Test
	public void deleteCarDataTest() {
		Car car = new Car(22, "MARUTI", 568767.78, "S1", 2018, "ELECTRIC");

		carDaoImpl.deleteCarData(car.getCarId());
		verify(carRepositoryImpl, times(1)).deleteById(car.getCarId());
	}
}

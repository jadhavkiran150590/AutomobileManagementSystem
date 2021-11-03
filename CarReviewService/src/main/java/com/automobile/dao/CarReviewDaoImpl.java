package com.automobile.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.automobile.model.CarReview;
import com.automobile.repo.CarReviewRepository;
import com.automobile.vo.Car;
import com.automobile.vo.RestTemplateVO;

@Component
public class CarReviewDaoImpl {

	@Autowired
	CarReviewRepository carReviewRepositoryImpl;

	@Autowired
	RestTemplate restTemplate;

	public RestTemplateVO getRestTemplateVO(long carReviewId) {
		// TODO Auto-generated method stub

		RestTemplateVO restTemplateVO = new RestTemplateVO();

		CarReview carReview = carReviewRepositoryImpl.findByCarReviewId(carReviewId);
		Car car = restTemplate.getForObject("http://CarService/cars/" + carReview.getCarId(), Car.class);
		restTemplateVO.setCar(car);
		restTemplateVO.setCarReview(carReview);
		return restTemplateVO;
	}

	public CarReview addCarReview(CarReview carReview) {
		// TODO Auto-generated method stub
		return carReviewRepositoryImpl.save(carReview);
	}

}

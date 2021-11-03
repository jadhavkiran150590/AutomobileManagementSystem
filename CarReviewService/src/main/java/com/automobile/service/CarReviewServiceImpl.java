package com.automobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobile.dao.CarReviewDaoImpl;
import com.automobile.model.CarReview;
import com.automobile.vo.RestTemplateVO;

@Service
public class CarReviewServiceImpl {

	@Autowired
	CarReviewDaoImpl carReviewDaoImpl;

	public RestTemplateVO getRestTemplateVO(long carReviewId) {
		// TODO Auto-generated method stub
		return carReviewDaoImpl.getRestTemplateVO(carReviewId);
	}

	public CarReview addCarReview(CarReview carReview) {
		// TODO Auto-generated method stub
		return carReviewDaoImpl.addCarReview(carReview);
	}
	
	
}

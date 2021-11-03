package com.automobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automobile.model.CarReview;
import com.automobile.service.CarReviewServiceImpl;
import com.automobile.vo.RestTemplateVO;

@RestController
@RequestMapping("/carreviews")
public class CarReviewController {

	@Autowired
	CarReviewServiceImpl carReviewServiceImpl;
	
	@GetMapping("/{carReviewId}")
	public ResponseEntity<RestTemplateVO> getRestTemplateVO(@PathVariable long carReviewId)
	{
		return ResponseEntity.ok(carReviewServiceImpl.getRestTemplateVO(carReviewId));
	}
	
	@PostMapping("/")
	public ResponseEntity<CarReview> addCarReview(@RequestBody CarReview carReview)
	{
		return ResponseEntity.ok(carReviewServiceImpl.addCarReview(carReview));
	}
}

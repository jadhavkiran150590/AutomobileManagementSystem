package com.automobile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/carfallback")
	public String carFallBack()
	{
		return "Car Service is down please wait";
	}
	
	@GetMapping("/carreviewfallback")
	public String carReviewFallBack()
	{
		return "Car Review Service is down please wait";
	}
}

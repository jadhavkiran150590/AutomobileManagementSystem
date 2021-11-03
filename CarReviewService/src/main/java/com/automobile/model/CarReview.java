package com.automobile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarReview {

	@Id
	@GeneratedValue
	@Column(name="car_review_id")
	private long carReviewId;
	
	@Column(name="car_review_description")
	private String carReviewDescription;
	
	@Column(name="car_id")
	private long carId;
	
	
}

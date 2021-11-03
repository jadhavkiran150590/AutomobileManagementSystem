package com.automobile.vo;

import com.automobile.model.CarReview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestTemplateVO {

	private Car car;

	private CarReview carReview;
}

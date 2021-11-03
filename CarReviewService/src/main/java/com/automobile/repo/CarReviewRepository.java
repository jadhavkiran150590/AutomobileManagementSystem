package com.automobile.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.automobile.model.CarReview;

@Repository
public interface CarReviewRepository extends JpaRepository<CarReview, Long> {

	public CarReview findByCarReviewId(long carReviewId);

}

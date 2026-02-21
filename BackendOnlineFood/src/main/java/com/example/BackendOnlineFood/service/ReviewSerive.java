package com.example.BackendOnlineFood.service;

import java.util.List;

import com.example.BackendOnlineFood.Exception.ReviewException;
import com.example.BackendOnlineFood.model.Review;
import com.example.BackendOnlineFood.model.User;
import com.example.BackendOnlineFood.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}

package com.example.reviewms.reviews.impl;


import com.example.reviewms.reviews.Review;
import com.example.reviewms.reviews.reviewService;
import com.example.reviewms.reviews.reviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reviewServiceImpl implements reviewService {
    private final reviewRepository reviewRepository;

    public reviewServiceImpl(reviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }
    @Override
    public List<Review> getAllReviews(Long companyId) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyId);
        return reviews;
    }

    @Override
    public boolean addReviews(Long companyId, Review review) {
        if(companyId != null && review != null){
            review.setCompanyId(companyId);
            reviewRepository.save(review);
            return true;
        }
        return false;
    }

    @Override
    public Review getReview(Long reviewId) {
        return reviewRepository.findById(reviewId).orElse(null);
    }

    @Override
    public boolean updateReview(Long reviewId, Review updateReview) {
        Review review = reviewRepository.findById(reviewId).orElse(null);
        if(review != null){
            review.setTitle(updateReview.getTitle());
            review.setDescription(updateReview.getDescription());
            review.setCompanyId(updateReview.getCompanyId());
            reviewRepository.save(review);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteReview(Long reviewId) {
        Review review = reviewRepository.findById(reviewId).orElse(null);
        if(review != null){
            reviewRepository.delete(review);
            return true;
        }
        return false;
    }
}

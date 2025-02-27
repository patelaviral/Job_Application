package com.example.reviewms.reviews;

import java.util.List;

public interface reviewService {
    List<Review> getAllReviews(Long companyId);
    boolean addReviews(Long companyId, Review review);
    Review getReview(Long reviewId);
    boolean updateReview(Long reviewId, Review review);
    boolean deleteReview(Long reviewId);
}

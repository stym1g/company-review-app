package com.satyam.projects.companyreviewapp.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);
    Boolean addReview(Long companyId, Review review);

    Review getReviewById(Long companyId, Long reviewId);

    Boolean updateReview(Long companyId, Long reviewId, Review updatedReview);

    Boolean deleteReview(Long companyId, Long reviewId);
}

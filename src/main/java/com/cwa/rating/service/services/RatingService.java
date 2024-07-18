package com.cwa.rating.service.services;

import com.cwa.rating.service.model.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating createRating(Rating rating);

    //get all rating
    List<Rating> fetchAllRatings();

    //get all by user id
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotel);
}

package com.cwa.rating.service.controller;

import com.cwa.rating.service.model.Rating;
import com.cwa.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/saveRating")
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {
        Rating createdRating = this.ratingService.createRating(rating);
        return new ResponseEntity<>(createdRating, HttpStatus.CREATED);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<Rating>> fetchAllRatings() {
        List<Rating> ratings = this.ratingService.fetchAllRatings();
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/findByUserId/{userId}")
    public ResponseEntity<List<Rating>> findRatingByUserId(@PathVariable("userId") String userId) {
        List<Rating> ratingByUserId = this.ratingService.getRatingByUserId(userId);
        return ResponseEntity.ok(ratingByUserId);
    }

    @GetMapping("/findByUserId/{hotelId}")
    public ResponseEntity<List<Rating>> findRatingByHotelId(@PathVariable("hotelId") String hotelId) {
        List<Rating> ratingByHotelId = this.ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(ratingByHotelId);
    }
}


package com.cwa.rating.service.repository;

import com.cwa.rating.service.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {

    //custom finder methods
    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);
}

package com.dxc.spring.swagger.movie.service;

import java.util.List;

import com.dxc.spring.swagger.movie.model.MovieBookingSystem;

public interface IMovieBookingService {

    MovieBookingSystem insertProductDetails(MovieBookingSystem movieBooking);

    void deleteMovieDetails(long movieId);

    List<MovieBookingSystem> getAllMovieBookingDetails();
   
}

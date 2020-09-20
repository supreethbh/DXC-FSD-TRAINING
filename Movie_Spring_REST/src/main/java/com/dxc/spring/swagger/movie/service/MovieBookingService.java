package com.dxc.spring.swagger.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.spring.swagger.movie.model.MovieBookingSystem;
import com.dxc.spring.swagger.movie.repository.IMovieBookingRepository;

@Service
public class MovieBookingService implements IMovieBookingService {

    @Autowired
    IMovieBookingRepository movieBookingRepository;

    @Override
    public MovieBookingSystem insertProductDetails(MovieBookingSystem movieBooking) {
	
	return movieBookingRepository.save(movieBooking);
    }

    @Override
    public void deleteMovieDetails(long movieId) {
	
	movieBookingRepository.deleteById(movieId);
    }

    @Override
    public List<MovieBookingSystem> getAllMovieBookingDetails() {
	
	return movieBookingRepository.findAll();
    }

}

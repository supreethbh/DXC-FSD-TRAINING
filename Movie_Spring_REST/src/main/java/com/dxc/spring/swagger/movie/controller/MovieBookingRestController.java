package com.dxc.spring.swagger.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.spring.swagger.movie.model.MovieBookingSystem;
import com.dxc.spring.swagger.movie.service.IMovieBookingService;

import io.swagger.annotations.ApiOperation;

@ApiOperation(value="/movie", tags="Movie-Booking-Controller with Spring-Boot-Rest-Swagger")
@RestController
@RequestMapping(path = "/movie")
public class MovieBookingRestController {

    @Autowired
    private IMovieBookingService movieBookingService;
   
    public MovieBookingRestController() {
	super();
    }

    @ApiOperation(value = "Add Movie Details", produces = "JSON Data", response = MovieBookingSystem.class)
    @PostMapping(path="/addMovie", consumes={"application/json","application/xml"})
    
    public MovieBookingSystem insertMovieDetails(@RequestBody MovieBookingSystem movieBooking) {
	
	return movieBookingService.insertProductDetails(movieBooking);
    }
    
    @ApiOperation(value = "Delete Movie Details", response = MovieBookingSystem.class)
    @DeleteMapping(path="/deleteMovie/{movieId}")
    
    public String deleteMovieDetails(@PathVariable("movieId") long movieId) {
	
	movieBookingService.deleteMovieDetails(movieId);
	return "Movie Booking for Movie ID " + movieId + " is deleted...";
    }
    
    @ApiOperation(value = "Get All Movie-Booking-Details", response = MovieBookingSystem.class)
    @GetMapping(path="/getAllMovies", produces={"application/json","application/xml"})
    
    public List<MovieBookingSystem> getAllProducts() {
	
	return movieBookingService.getAllMovieBookingDetails();	
    }
    
}

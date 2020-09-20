package com.dxc.spring.swagger.movie.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieBookingRestTemplate {

    @Autowired
    RestTemplate restTemplate;
    
    public MovieBookingRestTemplate() {
	super();
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/template/getAllMovies")
    public ResponseEntity<List> getAllMoviesList() {
	
	HttpHeaders headers = new HttpHeaders();
	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

	return	restTemplate.getForEntity("http://localhost:9080/Movie_Spring_REST/movie/getAllMovies", List.class);
    }
    
}

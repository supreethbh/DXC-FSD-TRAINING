package com.dxc.spring.swagger.movie.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : SUPREETH BH
 * @date   : 3rd September 2020
 * 
 * @see Movie Booking System Application
 */

@Entity
@Table(name = "Movie_Booking_System")
public class MovieBookingSystem implements Serializable {
    
        private static final long serialVersionUID = -6097897115197408878L;
        
        @Id
        @Column(name = "Movie_Id")
        private long movieId;
        
        @Column(name = "Movie_Name")
        private String movieName;
        
        @Column(name = "Movie_Rating")
        private double movieRating;
        
        @Column(name = "Movie_Duration")
        private String movieDuration;
        
        @Column(name = "Movie_Category")
        private String movieCategory;
        
        @Column(name = "Movie_Recommend")
        private String movieRecommend;

	public MovieBookingSystem() {
	    super();
	}

	public long getMovieId() {
	    return movieId;
	}

	public void setMovieId(long movieId) {
	    this.movieId = movieId;
	}

	public String getMovieName() {
	    return movieName;
	}

	public void setMovieName(String movieName) {
	    this.movieName = movieName;
	}

	public double getMovieRating() {
	    return movieRating;
	}

	public void setMovieRating(double movieRating) {
	    this.movieRating = movieRating;
	}

	public String getMovieDuration() {
	    return movieDuration;
	}

	public void setMovieDuration(String movieDuration) {
	    this.movieDuration = movieDuration;
	}

	public String getMovieCategory() {
	    return movieCategory;
	}

	public void setMovieCategory(String movieCategory) {
	    this.movieCategory = movieCategory;
	}

	public String getMovieRecommend() {
	    return movieRecommend;
	}

	public void setMovieRecommend(String movieRecommend) {
	    this.movieRecommend = movieRecommend;
	}
    
}

package com.dxc.spring.swagger.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieSpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieSpringBootRestApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
	    	return new RestTemplate();
	}
}

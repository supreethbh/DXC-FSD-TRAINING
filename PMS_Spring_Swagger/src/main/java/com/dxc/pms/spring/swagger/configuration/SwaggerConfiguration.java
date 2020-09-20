package com.dxc.pms.spring.swagger.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket docket() {

	return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
		.build()
		.apiInfo(apiDetails());
    }

    private ApiInfo apiDetails() {
	
	return new ApiInfo(
		"Product API", 
		"This is Product-Management API for CRUD actions", 
		"v1.1", 
		"Open source", 
		new springfox.documentation.service.Contact("Supreeth Gowda", "https://spring.io/guides/tutorials/bookmarks", "supreeth.h.gowda@gmail.com"),
		"API License",
		"https://spring.io/guides/tutorials/bookmarks",
		Collections.emptyList());
    }
}

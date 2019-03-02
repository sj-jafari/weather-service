package com.weather.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * Weather Service Application is a SpringBoot based application which exposes some REST APIs to get information about weather conditions.
 *  
 * @author Jalal
 * @since 20190301
 */
@SpringBootApplication
@ComponentScan(basePackages= {"com.weather","org.openweathermap"})
public class WeatherServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeatherServiceApplication.class, args);
	}

}

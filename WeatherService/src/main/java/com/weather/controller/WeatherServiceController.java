package com.weather.controller;

import java.time.LocalDateTime;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;
import org.openweathermap.OpenWeatherDataProcessor;
import org.openweathermap.OpenWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.authentication.Authenticator;
import com.weather.domain.LoginInfo;
import com.weather.domain.WeatherData;
import com.weather.exceptions.FailedToPerformRestCallException;
import com.weather.exceptions.InvalidCredentialsException;
import com.weather.exceptions.InvalidDateRangeForNextNDaysForecast;
import com.weather.exceptions.InvalidInputDataException;
import com.weather.exceptions.InvalidTokenException;

@RestController
@RequestMapping("/api/v1")
public class WeatherServiceController {
	@Autowired
	private OpenWeatherService openWeatherService;
	@Autowired
	private Authenticator authenticator;

	@GetMapping("/hello")
	public ResponseEntity<?> getHelloMessage() {
		String message = "Hello!";
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<?> login(@RequestBody LoginInfo loginInfo) throws InvalidCredentialsException {
		
		String token = authenticator.login(loginInfo.getUsername(), loginInfo.getPassword());
		JSONObject message = new JSONObject();
		message.put("token", token);
		return new ResponseEntity<String>(message.toString(), HttpStatus.OK);
	}

	@GetMapping(path = "/data", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<?> getWeatherData(@QueryParam(value = "city") String city, @RequestHeader(value = "token") String token)
			throws FailedToPerformRestCallException, InvalidTokenException, InvalidInputDataException,
			InvalidDateRangeForNextNDaysForecast {

		authenticator.isTokenValid(token);
		JSONObject message = openWeatherService.getForecastWeatherByCity(city);
		WeatherData data = OpenWeatherDataProcessor.getWeatherData(message, LocalDateTime.now());
		return new ResponseEntity<WeatherData>(data, HttpStatus.OK);
	}
}

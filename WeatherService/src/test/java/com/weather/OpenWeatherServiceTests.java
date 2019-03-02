package com.weather;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openweathermap.OpenWeatherService;
import org.openweathermap.OpenWeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.weather.exceptions.FailedToPerformRestCallException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OpenWeatherServiceImpl.class)
public class OpenWeatherServiceTests {

	@Autowired
	private OpenWeatherService openWeatherService;

	@Test
	public void callForecastApiForValidCity() throws FailedToPerformRestCallException {
		JSONObject result = openWeatherService.getForecastWeatherByCity("Berlin");
		assertNotNull(result);
		assertNotEquals(0, result.length());
	}
	
	@Test(expected= FailedToPerformRestCallException.class)
	public void callForecastApiForUnknownCity() throws FailedToPerformRestCallException {
		openWeatherService.getForecastWeatherByCity("Neverland");
	}

}

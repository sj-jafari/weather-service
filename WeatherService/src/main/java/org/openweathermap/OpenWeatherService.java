package org.openweathermap;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.weather.exceptions.FailedToPerformRestCallException;

/**
 * This is a general interface which indicates the methods to be called from openweathermap.org
 * @author Jalal
 * @since 20190301
 */
@Service
public interface OpenWeatherService {
	//public JSONObject getCurrentWeatherByCity(String city); //Not necessary to implement in this phase.
	public JSONObject getForecastWeatherByCity(String city) throws FailedToPerformRestCallException;
}

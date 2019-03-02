package com.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This knowing object carries the information about weather conditions. 
 * 
 * @author Jalal
 * @since 20190301
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WeatherData {
	private String city;
	private String country;
	private Float averageTemperatureDayTime3Days;
	private Float averageTemperatureNightTime3Days;
	private Float averagePressure3Days;
}

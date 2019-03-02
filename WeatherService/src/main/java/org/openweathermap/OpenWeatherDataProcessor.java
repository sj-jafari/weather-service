package org.openweathermap;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.weather.domain.WeatherData;
import com.weather.exceptions.InvalidDateRangeForNextNDaysForecast;
import com.weather.exceptions.InvalidInputDataException;
import com.weather.util.CalculationUtil;
import com.weather.util.ValidationUtil;

/**
 * This is a utility class for processing data read from openweathermap api.
 * 
 * @author Jalal
 * @since 20190301
 */
@Service
public class OpenWeatherDataProcessor {

	/**
	 * This method processes a given weather forecast info read from openweathermap, 
	 * and returns the following information as a {@link WeatherData} object:
	 * <br/>
	 * Average temperature (in Celsius) of the next 3 days from today’s date for Day
	 * time (06:00 – 18:00) and Night time (18:00 – 06:00).
	 * 
	 * <br/>
	 * Average of pressure for the next 3 days from today’s date.
	 * 
	 * @author Jalal
	 * @since 20190301
	 * @param rawWeatherInfo
	 * @return
	 * @throws InvalidInputDataException 
	 * @throws InvalidDateRangeForNextNDaysForecast 
	 */
	public static WeatherData getWeatherData(JSONObject rawWeatherInfo, LocalDateTime referenceDate) throws InvalidInputDataException, InvalidDateRangeForNextNDaysForecast {

		//TODO: Validate more data
		//Validate the given document
		ArrayList<String> requiredFields = new ArrayList<>();
		requiredFields.add("city");
		requiredFields.add("list");
		ValidationUtil.validateJsonObjectForRequiredFields(rawWeatherInfo,requiredFields );
		ValidationUtil.validateJsonObjectForNextNDaysForcastData(rawWeatherInfo, referenceDate, 3);
		
		//create a WeatherData object
		WeatherData data = new WeatherData();
		
		//set basic info
		data.setCity(rawWeatherInfo.getJSONObject("city").getString("name"));
		data.setCountry(rawWeatherInfo.getJSONObject("city").getString("country"));
		
		//process weather info for the next three days
		JSONArray weatherInfoList = rawWeatherInfo.getJSONArray("list");
		
		LocalDateTime startDate = LocalDateTime.of(referenceDate.getYear(), referenceDate.getMonth(), referenceDate.getDayOfMonth(),0,0,0);
	    LocalDateTime endDate = startDate.plusDays(3);
	    
	    ArrayList<Float> dayTemperatureItems = new ArrayList<>();
	    ArrayList<Float> nightTemperatureItems = new ArrayList<>();
	    ArrayList<Float> pressureItems = new ArrayList<>();
	    
		for (int i = 0; i < weatherInfoList.length(); i++) {
			JSONObject item = weatherInfoList.getJSONObject(i);
			LocalDateTime itemDate = LocalDateTime.parse(item.getString("dt_txt"),
					DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

			 //if it falls within our desired interval
			 if((itemDate.isEqual(startDate) || itemDate.isAfter(startDate)) && itemDate.isBefore(endDate)) { 
				 pressureItems.add(Float.valueOf(item.getJSONObject("main").get("pressure").toString()));
				 
				 //if the item belongs to day or night
				 if(
						 itemDate.toLocalTime().isAfter(LocalTime.of(5, 59, 59))
						 &&
						 itemDate.toLocalTime().isBefore(LocalTime.of(18, 0, 0))
				 ){ //day
					 dayTemperatureItems.add(Float.valueOf(item.getJSONObject("main").get("temp").toString()));
				 }else {//night
					 nightTemperatureItems.add(Float.valueOf(item.getJSONObject("main").get("temp").toString()));
				 }
				 
			 }
		}
		
		//calculate averages and set to data
		data.setAverageTemperatureDayTime3Days(CalculationUtil.getAverage(dayTemperatureItems));
		data.setAverageTemperatureNightTime3Days(CalculationUtil.getAverage(nightTemperatureItems));
		data.setAveragePressure3Days(CalculationUtil.getAverage(pressureItems));
		
		return data;
	}
}

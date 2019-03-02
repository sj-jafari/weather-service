package com.weather.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import com.weather.exceptions.InvalidDateRangeForNextNDaysForecast;
import com.weather.exceptions.InvalidInputDataException;

/**
 * This is a utility class for common validation actions.
 * 
 * @author Jalal
 * @since 20190301
 */
public class ValidationUtil {
	/**
	 * Validates a given json against existence of some fields.
	 * 
	 * @param jsonObject
	 * @param fields
	 * @return boolean
	 * @throws InvalidInputDataException
	 */
	public static boolean validateJsonObjectForRequiredFields(JSONObject jsonObject, Collection<String> fields)
			throws InvalidInputDataException {
		for (String field : fields) {
			if (jsonObject.has(field) == false)
				throw new InvalidInputDataException();
		}
		return true;
	}
	
	public static boolean validateJsonObjectForNextNDaysForcastData(JSONObject rawWeatherInfo, LocalDateTime referenceDate,
			Integer days) throws InvalidDateRangeForNextNDaysForecast
			 {
		
		//process weather info for the next three days
		JSONArray weatherInfoList = rawWeatherInfo.getJSONArray("list");
		
		LocalDateTime startDate = LocalDateTime.of(referenceDate.getYear(), referenceDate.getMonth(), referenceDate.getDayOfMonth(),0,0,0);
	    LocalDateTime endDate = startDate.plusDays(days);
	    
	    //check to see if there is at least an item for every given day.
	    HashMap<String, Boolean> existingDaysMap = new HashMap<>(); // will put an entry for every distinct date
		for (int i = 0; i < weatherInfoList.length(); i++) {
			JSONObject item = weatherInfoList.getJSONObject(i);
			LocalDateTime itemDate = LocalDateTime.parse(item.getString("dt_txt"),
					DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

			 //if it falls within our desired interval
			 if((itemDate.isEqual(startDate) || itemDate.isAfter(startDate)) && itemDate.isBefore(endDate)) { 
				 existingDaysMap.put(itemDate.toLocalDate().toString(), true);
			 }
		}
		
		//we should have equivalent number of items as days in the map.
		if(existingDaysMap.keySet().size() < days)
			throw new InvalidDateRangeForNextNDaysForecast(days);
		
		return true;
	}
}

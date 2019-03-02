package com.weather.exceptions;

/**
 * This exception occurs when a given data does not follow the standards.
 * 
 * @author Jalal
 * @since 20190301
 */
public class InvalidDateRangeForNextNDaysForecast extends Exception {
	private static final long serialVersionUID = 1L;
	private static String message = "The input data does not contain enough information for forecasting the next ";

	public InvalidDateRangeForNextNDaysForecast(Integer days) {
		super(message + days + " days.");
	}
}

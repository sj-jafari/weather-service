package com.weather.exceptions;

/**
 * This exception occurs when a remote service fails to retrieve data from
 * OpenWeather.
 * 
 * @author Jalal
 * @since 20190301
 */
public class FailedToPerformRestCallException extends Exception {
	private static final long serialVersionUID = 1L;
	private final static String message = "Failed to retrive data from server!";
	private int errorCode;
	private String errorMessage;
	
	public FailedToPerformRestCallException(int errorCode, String errorMessage) {
		super(message);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}

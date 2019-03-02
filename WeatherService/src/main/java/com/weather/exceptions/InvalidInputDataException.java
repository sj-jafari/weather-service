package com.weather.exceptions;

/**
 * This exception occurs when a given data does not follow the standards.
 * @author Jalal
 * @since 20190301
 */
public class InvalidInputDataException extends Exception{
	private static final long serialVersionUID = 1L;
	private static final String message = "The input data is not valid! The data format might have changed, please notify the administrator.";
	
	public InvalidInputDataException() {
		super(message);
	}
}

package com.weather.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.weather.exceptions.FailedToPerformRestCallException;
import com.weather.exceptions.InvalidCredentialsException;
import com.weather.exceptions.InvalidTokenException;

/**
 * This class takes care of exception handling for rest services.
 * @author Jalal
 * @since 20190301
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(FailedToPerformRestCallException.class)
    public ResponseEntity<?> handleException(FailedToPerformRestCallException e) {
        // log exception
    	HttpStatus status = HttpStatus.valueOf(e.getErrorCode());
        return ResponseEntity
                .status(status)
                .body(e.getErrorMessage());
    }        
    
    @ExceptionHandler(InvalidTokenException.class)
    public ResponseEntity<?> handleException(InvalidTokenException e) {
        // log exception
    	JSONObject errorJson = new JSONObject();
		errorJson.put("message", e.getMessage());
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(errorJson.toString());
    } 
    
    @ExceptionHandler(InvalidCredentialsException.class)
    public ResponseEntity<?> handleException(InvalidCredentialsException e) {
        // log exception
    	JSONObject errorJson = new JSONObject();
		errorJson.put("message", e.getMessage());
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(errorJson.toString());
    } 
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception e) {
        // log exception
    	JSONObject errorJson = new JSONObject();
		errorJson.put("message", e.getMessage());
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(errorJson.toString());
    } 
}
package com.weather.authentication;

import java.util.HashMap;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.weather.exceptions.InvalidCredentialsException;
import com.weather.exceptions.InvalidTokenException;

/**
 * This class provides method in order to authenticate users
 * 
 * @author Jalal
 * @since 20190301
 */
@Repository
public class AuthenticatorImpl implements Authenticator {
	private HashMap<String, String> userTokenMap;

	/**
	 * Initializes the object.
	 * 
	 * @author Jalal
	 * @since 20190301
	 */
	@PostConstruct
	private void initialize() {
		userTokenMap = new HashMap<String, String>();
	}

	/**
	 * Given correct credentials, logs a user in and returns a token for further
	 * calls.
	 * 
	 * @author Jalal
	 * @since 20190301
	 * @param username
	 * @param password
	 * @throws InvalidCredentialsException
	 */
	@Override
	public synchronized String login(String username, String password) throws InvalidCredentialsException {
		if (username.equals("admin") && password.equals("admin")) {
			String token = "";
			if (userTokenMap.containsKey(username)) {
				token = userTokenMap.get(username);
			} else {
				token = UUID.randomUUID().toString();
				userTokenMap.put(username, token);
			}
			return token;
		} else { // incorrect credentials
			throw new InvalidCredentialsException();
		}
	}

	/**
	 * Given a correct token and username, confirms its validity.
	 * 
	 * @author Jalal
	 * @since 20190301
	 * @param username
	 * @param token
	 * @throws InvalidTokenException
	 */
	@Override
	public boolean isTokenValid(String token) throws InvalidTokenException {
		if (userTokenMap.values().contains(token))
			return true;
		else
			throw new InvalidTokenException();
	}

}

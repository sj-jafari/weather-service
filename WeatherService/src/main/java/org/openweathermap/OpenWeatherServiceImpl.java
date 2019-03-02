package org.openweathermap;

import java.net.URI;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.weather.exceptions.FailedToPerformRestCallException;
/**
 * An implementation for {@link OpenWeatherService}.  
 * @author Jalal
 * @since 20190301
 */
@Service
public class OpenWeatherServiceImpl implements OpenWeatherService {
	@Value("${openweathermap.paths.base}")
	private String baseURI;
	@Value("${openweathermap.paths.weather.current}")
	private String currentPath;
	@Value("${openweathermap.paths.weather.forecast}")
	private String forcastPath;
	@Value("${openweathermap.appid}")
	private String apiAPPID;
	
	private WebTarget target;
	
	/**
	 * Initializes the necessary variables after construction.  
	 * @author Jalal
	 * @since 20190301
	 */
	@PostConstruct
	private void initialize() {
		ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        target = client.target(getBaseURI());
	}
	
	
	@Override
	public JSONObject getForecastWeatherByCity(String city) throws FailedToPerformRestCallException {
        Response response = target
				.path(forcastPath)
				.queryParam("q", city)
				.queryParam("units", "metric")
				.queryParam("APPID", apiAPPID)
				.request()
				.accept(MediaType.APPLICATION_JSON)
				.get(Response.class);
        
        String responseEntity = response.readEntity(String.class);
        
        if(response.getStatus() != 200) {
        	throw new FailedToPerformRestCallException(response.getStatus(), responseEntity);
        }
        
        
        return new JSONObject(responseEntity);
	}
	
	/**
	 * Returns the information regarding current weather conditions of a given city.
	 * @author Jalal
	 * @since 20190301
	 * @param city
	 */
	/*@Override
	public JSONObject getCurrentWeatherByCity(String city) {
        Response response = target
				.path(currentPath)
				.queryParam("q", city)
				.queryParam("units", "metric")
				.queryParam("APPID", apiAPPID)
				.request()
				.accept(MediaType.APPLICATION_JSON)
				.get(Response.class);
        
        String responseEntity = response.readEntity(String.class);
        return new JSONObject(responseEntity);
	}*/
	
	/**
	 * Returns the information regarding 6 day forecast weather conditions of a given city.
	 * @author Jalal
	 * @since 20190301
	 * @param city
	 * @throws FailedToPerformRestCallException 
	 */
	
	
	private URI getBaseURI() {
        return UriBuilder.fromUri(baseURI).build();
    }
}

package com.weather;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDateTime;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.openweathermap.OpenWeatherDataProcessor;

import com.weather.domain.WeatherData;
import com.weather.exceptions.InvalidDateRangeForNextNDaysForecast;
import com.weather.exceptions.InvalidInputDataException;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class OpenWeatherDataProcessorTests {
	private JSONObject sampleForecastDataJson;
	private JSONObject sampleForecastDataJsonNotMatching;
	private JSONObject sampleForecastDataJsonIncomplete;
	private WeatherData sampleWeatherDataObject;
	private LocalDateTime referenceDate;
	@Before
	public void initialize() throws JSONException {
		sampleForecastDataJson = SampleDataGenerator.getSampleForecastData();
		sampleForecastDataJsonNotMatching = SampleDataGenerator.getSampleForecastDataNotMatching();
		sampleForecastDataJsonIncomplete = SampleDataGenerator.getSampleForecastDataIncomplete();
		sampleWeatherDataObject = SampleDataGenerator.getSampleWeatherDataObject();
		referenceDate = LocalDateTime.of(2019, 3, 1, 15, 30);
	}
	
	@Test
	public void TestWeatherDataMatched() throws InvalidInputDataException, InvalidDateRangeForNextNDaysForecast {
		WeatherData data = OpenWeatherDataProcessor.getWeatherData(sampleForecastDataJson, referenceDate);
		
		assertEquals(sampleWeatherDataObject.getCountry(), data.getCountry());
		assertEquals(sampleWeatherDataObject.getCity(), data.getCity());
		assertEquals(sampleWeatherDataObject.getAveragePressure3Days(), data.getAveragePressure3Days());
		assertEquals(sampleWeatherDataObject.getAverageTemperatureDayTime3Days(), data.getAverageTemperatureDayTime3Days());
		assertEquals(sampleWeatherDataObject.getAverageTemperatureNightTime3Days(), data.getAverageTemperatureNightTime3Days());
	}
	
	@Test
	public void TestWeatherDataNotMatched() throws InvalidInputDataException, InvalidDateRangeForNextNDaysForecast {
		WeatherData data = OpenWeatherDataProcessor.getWeatherData(sampleForecastDataJsonNotMatching, referenceDate);
		
		assertEquals(sampleWeatherDataObject.getCountry(), data.getCountry());
		assertEquals(sampleWeatherDataObject.getCity(), data.getCity());
		assertNotEquals(sampleWeatherDataObject.getAveragePressure3Days(), data.getAveragePressure3Days());
		assertNotEquals(sampleWeatherDataObject.getAverageTemperatureDayTime3Days(), data.getAverageTemperatureDayTime3Days());
		assertNotEquals(sampleWeatherDataObject.getAverageTemperatureNightTime3Days(), data.getAverageTemperatureNightTime3Days());
	}
	
	@Test(expected=InvalidDateRangeForNextNDaysForecast.class)
	public void TestWeatherDataNotExistingDays() throws InvalidInputDataException, InvalidDateRangeForNextNDaysForecast {
		OpenWeatherDataProcessor.getWeatherData(sampleForecastDataJsonIncomplete, referenceDate);
	}
	
	@Test(expected=InvalidInputDataException.class)
	public void TestWeatherDataInvalidFormat() throws InvalidInputDataException, InvalidDateRangeForNextNDaysForecast {
		OpenWeatherDataProcessor.getWeatherData(new JSONObject(), referenceDate);
	}

	
}

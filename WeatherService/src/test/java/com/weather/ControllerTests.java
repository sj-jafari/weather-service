package com.weather;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.weather.app.WeatherServiceApplication;
import com.weather.controller.WeatherServiceController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WeatherServiceApplication.class)
@AutoConfigureMockMvc
public class ControllerTests {
	@Autowired
    private WeatherServiceController controller;
    private String token;
    @Autowired
    private MockMvc mockMvc;
    
    @Before
    public void initialize() throws Exception  {
    	
    	String loginInfo = 
    			"{\n" + 
    			"    \"username\": \"admin\",\n" + 
    			"    \"password\": \"admin\"\n" + 
    			"}";
    	
    	MvcResult result = mockMvc.perform(post("/api/v1/login")
    		    .contentType(MediaType.APPLICATION_JSON)
    		    .content(loginInfo)
    		    .characterEncoding("utf-8"))
    		    .andExpect(status().isOk())
    		    .andReturn();
    	token = new JSONObject(result.getResponse().getContentAsString()).getString("token");
    }
    
    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void helloMessageTest() throws Exception {
		MvcResult result = mockMvc.perform(get("/api/v1/hello"))
			.andDo(print())
			.andExpect(status().isOk())
			.andReturn();

		assertEquals("Hello!", result.getResponse().getContentAsString());
    }
    
    @Test
    public void loginWithCorrectCredentials() throws Exception {
    	String loginInfo = 
    			"{\n" + 
    			"    \"username\": \"admin\",\n" + 
    			"    \"password\": \"admin\"\n" + 
    			"}";
    	
    	MvcResult result = mockMvc.perform(post("/api/v1/login")
    		    .contentType(MediaType.APPLICATION_JSON)
    		    .content(loginInfo)
    		    .characterEncoding("utf-8"))
    		    .andExpect(status().isOk())
    		    .andReturn();
    	token = new JSONObject(result.getResponse().getContentAsString()).getString("token");
    	
    	assertNotNull(token);
    	assertNotEquals(0, token.length());
    }
    
    @Test
    public void loginWithIncorrectCredentials() throws Exception {
    	String loginInfo = 
    			"{\n" + 
    			"    \"username\": \"xyz\",\n" + 
    			"    \"password\": \"xyz\"\n" + 
    			"}";
    	
    	mockMvc.perform(post("/api/v1/login")
    		    .contentType(MediaType.APPLICATION_JSON)
    		    .content(loginInfo)
    		    .characterEncoding("utf-8"))
    		    .andExpect(status().is4xxClientError())
    		    .andReturn();
    }
    
    @Test
    public void serviceCallWithInvalidToken() throws Exception {
    	mockMvc.perform(get("/api/v1/data").param("city", "Berlin").header("token", "nothing"))
		.andDo(print())
		.andExpect(status().is4xxClientError())
		.andReturn();
    }
    
    @Test
    public void dataServiceForValidInput() throws Exception {
		MvcResult result = mockMvc.perform(get("/api/v1/data").param("city", "Berlin").header("token", token))
			.andDo(print())
			.andExpect(status().isOk())
			.andReturn();

		JSONObject jsonResult = new JSONObject(result.getResponse().getContentAsString());
		
		assertNotEquals(0, jsonResult.length());
		assertTrue(jsonResult.has("city"));
		assertTrue(jsonResult.has("country"));
		assertTrue(jsonResult.has("averageTemperatureDayTime3Days"));
		assertTrue(jsonResult.has("averageTemperatureNightTime3Days"));
		assertTrue(jsonResult.has("averagePressure3Days"));
    }
    
    @Test
    public void dataServiceForInvalidInput() throws Exception {
		MvcResult result = mockMvc.perform(get("/api/v1/data").param("city", "Neverland").header("token", token))
			.andDo(print())
			.andExpect(status().is4xxClientError())
			.andReturn();

		JSONObject jsonResult = new JSONObject(result.getResponse().getContentAsString());
		
		assertNotEquals(0, jsonResult.length());
		assertTrue(jsonResult.has("message"));
    }
    
    
}

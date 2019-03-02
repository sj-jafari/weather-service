package com.weather;

import org.json.JSONException;
import org.json.JSONObject;

import com.weather.domain.WeatherData;

public class SampleDataGenerator {
	
	protected static JSONObject getSampleForecastData() throws JSONException {
		return new JSONObject( 
				"{\r\n" + 
				"    \"cod\": \"200\",\r\n" + 
				"    \"message\": 0.0034,\r\n" + 
				"    \"cnt\": 40,\r\n" + 
				"    \"list\": [\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551452400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 3.45,\r\n" + 
				"                \"temp_min\": 1.21,\r\n" + 
				"                \"temp_max\": 3.45,\r\n" + 
				"                \"pressure\": 1003.62,\r\n" + 
				"                \"sea_level\": 1003.62,\r\n" + 
				"                \"grnd_level\": 796.09,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 2.25\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 36\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.76,\r\n" + 
				"                \"deg\": 285.003\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.005\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-01 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551463200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -0.28,\r\n" + 
				"                \"temp_min\": -1.97,\r\n" + 
				"                \"temp_max\": -0.28,\r\n" + 
				"                \"pressure\": 1006.52,\r\n" + 
				"                \"sea_level\": 1006.52,\r\n" + 
				"                \"grnd_level\": 798.41,\r\n" + 
				"                \"humidity\": 68,\r\n" + 
				"                \"temp_kf\": 1.68\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.22,\r\n" + 
				"                \"deg\": 250.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-01 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551474000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -5.04,\r\n" + 
				"                \"temp_min\": -6.16,\r\n" + 
				"                \"temp_max\": -5.04,\r\n" + 
				"                \"pressure\": 1008.54,\r\n" + 
				"                \"sea_level\": 1008.54,\r\n" + 
				"                \"grnd_level\": 799.6,\r\n" + 
				"                \"humidity\": 83,\r\n" + 
				"                \"temp_kf\": 1.12\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 8\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.07,\r\n" + 
				"                \"deg\": 227.005\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-01 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551484800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -8,\r\n" + 
				"                \"temp_min\": -8.57,\r\n" + 
				"                \"temp_max\": -8,\r\n" + 
				"                \"pressure\": 1009.93,\r\n" + 
				"                \"sea_level\": 1009.93,\r\n" + 
				"                \"grnd_level\": 800.35,\r\n" + 
				"                \"humidity\": 80,\r\n" + 
				"                \"temp_kf\": 0.56\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.65,\r\n" + 
				"                \"deg\": 223.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.02\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551495600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -9.73,\r\n" + 
				"                \"temp_min\": -9.73,\r\n" + 
				"                \"temp_max\": -9.73,\r\n" + 
				"                \"pressure\": 1011.23,\r\n" + 
				"                \"sea_level\": 1011.23,\r\n" + 
				"                \"grnd_level\": 801.37,\r\n" + 
				"                \"humidity\": 79,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 212.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0175\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551506400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -0.29,\r\n" + 
				"                \"temp_min\": -0.29,\r\n" + 
				"                \"temp_max\": -0.29,\r\n" + 
				"                \"pressure\": 1011.17,\r\n" + 
				"                \"sea_level\": 1011.17,\r\n" + 
				"                \"grnd_level\": 802.3,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 200.001\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0075000000000003\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551517200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 4.23,\r\n" + 
				"                \"temp_min\": 4.23,\r\n" + 
				"                \"temp_max\": 4.23,\r\n" + 
				"                \"pressure\": 1008.42,\r\n" + 
				"                \"sea_level\": 1008.42,\r\n" + 
				"                \"grnd_level\": 801.92,\r\n" + 
				"                \"humidity\": 57,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.42,\r\n" + 
				"                \"deg\": 236.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551528000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 5.45,\r\n" + 
				"                \"temp_min\": 5.45,\r\n" + 
				"                \"temp_max\": 5.45,\r\n" + 
				"                \"pressure\": 1006.66,\r\n" + 
				"                \"sea_level\": 1006.66,\r\n" + 
				"                \"grnd_level\": 801.11,\r\n" + 
				"                \"humidity\": 48,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.02,\r\n" + 
				"                \"deg\": 238.002\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 12:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551538800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 1.97,\r\n" + 
				"                \"temp_min\": 1.97,\r\n" + 
				"                \"temp_max\": 1.97,\r\n" + 
				"                \"pressure\": 1008.15,\r\n" + 
				"                \"sea_level\": 1008.15,\r\n" + 
				"                \"grnd_level\": 801.77,\r\n" + 
				"                \"humidity\": 53,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 20\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.41,\r\n" + 
				"                \"deg\": 246\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551549600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -1.49,\r\n" + 
				"                \"temp_min\": -1.49,\r\n" + 
				"                \"temp_max\": -1.49,\r\n" + 
				"                \"pressure\": 1010.99,\r\n" + 
				"                \"sea_level\": 1010.99,\r\n" + 
				"                \"grnd_level\": 803.53,\r\n" + 
				"                \"humidity\": 61,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.28,\r\n" + 
				"                \"deg\": 243.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551560400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -6.25,\r\n" + 
				"                \"temp_min\": -6.25,\r\n" + 
				"                \"temp_max\": -6.25,\r\n" + 
				"                \"pressure\": 1012.59,\r\n" + 
				"                \"sea_level\": 1012.59,\r\n" + 
				"                \"grnd_level\": 804.23,\r\n" + 
				"                \"humidity\": 84,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.87,\r\n" + 
				"                \"deg\": 212.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551571200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -10.48,\r\n" + 
				"                \"temp_min\": -10.48,\r\n" + 
				"                \"temp_max\": -10.48,\r\n" + 
				"                \"pressure\": 1013.51,\r\n" + 
				"                \"sea_level\": 1013.51,\r\n" + 
				"                \"grnd_level\": 804.48,\r\n" + 
				"                \"humidity\": 79,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.11,\r\n" + 
				"                \"deg\": 179.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551582000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -12.39,\r\n" + 
				"                \"temp_min\": -12.39,\r\n" + 
				"                \"temp_max\": -12.39,\r\n" + 
				"                \"pressure\": 1014.97,\r\n" + 
				"                \"sea_level\": 1014.97,\r\n" + 
				"                \"grnd_level\": 805.28,\r\n" + 
				"                \"humidity\": 65,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.1,\r\n" + 
				"                \"deg\": 182.005\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551592800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -0.27,\r\n" + 
				"                \"temp_min\": -0.27,\r\n" + 
				"                \"temp_max\": -0.27,\r\n" + 
				"                \"pressure\": 1015.93,\r\n" + 
				"                \"sea_level\": 1015.93,\r\n" + 
				"                \"grnd_level\": 806.76,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.62,\r\n" + 
				"                \"deg\": 199\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551603600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 5.81,\r\n" + 
				"                \"temp_min\": 5.81,\r\n" + 
				"                \"temp_max\": 5.81,\r\n" + 
				"                \"pressure\": 1014.15,\r\n" + 
				"                \"sea_level\": 1014.15,\r\n" + 
				"                \"grnd_level\": 806.37,\r\n" + 
				"                \"humidity\": 52,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.57,\r\n" + 
				"                \"deg\": 257.003\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551614400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 6.98,\r\n" + 
				"                \"temp_min\": 6.98,\r\n" + 
				"                \"temp_max\": 6.98,\r\n" + 
				"                \"pressure\": 1013.37,\r\n" + 
				"                \"sea_level\": 1013.37,\r\n" + 
				"                \"grnd_level\": 805.36,\r\n" + 
				"                \"humidity\": 46,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 802,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"scattered clouds\",\r\n" + 
				"                    \"icon\": \"03d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 36\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.56,\r\n" + 
				"                \"deg\": 254.002\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 12:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551625200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 2.56,\r\n" + 
				"                \"temp_min\": 2.56,\r\n" + 
				"                \"temp_max\": 2.56,\r\n" + 
				"                \"pressure\": 1016.03,\r\n" + 
				"                \"sea_level\": 1016.03,\r\n" + 
				"                \"grnd_level\": 806.49,\r\n" + 
				"                \"humidity\": 74,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 80\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.52,\r\n" + 
				"                \"deg\": 266.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.17\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551636000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -1.2,\r\n" + 
				"                \"temp_min\": -1.2,\r\n" + 
				"                \"temp_max\": -1.2,\r\n" + 
				"                \"pressure\": 1018.64,\r\n" + 
				"                \"sea_level\": 1018.64,\r\n" + 
				"                \"grnd_level\": 807.55,\r\n" + 
				"                \"humidity\": 78,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 24\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.12,\r\n" + 
				"                \"deg\": 233.504\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551646800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -5.73,\r\n" + 
				"                \"temp_min\": -5.73,\r\n" + 
				"                \"temp_max\": -5.73,\r\n" + 
				"                \"pressure\": 1019.43,\r\n" + 
				"                \"sea_level\": 1019.43,\r\n" + 
				"                \"grnd_level\": 807.54,\r\n" + 
				"                \"humidity\": 81,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.76,\r\n" + 
				"                \"deg\": 203.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551657600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -9.14,\r\n" + 
				"                \"temp_min\": -9.14,\r\n" + 
				"                \"temp_max\": -9.14,\r\n" + 
				"                \"pressure\": 1019.52,\r\n" + 
				"                \"sea_level\": 1019.52,\r\n" + 
				"                \"grnd_level\": 807.43,\r\n" + 
				"                \"humidity\": 72,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.16,\r\n" + 
				"                \"deg\": 187.504\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0024999999999995\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551668400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -10.19,\r\n" + 
				"                \"temp_min\": -10.19,\r\n" + 
				"                \"temp_max\": -10.19,\r\n" + 
				"                \"pressure\": 1019.94,\r\n" + 
				"                \"sea_level\": 1019.94,\r\n" + 
				"                \"grnd_level\": 807.65,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.12,\r\n" + 
				"                \"deg\": 168.503\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0025000000000004\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551679200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 2.18,\r\n" + 
				"                \"temp_min\": 2.18,\r\n" + 
				"                \"temp_max\": 2.18,\r\n" + 
				"                \"pressure\": 1019.94,\r\n" + 
				"                \"sea_level\": 1019.94,\r\n" + 
				"                \"grnd_level\": 808.75,\r\n" + 
				"                \"humidity\": 70,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 20\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 183.001\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551690000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 6.61,\r\n" + 
				"                \"temp_min\": 6.61,\r\n" + 
				"                \"temp_max\": 6.61,\r\n" + 
				"                \"pressure\": 1016.43,\r\n" + 
				"                \"sea_level\": 1016.43,\r\n" + 
				"                \"grnd_level\": 807.68,\r\n" + 
				"                \"humidity\": 56,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 802,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"scattered clouds\",\r\n" + 
				"                    \"icon\": \"03d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 36\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.86,\r\n" + 
				"                \"deg\": 222.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551700800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 7.09,\r\n" + 
				"                \"temp_min\": 7.09,\r\n" + 
				"                \"temp_max\": 7.09,\r\n" + 
				"                \"pressure\": 1014,\r\n" + 
				"                \"sea_level\": 1014,\r\n" + 
				"                \"grnd_level\": 805.99,\r\n" + 
				"                \"humidity\": 50,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 32\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.48,\r\n" + 
				"                \"deg\": 218.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.11\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 12:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551711600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 1.4,\r\n" + 
				"                \"temp_min\": 1.4,\r\n" + 
				"                \"temp_max\": 1.4,\r\n" + 
				"                \"pressure\": 1016.29,\r\n" + 
				"                \"sea_level\": 1016.29,\r\n" + 
				"                \"grnd_level\": 807.2,\r\n" + 
				"                \"humidity\": 93,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 88\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.79,\r\n" + 
				"                \"deg\": 261.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.84\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0075000000000003\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551722400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -3.06,\r\n" + 
				"                \"temp_min\": -3.06,\r\n" + 
				"                \"temp_max\": -3.06,\r\n" + 
				"                \"pressure\": 1018.03,\r\n" + 
				"                \"sea_level\": 1018.03,\r\n" + 
				"                \"grnd_level\": 808,\r\n" + 
				"                \"humidity\": 90,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.17,\r\n" + 
				"                \"deg\": 223.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.34\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.165\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551733200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -6.21,\r\n" + 
				"                \"temp_min\": -6.21,\r\n" + 
				"                \"temp_max\": -6.21,\r\n" + 
				"                \"pressure\": 1017.92,\r\n" + 
				"                \"sea_level\": 1017.92,\r\n" + 
				"                \"grnd_level\": 807.81,\r\n" + 
				"                \"humidity\": 74,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.96,\r\n" + 
				"                \"deg\": 218\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551744000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -8.1,\r\n" + 
				"                \"temp_min\": -8.1,\r\n" + 
				"                \"temp_max\": -8.1,\r\n" + 
				"                \"pressure\": 1017.88,\r\n" + 
				"                \"sea_level\": 1017.88,\r\n" + 
				"                \"grnd_level\": 807.53,\r\n" + 
				"                \"humidity\": 78,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.42,\r\n" + 
				"                \"deg\": 207\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551754800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -9.8,\r\n" + 
				"                \"temp_min\": -9.8,\r\n" + 
				"                \"temp_max\": -9.8,\r\n" + 
				"                \"pressure\": 1018.57,\r\n" + 
				"                \"sea_level\": 1018.57,\r\n" + 
				"                \"grnd_level\": 807.91,\r\n" + 
				"                \"humidity\": 67,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.76,\r\n" + 
				"                \"deg\": 212.503\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551765600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 1.97,\r\n" + 
				"                \"temp_min\": 1.97,\r\n" + 
				"                \"temp_max\": 1.97,\r\n" + 
				"                \"pressure\": 1018.73,\r\n" + 
				"                \"sea_level\": 1018.73,\r\n" + 
				"                \"grnd_level\": 808.93,\r\n" + 
				"                \"humidity\": 81,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.62,\r\n" + 
				"                \"deg\": 199.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551776400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 6.81,\r\n" + 
				"                \"temp_min\": 6.81,\r\n" + 
				"                \"temp_max\": 6.81,\r\n" + 
				"                \"pressure\": 1016.14,\r\n" + 
				"                \"sea_level\": 1016.14,\r\n" + 
				"                \"grnd_level\": 808.36,\r\n" + 
				"                \"humidity\": 56,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.68,\r\n" + 
				"                \"deg\": 270.003\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551787200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 6.92,\r\n" + 
				"                \"temp_min\": 6.92,\r\n" + 
				"                \"temp_max\": 6.92,\r\n" + 
				"                \"pressure\": 1015.09,\r\n" + 
				"                \"sea_level\": 1015.09,\r\n" + 
				"                \"grnd_level\": 807.84,\r\n" + 
				"                \"humidity\": 49,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 803,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"broken clouds\",\r\n" + 
				"                    \"icon\": \"04d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 64\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.68,\r\n" + 
				"                \"deg\": 310.002\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 12:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551798000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 2.62,\r\n" + 
				"                \"temp_min\": 2.62,\r\n" + 
				"                \"temp_max\": 2.62,\r\n" + 
				"                \"pressure\": 1017.56,\r\n" + 
				"                \"sea_level\": 1017.56,\r\n" + 
				"                \"grnd_level\": 808.68,\r\n" + 
				"                \"humidity\": 61,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 803,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"broken clouds\",\r\n" + 
				"                    \"icon\": \"04n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 56\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.01,\r\n" + 
				"                \"deg\": 2.50098\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551808800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -2.87,\r\n" + 
				"                \"temp_min\": -2.87,\r\n" + 
				"                \"temp_max\": -2.87,\r\n" + 
				"                \"pressure\": 1020.47,\r\n" + 
				"                \"sea_level\": 1020.47,\r\n" + 
				"                \"grnd_level\": 809.94,\r\n" + 
				"                \"humidity\": 84,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 24\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 80.0028\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551819600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -6.17,\r\n" + 
				"                \"temp_min\": -6.17,\r\n" + 
				"                \"temp_max\": -6.17,\r\n" + 
				"                \"pressure\": 1021.33,\r\n" + 
				"                \"sea_level\": 1021.33,\r\n" + 
				"                \"grnd_level\": 809.91,\r\n" + 
				"                \"humidity\": 87,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 8\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.17,\r\n" + 
				"                \"deg\": 177\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551830400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -8.37,\r\n" + 
				"                \"temp_min\": -8.37,\r\n" + 
				"                \"temp_max\": -8.37,\r\n" + 
				"                \"pressure\": 1021.58,\r\n" + 
				"                \"sea_level\": 1021.58,\r\n" + 
				"                \"grnd_level\": 809.74,\r\n" + 
				"                \"humidity\": 84,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.11,\r\n" + 
				"                \"deg\": 198.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551841200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -9.69,\r\n" + 
				"                \"temp_min\": -9.69,\r\n" + 
				"                \"temp_max\": -9.69,\r\n" + 
				"                \"pressure\": 1022.18,\r\n" + 
				"                \"sea_level\": 1022.18,\r\n" + 
				"                \"grnd_level\": 810.03,\r\n" + 
				"                \"humidity\": 75,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 8\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.12,\r\n" + 
				"                \"deg\": 203.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551852000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 3.2,\r\n" + 
				"                \"temp_min\": 3.2,\r\n" + 
				"                \"temp_max\": 3.2,\r\n" + 
				"                \"pressure\": 1021.64,\r\n" + 
				"                \"sea_level\": 1021.64,\r\n" + 
				"                \"grnd_level\": 810.71,\r\n" + 
				"                \"humidity\": 66,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.52,\r\n" + 
				"                \"deg\": 211\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551862800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 7.14,\r\n" + 
				"                \"temp_min\": 7.14,\r\n" + 
				"                \"temp_max\": 7.14,\r\n" + 
				"                \"pressure\": 1018,\r\n" + 
				"                \"sea_level\": 1018,\r\n" + 
				"                \"grnd_level\": 809.86,\r\n" + 
				"                \"humidity\": 70,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 8\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.42,\r\n" + 
				"                \"deg\": 260.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.18\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551873600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 5.2,\r\n" + 
				"                \"temp_min\": 5.2,\r\n" + 
				"                \"temp_max\": 5.2,\r\n" + 
				"                \"pressure\": 1016.31,\r\n" + 
				"                \"sea_level\": 1016.31,\r\n" + 
				"                \"grnd_level\": 809.16,\r\n" + 
				"                \"humidity\": 85,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 68\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.26,\r\n" + 
				"                \"deg\": 350.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 1.46\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 12:00:00\"\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    \"city\": {\r\n" + 
				"        \"id\": 111453,\r\n" + 
				"        \"name\": \"Zanjan\",\r\n" + 
				"        \"coord\": {\r\n" + 
				"            \"lat\": 36.668,\r\n" + 
				"            \"lon\": 48.483\r\n" + 
				"        },\r\n" + 
				"        \"country\": \"IR\",\r\n" + 
				"        \"population\": 357471\r\n" + 
				"    }\r\n" + 
				"}");
    }
	
	protected static JSONObject getSampleForecastDataNotMatching() throws JSONException {
		return new JSONObject( 
				"{\r\n" + 
				"    \"cod\": \"200\",\r\n" + 
				"    \"message\": 0.0034,\r\n" + 
				"    \"cnt\": 40,\r\n" + 
				"    \"list\": [\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551452400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 4.45,\r\n" + 
				"                \"temp_min\": 1.21,\r\n" + 
				"                \"temp_max\": 3.45,\r\n" + 
				"                \"pressure\": 103.62,\r\n" + 
				"                \"sea_level\": 1003.62,\r\n" + 
				"                \"grnd_level\": 796.09,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 2.25\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 36\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.76,\r\n" + 
				"                \"deg\": 285.003\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.005\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-01 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551463200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -0.28,\r\n" + 
				"                \"temp_min\": -1.97,\r\n" + 
				"                \"temp_max\": -0.28,\r\n" + 
				"                \"pressure\": 1006.52,\r\n" + 
				"                \"sea_level\": 1006.52,\r\n" + 
				"                \"grnd_level\": 798.41,\r\n" + 
				"                \"humidity\": 68,\r\n" + 
				"                \"temp_kf\": 1.68\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.22,\r\n" + 
				"                \"deg\": 250.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-01 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551474000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -5.04,\r\n" + 
				"                \"temp_min\": -6.16,\r\n" + 
				"                \"temp_max\": -5.04,\r\n" + 
				"                \"pressure\": 1008.54,\r\n" + 
				"                \"sea_level\": 1008.54,\r\n" + 
				"                \"grnd_level\": 799.6,\r\n" + 
				"                \"humidity\": 83,\r\n" + 
				"                \"temp_kf\": 1.12\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 8\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.07,\r\n" + 
				"                \"deg\": 227.005\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-01 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551484800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -8,\r\n" + 
				"                \"temp_min\": -8.57,\r\n" + 
				"                \"temp_max\": -8,\r\n" + 
				"                \"pressure\": 1009.93,\r\n" + 
				"                \"sea_level\": 1009.93,\r\n" + 
				"                \"grnd_level\": 800.35,\r\n" + 
				"                \"humidity\": 80,\r\n" + 
				"                \"temp_kf\": 0.56\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.65,\r\n" + 
				"                \"deg\": 223.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.02\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551495600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -9.73,\r\n" + 
				"                \"temp_min\": -9.73,\r\n" + 
				"                \"temp_max\": -9.73,\r\n" + 
				"                \"pressure\": 1011.23,\r\n" + 
				"                \"sea_level\": 1011.23,\r\n" + 
				"                \"grnd_level\": 801.37,\r\n" + 
				"                \"humidity\": 79,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 212.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0175\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551506400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -0.29,\r\n" + 
				"                \"temp_min\": -0.29,\r\n" + 
				"                \"temp_max\": -0.29,\r\n" + 
				"                \"pressure\": 1011.17,\r\n" + 
				"                \"sea_level\": 1011.17,\r\n" + 
				"                \"grnd_level\": 802.3,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 200.001\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0075000000000003\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551517200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 4.23,\r\n" + 
				"                \"temp_min\": 4.23,\r\n" + 
				"                \"temp_max\": 4.23,\r\n" + 
				"                \"pressure\": 1008.42,\r\n" + 
				"                \"sea_level\": 1008.42,\r\n" + 
				"                \"grnd_level\": 801.92,\r\n" + 
				"                \"humidity\": 57,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.42,\r\n" + 
				"                \"deg\": 236.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551528000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 5.45,\r\n" + 
				"                \"temp_min\": 5.45,\r\n" + 
				"                \"temp_max\": 5.45,\r\n" + 
				"                \"pressure\": 1006.66,\r\n" + 
				"                \"sea_level\": 1006.66,\r\n" + 
				"                \"grnd_level\": 801.11,\r\n" + 
				"                \"humidity\": 48,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.02,\r\n" + 
				"                \"deg\": 238.002\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 12:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551538800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 1.97,\r\n" + 
				"                \"temp_min\": 1.97,\r\n" + 
				"                \"temp_max\": 1.97,\r\n" + 
				"                \"pressure\": 1008.15,\r\n" + 
				"                \"sea_level\": 1008.15,\r\n" + 
				"                \"grnd_level\": 801.77,\r\n" + 
				"                \"humidity\": 53,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 20\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.41,\r\n" + 
				"                \"deg\": 246\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551549600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -12.49,\r\n" + 
				"                \"temp_min\": -1.49,\r\n" + 
				"                \"temp_max\": -1.49,\r\n" + 
				"                \"pressure\": 1000.99,\r\n" + 
				"                \"sea_level\": 1010.99,\r\n" + 
				"                \"grnd_level\": 803.53,\r\n" + 
				"                \"humidity\": 61,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.28,\r\n" + 
				"                \"deg\": 243.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551560400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -6.25,\r\n" + 
				"                \"temp_min\": -6.25,\r\n" + 
				"                \"temp_max\": -6.25,\r\n" + 
				"                \"pressure\": 1012.59,\r\n" + 
				"                \"sea_level\": 1012.59,\r\n" + 
				"                \"grnd_level\": 804.23,\r\n" + 
				"                \"humidity\": 84,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.87,\r\n" + 
				"                \"deg\": 212.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551571200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -10.48,\r\n" + 
				"                \"temp_min\": -10.48,\r\n" + 
				"                \"temp_max\": -10.48,\r\n" + 
				"                \"pressure\": 1013.51,\r\n" + 
				"                \"sea_level\": 1013.51,\r\n" + 
				"                \"grnd_level\": 804.48,\r\n" + 
				"                \"humidity\": 79,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.11,\r\n" + 
				"                \"deg\": 179.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551582000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -12.39,\r\n" + 
				"                \"temp_min\": -12.39,\r\n" + 
				"                \"temp_max\": -12.39,\r\n" + 
				"                \"pressure\": 1014.97,\r\n" + 
				"                \"sea_level\": 1014.97,\r\n" + 
				"                \"grnd_level\": 805.28,\r\n" + 
				"                \"humidity\": 65,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.1,\r\n" + 
				"                \"deg\": 182.005\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551592800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -0.27,\r\n" + 
				"                \"temp_min\": -0.27,\r\n" + 
				"                \"temp_max\": -0.27,\r\n" + 
				"                \"pressure\": 1015.93,\r\n" + 
				"                \"sea_level\": 1015.93,\r\n" + 
				"                \"grnd_level\": 806.76,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.62,\r\n" + 
				"                \"deg\": 199\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551603600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 5.81,\r\n" + 
				"                \"temp_min\": 5.81,\r\n" + 
				"                \"temp_max\": 5.81,\r\n" + 
				"                \"pressure\": 1014.15,\r\n" + 
				"                \"sea_level\": 1014.15,\r\n" + 
				"                \"grnd_level\": 806.37,\r\n" + 
				"                \"humidity\": 52,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.57,\r\n" + 
				"                \"deg\": 257.003\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551614400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 6.98,\r\n" + 
				"                \"temp_min\": 6.98,\r\n" + 
				"                \"temp_max\": 6.98,\r\n" + 
				"                \"pressure\": 1013.37,\r\n" + 
				"                \"sea_level\": 1013.37,\r\n" + 
				"                \"grnd_level\": 805.36,\r\n" + 
				"                \"humidity\": 46,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 802,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"scattered clouds\",\r\n" + 
				"                    \"icon\": \"03d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 36\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.56,\r\n" + 
				"                \"deg\": 254.002\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 12:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551625200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 2.56,\r\n" + 
				"                \"temp_min\": 2.56,\r\n" + 
				"                \"temp_max\": 2.56,\r\n" + 
				"                \"pressure\": 1016.03,\r\n" + 
				"                \"sea_level\": 1016.03,\r\n" + 
				"                \"grnd_level\": 806.49,\r\n" + 
				"                \"humidity\": 74,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 80\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.52,\r\n" + 
				"                \"deg\": 266.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.17\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551636000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -1.2,\r\n" + 
				"                \"temp_min\": -1.2,\r\n" + 
				"                \"temp_max\": -1.2,\r\n" + 
				"                \"pressure\": 1018.64,\r\n" + 
				"                \"sea_level\": 1018.64,\r\n" + 
				"                \"grnd_level\": 807.55,\r\n" + 
				"                \"humidity\": 78,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 24\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.12,\r\n" + 
				"                \"deg\": 233.504\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551646800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -5.73,\r\n" + 
				"                \"temp_min\": -5.73,\r\n" + 
				"                \"temp_max\": -5.73,\r\n" + 
				"                \"pressure\": 1019.43,\r\n" + 
				"                \"sea_level\": 1019.43,\r\n" + 
				"                \"grnd_level\": 807.54,\r\n" + 
				"                \"humidity\": 81,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.76,\r\n" + 
				"                \"deg\": 203.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-03 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551657600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -9.14,\r\n" + 
				"                \"temp_min\": -9.14,\r\n" + 
				"                \"temp_max\": -9.14,\r\n" + 
				"                \"pressure\": 1019.52,\r\n" + 
				"                \"sea_level\": 1019.52,\r\n" + 
				"                \"grnd_level\": 807.43,\r\n" + 
				"                \"humidity\": 72,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.16,\r\n" + 
				"                \"deg\": 187.504\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0024999999999995\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551668400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -10.19,\r\n" + 
				"                \"temp_min\": -10.19,\r\n" + 
				"                \"temp_max\": -10.19,\r\n" + 
				"                \"pressure\": 1019.94,\r\n" + 
				"                \"sea_level\": 1019.94,\r\n" + 
				"                \"grnd_level\": 807.65,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.12,\r\n" + 
				"                \"deg\": 168.503\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0025000000000004\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551679200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 2.18,\r\n" + 
				"                \"temp_min\": 2.18,\r\n" + 
				"                \"temp_max\": 2.18,\r\n" + 
				"                \"pressure\": 1019.94,\r\n" + 
				"                \"sea_level\": 1019.94,\r\n" + 
				"                \"grnd_level\": 808.75,\r\n" + 
				"                \"humidity\": 70,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 20\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 183.001\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551690000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 6.61,\r\n" + 
				"                \"temp_min\": 6.61,\r\n" + 
				"                \"temp_max\": 6.61,\r\n" + 
				"                \"pressure\": 1016.43,\r\n" + 
				"                \"sea_level\": 1016.43,\r\n" + 
				"                \"grnd_level\": 807.68,\r\n" + 
				"                \"humidity\": 56,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 802,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"scattered clouds\",\r\n" + 
				"                    \"icon\": \"03d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 36\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.86,\r\n" + 
				"                \"deg\": 222.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551700800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 7.09,\r\n" + 
				"                \"temp_min\": 7.09,\r\n" + 
				"                \"temp_max\": 7.09,\r\n" + 
				"                \"pressure\": 1014,\r\n" + 
				"                \"sea_level\": 1014,\r\n" + 
				"                \"grnd_level\": 805.99,\r\n" + 
				"                \"humidity\": 50,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 32\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.48,\r\n" + 
				"                \"deg\": 218.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.11\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 12:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551711600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 1.4,\r\n" + 
				"                \"temp_min\": 1.4,\r\n" + 
				"                \"temp_max\": 1.4,\r\n" + 
				"                \"pressure\": 1016.29,\r\n" + 
				"                \"sea_level\": 1016.29,\r\n" + 
				"                \"grnd_level\": 807.2,\r\n" + 
				"                \"humidity\": 93,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 88\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.79,\r\n" + 
				"                \"deg\": 261.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.84\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0075000000000003\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551722400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -3.06,\r\n" + 
				"                \"temp_min\": -3.06,\r\n" + 
				"                \"temp_max\": -3.06,\r\n" + 
				"                \"pressure\": 1018.03,\r\n" + 
				"                \"sea_level\": 1018.03,\r\n" + 
				"                \"grnd_level\": 808,\r\n" + 
				"                \"humidity\": 90,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.17,\r\n" + 
				"                \"deg\": 223.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.34\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.165\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551733200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -6.21,\r\n" + 
				"                \"temp_min\": -6.21,\r\n" + 
				"                \"temp_max\": -6.21,\r\n" + 
				"                \"pressure\": 1017.92,\r\n" + 
				"                \"sea_level\": 1017.92,\r\n" + 
				"                \"grnd_level\": 807.81,\r\n" + 
				"                \"humidity\": 74,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.96,\r\n" + 
				"                \"deg\": 218\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-04 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551744000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -8.1,\r\n" + 
				"                \"temp_min\": -8.1,\r\n" + 
				"                \"temp_max\": -8.1,\r\n" + 
				"                \"pressure\": 1017.88,\r\n" + 
				"                \"sea_level\": 1017.88,\r\n" + 
				"                \"grnd_level\": 807.53,\r\n" + 
				"                \"humidity\": 78,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.42,\r\n" + 
				"                \"deg\": 207\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551754800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -9.8,\r\n" + 
				"                \"temp_min\": -9.8,\r\n" + 
				"                \"temp_max\": -9.8,\r\n" + 
				"                \"pressure\": 1018.57,\r\n" + 
				"                \"sea_level\": 1018.57,\r\n" + 
				"                \"grnd_level\": 807.91,\r\n" + 
				"                \"humidity\": 67,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.76,\r\n" + 
				"                \"deg\": 212.503\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551765600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 1.97,\r\n" + 
				"                \"temp_min\": 1.97,\r\n" + 
				"                \"temp_max\": 1.97,\r\n" + 
				"                \"pressure\": 1018.73,\r\n" + 
				"                \"sea_level\": 1018.73,\r\n" + 
				"                \"grnd_level\": 808.93,\r\n" + 
				"                \"humidity\": 81,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.62,\r\n" + 
				"                \"deg\": 199.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551776400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 6.81,\r\n" + 
				"                \"temp_min\": 6.81,\r\n" + 
				"                \"temp_max\": 6.81,\r\n" + 
				"                \"pressure\": 1016.14,\r\n" + 
				"                \"sea_level\": 1016.14,\r\n" + 
				"                \"grnd_level\": 808.36,\r\n" + 
				"                \"humidity\": 56,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.68,\r\n" + 
				"                \"deg\": 270.003\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551787200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 6.92,\r\n" + 
				"                \"temp_min\": 6.92,\r\n" + 
				"                \"temp_max\": 6.92,\r\n" + 
				"                \"pressure\": 1015.09,\r\n" + 
				"                \"sea_level\": 1015.09,\r\n" + 
				"                \"grnd_level\": 807.84,\r\n" + 
				"                \"humidity\": 49,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 803,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"broken clouds\",\r\n" + 
				"                    \"icon\": \"04d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 64\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.68,\r\n" + 
				"                \"deg\": 310.002\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 12:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551798000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 2.62,\r\n" + 
				"                \"temp_min\": 2.62,\r\n" + 
				"                \"temp_max\": 2.62,\r\n" + 
				"                \"pressure\": 1017.56,\r\n" + 
				"                \"sea_level\": 1017.56,\r\n" + 
				"                \"grnd_level\": 808.68,\r\n" + 
				"                \"humidity\": 61,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 803,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"broken clouds\",\r\n" + 
				"                    \"icon\": \"04n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 56\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.01,\r\n" + 
				"                \"deg\": 2.50098\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551808800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -2.87,\r\n" + 
				"                \"temp_min\": -2.87,\r\n" + 
				"                \"temp_max\": -2.87,\r\n" + 
				"                \"pressure\": 1020.47,\r\n" + 
				"                \"sea_level\": 1020.47,\r\n" + 
				"                \"grnd_level\": 809.94,\r\n" + 
				"                \"humidity\": 84,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 24\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 80.0028\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551819600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -6.17,\r\n" + 
				"                \"temp_min\": -6.17,\r\n" + 
				"                \"temp_max\": -6.17,\r\n" + 
				"                \"pressure\": 1021.33,\r\n" + 
				"                \"sea_level\": 1021.33,\r\n" + 
				"                \"grnd_level\": 809.91,\r\n" + 
				"                \"humidity\": 87,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 8\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.17,\r\n" + 
				"                \"deg\": 177\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-05 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551830400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -8.37,\r\n" + 
				"                \"temp_min\": -8.37,\r\n" + 
				"                \"temp_max\": -8.37,\r\n" + 
				"                \"pressure\": 1021.58,\r\n" + 
				"                \"sea_level\": 1021.58,\r\n" + 
				"                \"grnd_level\": 809.74,\r\n" + 
				"                \"humidity\": 84,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.11,\r\n" + 
				"                \"deg\": 198.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551841200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -9.69,\r\n" + 
				"                \"temp_min\": -9.69,\r\n" + 
				"                \"temp_max\": -9.69,\r\n" + 
				"                \"pressure\": 1022.18,\r\n" + 
				"                \"sea_level\": 1022.18,\r\n" + 
				"                \"grnd_level\": 810.03,\r\n" + 
				"                \"humidity\": 75,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 8\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.12,\r\n" + 
				"                \"deg\": 203.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551852000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 3.2,\r\n" + 
				"                \"temp_min\": 3.2,\r\n" + 
				"                \"temp_max\": 3.2,\r\n" + 
				"                \"pressure\": 1021.64,\r\n" + 
				"                \"sea_level\": 1021.64,\r\n" + 
				"                \"grnd_level\": 810.71,\r\n" + 
				"                \"humidity\": 66,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.52,\r\n" + 
				"                \"deg\": 211\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551862800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 7.14,\r\n" + 
				"                \"temp_min\": 7.14,\r\n" + 
				"                \"temp_max\": 7.14,\r\n" + 
				"                \"pressure\": 1018,\r\n" + 
				"                \"sea_level\": 1018,\r\n" + 
				"                \"grnd_level\": 809.86,\r\n" + 
				"                \"humidity\": 70,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 8\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.42,\r\n" + 
				"                \"deg\": 260.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.18\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551873600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 5.2,\r\n" + 
				"                \"temp_min\": 5.2,\r\n" + 
				"                \"temp_max\": 5.2,\r\n" + 
				"                \"pressure\": 1016.31,\r\n" + 
				"                \"sea_level\": 1016.31,\r\n" + 
				"                \"grnd_level\": 809.16,\r\n" + 
				"                \"humidity\": 85,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 68\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.26,\r\n" + 
				"                \"deg\": 350.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 1.46\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-06 12:00:00\"\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    \"city\": {\r\n" + 
				"        \"id\": 111453,\r\n" + 
				"        \"name\": \"Zanjan\",\r\n" + 
				"        \"coord\": {\r\n" + 
				"            \"lat\": 36.668,\r\n" + 
				"            \"lon\": 48.483\r\n" + 
				"        },\r\n" + 
				"        \"country\": \"IR\",\r\n" + 
				"        \"population\": 357471\r\n" + 
				"    }\r\n" + 
				"}");
    }
	
	protected static JSONObject getSampleForecastDataIncomplete() throws JSONException {
		return new JSONObject( 
				"{\r\n" + 
				"    \"cod\": \"200\",\r\n" + 
				"    \"message\": 0.0034,\r\n" + 
				"    \"cnt\": 40,\r\n" + 
				"    \"list\": [\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551452400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 3.45,\r\n" + 
				"                \"temp_min\": 1.21,\r\n" + 
				"                \"temp_max\": 3.45,\r\n" + 
				"                \"pressure\": 1003.62,\r\n" + 
				"                \"sea_level\": 1003.62,\r\n" + 
				"                \"grnd_level\": 796.09,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 2.25\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 500,\r\n" + 
				"                    \"main\": \"Rain\",\r\n" + 
				"                    \"description\": \"light rain\",\r\n" + 
				"                    \"icon\": \"10n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 36\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.76,\r\n" + 
				"                \"deg\": 285.003\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {\r\n" + 
				"                \"3h\": 0.005\r\n" + 
				"            },\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-01 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551463200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -0.28,\r\n" + 
				"                \"temp_min\": -1.97,\r\n" + 
				"                \"temp_max\": -0.28,\r\n" + 
				"                \"pressure\": 1006.52,\r\n" + 
				"                \"sea_level\": 1006.52,\r\n" + 
				"                \"grnd_level\": 798.41,\r\n" + 
				"                \"humidity\": 68,\r\n" + 
				"                \"temp_kf\": 1.68\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.22,\r\n" + 
				"                \"deg\": 250.502\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-01 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551474000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -5.04,\r\n" + 
				"                \"temp_min\": -6.16,\r\n" + 
				"                \"temp_max\": -5.04,\r\n" + 
				"                \"pressure\": 1008.54,\r\n" + 
				"                \"sea_level\": 1008.54,\r\n" + 
				"                \"grnd_level\": 799.6,\r\n" + 
				"                \"humidity\": 83,\r\n" + 
				"                \"temp_kf\": 1.12\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 8\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.07,\r\n" + 
				"                \"deg\": 227.005\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-01 21:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551484800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -8,\r\n" + 
				"                \"temp_min\": -8.57,\r\n" + 
				"                \"temp_max\": -8,\r\n" + 
				"                \"pressure\": 1009.93,\r\n" + 
				"                \"sea_level\": 1009.93,\r\n" + 
				"                \"grnd_level\": 800.35,\r\n" + 
				"                \"humidity\": 80,\r\n" + 
				"                \"temp_kf\": 0.56\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.65,\r\n" + 
				"                \"deg\": 223.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.02\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 00:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551495600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -9.73,\r\n" + 
				"                \"temp_min\": -9.73,\r\n" + 
				"                \"temp_max\": -9.73,\r\n" + 
				"                \"pressure\": 1011.23,\r\n" + 
				"                \"sea_level\": 1011.23,\r\n" + 
				"                \"grnd_level\": 801.37,\r\n" + 
				"                \"humidity\": 79,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 12\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 212.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0175\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 03:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551506400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -0.29,\r\n" + 
				"                \"temp_min\": -0.29,\r\n" + 
				"                \"temp_max\": -0.29,\r\n" + 
				"                \"pressure\": 1011.17,\r\n" + 
				"                \"sea_level\": 1011.17,\r\n" + 
				"                \"grnd_level\": 802.3,\r\n" + 
				"                \"humidity\": 69,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.61,\r\n" + 
				"                \"deg\": 200.001\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {\r\n" + 
				"                \"3h\": 0.0075000000000003\r\n" + 
				"            },\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 06:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551517200,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 4.23,\r\n" + 
				"                \"temp_min\": 4.23,\r\n" + 
				"                \"temp_max\": 4.23,\r\n" + 
				"                \"pressure\": 1008.42,\r\n" + 
				"                \"sea_level\": 1008.42,\r\n" + 
				"                \"grnd_level\": 801.92,\r\n" + 
				"                \"humidity\": 57,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 2.42,\r\n" + 
				"                \"deg\": 236.501\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 09:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551528000,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 5.45,\r\n" + 
				"                \"temp_min\": 5.45,\r\n" + 
				"                \"temp_max\": 5.45,\r\n" + 
				"                \"pressure\": 1006.66,\r\n" + 
				"                \"sea_level\": 1006.66,\r\n" + 
				"                \"grnd_level\": 801.11,\r\n" + 
				"                \"humidity\": 48,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01d\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.02,\r\n" + 
				"                \"deg\": 238.002\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"d\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 12:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551538800,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": 1.97,\r\n" + 
				"                \"temp_min\": 1.97,\r\n" + 
				"                \"temp_max\": 1.97,\r\n" + 
				"                \"pressure\": 1008.15,\r\n" + 
				"                \"sea_level\": 1008.15,\r\n" + 
				"                \"grnd_level\": 801.77,\r\n" + 
				"                \"humidity\": 53,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 801,\r\n" + 
				"                    \"main\": \"Clouds\",\r\n" + 
				"                    \"description\": \"few clouds\",\r\n" + 
				"                    \"icon\": \"02n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 20\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.41,\r\n" + 
				"                \"deg\": 246\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 15:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551549600,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -1.49,\r\n" + 
				"                \"temp_min\": -1.49,\r\n" + 
				"                \"temp_max\": -1.49,\r\n" + 
				"                \"pressure\": 1010.99,\r\n" + 
				"                \"sea_level\": 1010.99,\r\n" + 
				"                \"grnd_level\": 803.53,\r\n" + 
				"                \"humidity\": 61,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 3.28,\r\n" + 
				"                \"deg\": 243.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 18:00:00\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"dt\": 1551560400,\r\n" + 
				"            \"main\": {\r\n" + 
				"                \"temp\": -6.25,\r\n" + 
				"                \"temp_min\": -6.25,\r\n" + 
				"                \"temp_max\": -6.25,\r\n" + 
				"                \"pressure\": 1012.59,\r\n" + 
				"                \"sea_level\": 1012.59,\r\n" + 
				"                \"grnd_level\": 804.23,\r\n" + 
				"                \"humidity\": 84,\r\n" + 
				"                \"temp_kf\": 0\r\n" + 
				"            },\r\n" + 
				"            \"weather\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": 800,\r\n" + 
				"                    \"main\": \"Clear\",\r\n" + 
				"                    \"description\": \"clear sky\",\r\n" + 
				"                    \"icon\": \"01n\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"clouds\": {\r\n" + 
				"                \"all\": 0\r\n" + 
				"            },\r\n" + 
				"            \"wind\": {\r\n" + 
				"                \"speed\": 1.87,\r\n" + 
				"                \"deg\": 212.5\r\n" + 
				"            },\r\n" + 
				"            \"rain\": {},\r\n" + 
				"            \"snow\": {},\r\n" + 
				"            \"sys\": {\r\n" + 
				"                \"pod\": \"n\"\r\n" + 
				"            },\r\n" + 
				"            \"dt_txt\": \"2019-03-02 21:00:00\"\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    \"city\": {\r\n" + 
				"        \"id\": 111453,\r\n" + 
				"        \"name\": \"Zanjan\",\r\n" + 
				"        \"coord\": {\r\n" + 
				"            \"lat\": 36.668,\r\n" + 
				"            \"lon\": 48.483\r\n" + 
				"        },\r\n" + 
				"        \"country\": \"IR\",\r\n" + 
				"        \"population\": 357471\r\n" + 
				"    }\r\n" + 
				"}");
    }
	
	protected static WeatherData getSampleWeatherDataObject(){
		return new WeatherData("Zanjan", "IR", new Float(3.32), new Float(-6.06), new Float(1011.78));
	}
}

package com.weather.util;

import java.math.BigDecimal;
import java.util.List;

/**
 * This is a utility class for common calculation actions.
 * 
 * @author Jalal
 * @since 20190301
 */
public class CalculationUtil {
	
	/**
	 * calculates the average for a given list of float numbers
	 * @author Jalal
	 * @since 20190301
	 * @param inputList
	 * @return the average number
	 */
	public static Float getAverage(List<Float> inputList) {
		Float sum = new Float(0);

		for (Float item : inputList)
			sum += item;
		
		BigDecimal roundedAverage = new BigDecimal(sum / inputList.size());
		roundedAverage = roundedAverage.setScale(2, BigDecimal.ROUND_HALF_UP);
		
		return roundedAverage.floatValue();

	}
}

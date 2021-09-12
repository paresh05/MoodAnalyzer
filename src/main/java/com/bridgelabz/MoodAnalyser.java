package com.bridgelabz;

/**
 * @author paresh.praveen_ymedi
 *
 */
public class MoodAnalyser {
	
	/**
	 * This function is used to analyze the mood according to the message passed
	 * 
	 * If the message passed contains Sad then it returns SAD else returns HAPPY
	 * 
	 */
	public String analyseMood(String message)
	{
		if(message.contains("Sad"))
			return "SAD";
		else 
			return "HAPPY";
	}
	
}

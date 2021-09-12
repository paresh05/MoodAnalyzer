package com.bridgelabz;

/**
 * @author paresh.praveen_ymedi
 *
 */
public class MoodAnalyser {
	
	String message;

	//Parameterized Constructor
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}
	//Default Constructor
	public MoodAnalyser() {
		
	}
	
	/**
	 * This function is used to analyze the mood according to the message passed
	 * 
	 * If the message passed contains Sad then it returns SAD else returns HAPPY
	 */
	
	public String analyseMood()
	{
		try {
			if(message.contains("Sad"))
				return "SAD";
			else 
				return "HAPPY";
		}
		catch(NullPointerException e)
		{
			return "HAPPY";
		}
	}
	
}

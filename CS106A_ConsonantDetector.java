/**
 * File: CS106A_ConsonantDetector.java
 * ----------------------------
 * The CS106A_ConsonantDetector class detects the
 * consonants in a client-provided string and 
 * returns the consonants in uppercase form.
 * 
 * Attributions:
 */

import acm.program.*;

public class CS106A_ConsonantDetector extends ConsoleProgram
{
	public void run()
	{
		println("This program takes a string and returns" +
				"its consonants.");
		String userString = readLine("Enter string: ");
		println(findConsonants(userString));
	}
	
	
	private String findConsonants(String str)
	{
		//find tokens (word units)
		String result = "";
		String comparator = str.toLowerCase();
		
		return "".toUpperCase();
	}
	
	
	private boolean
}

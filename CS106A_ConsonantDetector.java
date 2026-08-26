/**
 * File: CS106A_ConsonantDetector.java
 * ----------------------------
 * The CS106A_ConsonantDetector class detects the
 * consonants in a client-provided string and 
 * returns the consonants in uppercase form.
 * 
 * Attributions:
 * The isEnglishVowel method was created by Eric
 * Roberts' text 'The art and science of java' pg.
 * 263.
 */

import acm.program.*;
import java.util.*;

public class CS106A_ConsonantDetector extends ConsoleProgram
{
	/** Named constnts */
	private static final String 
	DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`/\\ ";
	
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
		StringTokenizer tokenizedStr = new StringTokenizer(
				str.toUpperCase(), DELIMITERS, true	
		);
		String result = "";
		while(tokenizedStr.hasMoreTokens()){
			
			println(tokenizedStr.nextToken());
			//result += tokenizedStr.nextToken();
		}
		
		return result;
	}
	
	
	private boolean isWord(String str)
	{
		return true;
	}
	
	
	private boolean isEnglishConsonant(char ch)
	{
		switch (Character.toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return false;
			default: 
					return false;
		}
	}
}

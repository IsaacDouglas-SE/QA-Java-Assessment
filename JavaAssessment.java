IsaacDouglas-SE/FloorIsJava

package com.qa.javaAssessment;


public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.


	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"



	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}

	

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case


	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""


	public String getBert(String input) {
		input = input.toLowerCase();
		String findbert = input;
		int index = findbert.indexOf("bert");
		int count = 0;
		while (index != -1) {
			count++;
			findbert = findbert.substring(index + 1);
			index = findbert.indexOf("bert");

		}

		//If there are two instances, get the letters in between the two instances

		if(count == 2) {
			int pFrom = input.indexOf("bert") + 4;
			int pTo = input.lastIndexOf("bert");
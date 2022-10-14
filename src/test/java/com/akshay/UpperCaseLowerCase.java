package com.akshay;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
		String str = "AkshayVaibhav";
		int UpperCasecount = 0;
		int LowerCasecount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.toLowerCase().charAt(i)) {
				LowerCasecount++;
			} else {
				UpperCasecount++;
			}
		}
		System.out.println("The count of Uppercase Charactor  " + UpperCasecount);
		System.out.println("The count of Lowercase Charactor  " + LowerCasecount);
	}

}

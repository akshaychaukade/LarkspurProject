package com.akshay;

public class SplitElement {

	public static void main(String[] args) {
		String str="java,selenium,testng,maven";
		String str1[]=str.split(",");
		
		for (int i = 0; i<=3; i++) {
			
			System.out.println(str1[i]);
		}
	}

}

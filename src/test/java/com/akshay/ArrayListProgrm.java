package com.akshay;

import java.util.ArrayList;

public class ArrayListProgrm {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Akshay");
		a.add("Praj");
		a.add("Akshay");
		a.add("Akash");
		a.add("Akash");
		a.add("Prajwal");
		for (int j = 0; j < a.size(); j++) {

			  if (a.contains(a.get(j))) {
		             System.out.println(a.equals(a));
		         }else {
		        	 System.out.println(a.get(j));
		         }
		}
	}

}

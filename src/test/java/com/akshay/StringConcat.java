package com.akshay;

public class StringConcat {

	public static void main(String[] args) {
		String s1="Akshay";
		String s2="Vaibhav";
		String s3="Shubham";
		StringBuffer a=new StringBuffer();
		StringBuffer b=a.append(s3).append(s2);
		System.out.println(b);
		/*
		 * String a=s3.concat(s2).concat(s1); System.out.println(a);
		 */
	}

}

package com.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft {
	@Test
	private void m1() {
		SoftAssert softly = new SoftAssert();
		Assert.assertEquals("hello", "hii");
		
		System.out.println("continue");
		softly.assertEquals("hii", "hii");
		softly.assertEquals("hii", "hii"); 
		System.out.println("I am akshay");
		softly.assertAll();
	}
}

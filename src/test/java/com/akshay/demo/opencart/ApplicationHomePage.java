package com.akshay.demo.opencart;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Config.Akshay.BaseClass;


public class ApplicationHomePage extends BaseClass {
	
	@Test(priority = 1)
    public void HomepageTo_Registration() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();  //Then click on My Account Btn
	    driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();   //After that select The 'Register' txt
	    String txt=driver.getTitle();
	    assertEquals(txt, "Register Account");
	    
	    
	}
	@Test(priority =2 )
	public void RegistrationComplte() {
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Akshay");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Chaukade");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("akshaychaukade822@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Akshay@822");
		
		
		
	}
}

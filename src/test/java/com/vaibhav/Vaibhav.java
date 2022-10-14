package com.vaibhav;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vaibhav {
	@Test
	public void m1() {
	System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://testingshastra.com/");
	driver.findElement(By.xpath("//a[@href=\'/notes\']")).click();
	driver.findElement(By.xpath("//a[@href=\"../interview_questions/cucumber-interview-questions.pdf\"]"));
}
}

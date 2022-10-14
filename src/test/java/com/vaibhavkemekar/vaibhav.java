package com.vaibhavkemekar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vaibhav {
	@Test
	public void m1() {
		 System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.findElement(By.xpath("//a[@href=\'/notes\']")).click();
		driver.findElement(By.xpath("//a[@href=\"../interview_questions/cucumber-interview-questions.pdf\"]")).click();
	}

}

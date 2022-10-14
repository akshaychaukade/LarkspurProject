package com.akshay;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce_com { 
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("vaibhav");
	
/*		String parent= driver.getWindowHandle();
		System.out.println("Parent handle "+parent);
		
		Set<String> windows	=driver.getWindowHandles();
		for (String w : windows) {
			if (!parent.equals(windows)) {
				driver.switchTo().window(w);
			}
			driver.findElement(By.xpath("//input[@id=\"UserFirstName-HaWR\"]")).sendKeys("vaibhav");
			*/
		}
		
	}


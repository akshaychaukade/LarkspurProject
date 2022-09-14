package com.PavanBokadePackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pavanBokadeClass {
	@Test
	public void m101() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		System.out.println("I am Pavan Jadhao");
	}
}

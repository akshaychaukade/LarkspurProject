package com.pavanJadhao.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PavanJadhaoClassFirst {
	@Test
	public void PavanJadhaoFirstMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/");
	}
}

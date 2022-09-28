package com.akshay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
	public void m1(){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement select = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		Select slc = new Select(select);
		int i = slc.getOptions().size();
		slc.selectByIndex(i - 2);
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		String s = driver.findElement(By.xpath("//div[@class=\"right-align\"]//tr[4]//td[1]")).getText();
		System.out.println(s);
		boolean a = driver.findElement(By.cssSelector("a[href=\"https://www.rahulshettyacademy.com/\"] img"))
				.isDisplayed();
		System.out.println(a);

	}
}

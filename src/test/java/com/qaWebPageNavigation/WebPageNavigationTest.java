package com.qaWebPageNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebPageNavigationTest {

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}

	@Test
	public void webpageNavigation() {
	
		driver.findElement(By.linkText("Tablets")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"HP Banner\"]")).isDisplayed());

	}

	@AfterMethod
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}

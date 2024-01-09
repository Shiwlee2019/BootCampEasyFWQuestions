package com.qaTNLandingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LadingPageTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}

	@Test
	public void navigateToWebpage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		System.out.println(driver.getTitle());

		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";

		if (driver.getTitle().equals(expectedTitle)) {
			System.out.println("Webpage title is correct");
		} else {
			System.out.println("Webpage title is incorrect");
		}

	}

	@AfterMethod
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}

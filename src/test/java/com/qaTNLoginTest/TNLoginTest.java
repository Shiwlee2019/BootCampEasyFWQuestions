package com.qaTNLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNLoginTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}

	@Test
	public void loginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("Shiwlee2011@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Rima2022");
		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).submit();

		String actualEditAccountInfoLink = driver.findElement(By.linkText("Edit your account information")).getText();
		String expectededitAccountInfoLink = "Edit your account information";

		System.out.println(actualEditAccountInfoLink.equals(expectededitAccountInfoLink));
		
	}
	@AfterMethod
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}

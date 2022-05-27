package com.tcs.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junittask {

	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();

		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

	@Test
	public void userName() {
WebElement txtUserName = driver.findElement(By.id("username"));
txtUserName.sendKeys("");

WebElement txtPass = driver.findElement(By.id("password"));
txtPass.sendKeys("Hello@1236");

WebElement btnLogin = driver.findElement(By.id("login"));
btnLogin.click();
	}
	
	
}

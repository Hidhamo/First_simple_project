package com.tcs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Welcometomaven {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("9445110408");

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Hifb@123");

		WebElement btnLogIn = driver.findElement(By.xpath("//button[text()='Log In']"));
		btnLogIn.click();
		 
	}

}

package com.tcs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement clkSign = driver.findElement(By.xpath("//a[text()='Sign up']"));
		clkSign.click();

		WebElement txtMon = driver.findElement(By.name("month"));

		Select select = new Select(txtMon);

		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.println(text);
			
			File file = new File("E:\\Dhamotharan\\Green Technologies\\Simple\\Excel\\Test.xlsx");
			Workbook wb = new XSSFWorkbook();
			org.apache.poi.ss.usermodel.Sheet createSheet = wb.createSheet("trail");
			Row createRow = createSheet.createRow(1);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(i);
			FileOutputStream out = new FileOutputStream(file);
			wb.write(out);

		}

	}

}

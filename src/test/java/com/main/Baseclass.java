package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}

	public static void loadUrl(String Url) {
		driver.get(Url);
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public void closeAllWindow() {
		driver.quit();
	}

	public void clear(WebElement element) {
		element.clear();

	}

	public WebElement findElementById(String value) {
		WebElement element = driver.findElement(By.id(value));
		return element;
	}

	public WebElement findElementByname(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}

	public WebElement findElementByclassname(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}

	public WebElement findElementByxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getAttributeName(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	public String getAttribute(WebElement element) {
		String attributeValue = element.getAttribute("value");
		return attributeValue;

	}

	public void selectOptionBytext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectOptionByattribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectOptionByindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void typejs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'," + text + ")", element);
	}

	public void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void dismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public void prompt(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
	}

	public void righclick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}

	public void MouseOver(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	public void doubleclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}

	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public String deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue("value");
		return value;
	}

	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void switchframebyWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchframebyindex(int index) {
		driver.switchTo().frame(index);
	}

	public void iframe() {
		driver.switchTo().defaultContent();
	}

	public void swtichtoParentFrame() {
		driver.switchTo().parentFrame();
	}

	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getWindowHandles() {
		Set<String> handles = driver.getWindowHandles();
		return handles;
	}

	public File screenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screen = screenshot.getScreenshotAs(OutputType.FILE);
		return screen;
	}

	public void downjs(WebElement down) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].scrollIntoView(true)", down);
	}

	public void upjs(WebElement up) {
		JavascriptExecutor e = (JavascriptExecutor) driver;
		e.executeScript("arguments[0].scrollIntoView(false)", up);
	}

	public void implicitwait(int index) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(index));
	}

	public void pageloadTimeOut(int index) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(index));
	}

	public void clickJs(WebElement e) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].click()", e);
	}

	public void backward() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void navigate(String url) {
		driver.navigate().to(url);
	}

	public void close() {
		driver.close();
	}

	public WebElement findElementBylinkText(String attributevalue) {
		WebElement element = driver.findElement(By.linkText(attributevalue));
		return element;
	}

	public WebElement findElementByPartiallinkText(String attributevalue) {
		WebElement element = driver.findElement(By.partialLinkText(attributevalue));
		return element;
	}

	public WebElement findElementBycssSelector(String attributevalue) {
		WebElement element = driver.findElement(By.cssSelector("value"));
		return element;
	}

	public void minimize() {
		driver.manage().window().minimize();
	}

	public WebElement findElementBytagname(String tagname) {
		WebElement element = driver.findElement(By.tagName(tagname));
		return element;
	}

	public List<WebElement> getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {

		String res = null;
		File file = new File("E:\\Dhamotharan\\Green Technologies\\Simple\\Excel\\Excelintegration.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();

			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
				res = dateFormat.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal d = BigDecimal.valueOf(numericCellValue);
				res = d.toString();

			}

		default:
			break;
		}
		return res;

	}

	public void updateData(String sheetName, int rowNum, int cellNum, String oldData, String newData)
			throws IOException {
		File file = new File("E:\\\\Dhamotharan\\\\Green Technologies\\\\Simple\\\\Excel\\\\Excelintegration.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook1 = new XSSFWorkbook(stream);
		Sheet sheet = workbook1.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell1 = row.getCell(cellNum);
		String value = cell1.getStringCellValue();
		if (value.equals(oldData)) {
			cell1.setCellValue(newData);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook1.write(out);

	}

	public void writeData(String sheetName, String Data, int rowNum, int cellNum) throws IOException {
		File file = new File("E:\\\\Dhamotharan\\\\Green Technologies\\\\Simple\\\\Excel\\\\Excelintegration.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook2 = new XSSFWorkbook(stream);
		Sheet sheet = workbook2.getSheet(sheetName);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(Data);
		FileOutputStream s = new FileOutputStream(file);
		workbook2.write(s);

	}

}

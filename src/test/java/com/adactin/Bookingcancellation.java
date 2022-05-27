package com.adactin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.Baseclass;

public class Bookingcancellation extends Baseclass {
	public Bookingcancellation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement txtOrderId;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement btnBookedItenary;

	@FindBy(id = "order_id_text")
	private WebElement searchorderid;

	@FindBy(id = "search_hotel_id")
	private WebElement goSearch;

	@FindBy(id = "check_all")
	private WebElement radiobtn;

	@FindBy(name = "cancelall")
	private WebElement cancelbtn;

	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	public WebElement getBtnBookedItenary() {
		return btnBookedItenary;
	}

	public WebElement getSearchorderid() {
		return searchorderid;
	}

	public WebElement getGoSearch() {
		return goSearch;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public void bookingcancel() throws IOException, InterruptedException {

		Thread.sleep(2000);
		getAttribute(txtOrderId);

		writeData("Test", getAttribute(txtOrderId), 2, 18);

		click(btnBookedItenary);
		type(searchorderid, getData("Test", 2, 18));
		click(goSearch);
		click(radiobtn);
		click(cancelbtn);
		accept();

	}

}

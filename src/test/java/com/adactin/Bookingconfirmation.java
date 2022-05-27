package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.Baseclass;

public class Bookingconfirmation extends Baseclass {
	public Bookingconfirmation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtCCNo;

	@FindBy(id = "cc_type")
	private WebElement dDnCCType;

	@FindBy(id = "cc_exp_month")
	private WebElement dDnExpMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement dDnExpYear;

	@FindBy(id = "cc_cvv")
	private WebElement dDnCcCvv;

	@FindBy(id = "book_now")
	private WebElement btnbooknow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNo() {
		return txtCCNo;
	}

	public WebElement getdDnCCType() {
		return dDnCCType;
	}

	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getdDnCcCvv() {
		return dDnCcCvv;
	}

	public WebElement getBtnbooknow() {
		return btnbooknow;
	}

	public void BookingConfirm(String FirstName, String LastName, String Address, String CCNo, String CCType,
			String ExpMonth, String ExpYear, String CcCvv) {

		type(getTxtFirstName(), FirstName);
		type(getTxtLastName(), LastName);
		type(getTxtAddress(), Address);
		type(getTxtCCNo(), CCNo);
		selectOptionBytext(getdDnCCType(), CCType);
		selectOptionBytext(getdDnExpMonth(), ExpMonth);
		selectOptionBytext(getdDnExpYear(), "2022");
		type(getdDnCcCvv(), CcCvv);
		click(getBtnbooknow());

	}

}

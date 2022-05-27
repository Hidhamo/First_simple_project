package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.Baseclass;

public class Selecthotel extends Baseclass {
	public Selecthotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="radiobutton_0")
	private WebElement btnradio;

	@FindBy(id = "continue")
	private WebElement btnContinue;


	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void SelectHotel() {
		
	click(getBtnradio());
	click(getBtnContinue());
	}
}
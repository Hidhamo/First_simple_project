package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.Baseclass;

import junit.framework.Assert;

public class Loginpage extends Baseclass {
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;
	
	@FindBy(id="username_show")
	private WebElement userNameShow;
	

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public WebElement getUserNameShow() {
		return userNameShow;
	}

	public void login(String Username, String Password) {
		type(getTxtUsername(), Username);
		type(getTxtPassword(), Password);
		click(getBtnLogin());
	}
}

package com.tcs.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.main.Baseclass;

import junit.framework.Assert;

public class Adactin extends Baseclass{

	public static void main(String[] args) throws IOException, InterruptedException {
		Baseclass baseclass = new Baseclass();

		Baseclass.getdriver();
		baseclass.loadUrl("https://adactinhotelapp.com/");
		baseclass.maximize();

		Thread.sleep(3000);
		WebElement textuser = baseclass.findElementById("username");
		String data = baseclass.getData("Trail", 1, 0);
		baseclass.type(textuser, data);

		WebElement textpass = baseclass.findElementById("password");
		String data2 = baseclass.getData("Trail", 1, 1);
		baseclass.type(textpass, data2);

		WebElement btnlogin = baseclass.findElementById("login");
		baseclass.click(btnlogin);

		WebElement locat = baseclass.findElementById("location");
		baseclass.selectOptionByindex(locat, 3);

		WebElement Hotels = baseclass.findElementById("hotels");
		baseclass.selectOptionByindex(Hotels, 4);

		WebElement room = baseclass.findElementById("room_type");
		baseclass.selectOptionByindex(room, 3);

		WebElement romnos = baseclass.findElementById("room_nos");
		baseclass.selectOptionByindex(romnos, 3);

		WebElement adult = baseclass.findElementById("adult_room");
		baseclass.selectOptionByindex(adult, 2);

		WebElement child = baseclass.findElementById("child_room");
		baseclass.selectOptionByindex(child, 3);

		WebElement search = baseclass.findElementById("Submit");
		baseclass.click(search);

		WebElement radio = baseclass.findElementById("radiobutton_0");
		baseclass.click(radio);

		WebElement cont = baseclass.findElementById("continue");
		baseclass.click(cont);

		WebElement txtfirst = baseclass.findElementById("first_name");
		String data3 = baseclass.getData("Trail", 1, 2);
		baseclass.type(txtfirst, data3);

		WebElement textlast = baseclass.findElementById("last_name");
		String data4 = baseclass.getData("Trail", 1, 3);
		baseclass.type(textlast, data4);

		WebElement txtadd = baseclass.findElementById("address");
		String data5 = baseclass.getData("Trail", 1, 4);
		baseclass.type(txtadd, data5);

		WebElement textcc = baseclass.findElementById("cc_num");
		String data6 = baseclass.getData("Trail", 1, 5);
		baseclass.type(textcc, data6);

		WebElement cctype = baseclass.findElementById("cc_type");
		baseclass.selectOptionByindex(cctype, 3);

		WebElement ccmonth = baseclass.findElementById("cc_exp_month");
		baseclass.selectOptionByindex(ccmonth, 2);

		WebElement ccyear = baseclass.findElementById("cc_exp_year");
		baseclass.selectOptionByindex(ccyear, 2);

		WebElement ccv = baseclass.findElementById("cc_cvv");
		String data7 = baseclass.getData("Trail", 1, 6);
		baseclass.type(ccv, data7);

		WebElement btnbook = baseclass.findElementById("book_now");
		baseclass.click(btnbook);

		Thread.sleep(5000);

		WebElement typeorder = baseclass.findElementById("order_no");
		String attribute = baseclass.getAttribute(typeorder);
		baseclass.writeData("Trail", attribute, 1, 7);
	}

}

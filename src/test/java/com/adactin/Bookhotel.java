package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.Baseclass;

public class Bookhotel extends Baseclass {

	public Bookhotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement dDnlocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnRoomNo;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildrenPerRoom;
	
	@FindBy(id = "Submit")
	private WebElement btnSubmit;



	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}
	
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void Bookhhotel(String location, String hotels, String room_type, String room_nos, String datepick_in,
			String datepick_out, String adult_room, String child_room) {
		selectOptionBytext(getdDnlocation(), location);
		selectOptionBytext(getdDnHotels(), hotels);
		selectOptionBytext(getdDnRoomType(), room_type);
		selectOptionBytext(getdDnRoomNo(), room_nos);
		clear(getTxtCheckInDate());
		type(getTxtCheckInDate(), datepick_in);
		clear(getTxtCheckOutDate());
		type(getTxtCheckOutDate(), datepick_out);
		selectOptionBytext(getdDnAdultsPerRoom(), adult_room);
		selectOptionBytext(getdDnChildrenPerRoom(), child_room);
		click(getBtnSubmit());
	}

}
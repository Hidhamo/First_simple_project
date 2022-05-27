package com.adactin;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.main.Baseclass;

public class Sample extends Baseclass {

	@BeforeClass
	public static void broswerSetup() {
		getdriver();
		loadUrl("http://adactinhotelapp.com/index.php");
		maximize();

	}

	@Test
	public void Loginpage() throws IOException, InterruptedException {
		Loginpage loginpage = new Loginpage();
		String username = getData("Test", 1, 0);
		String password = getData("Test", 1, 1);
		
		
		
		loginpage.login(username, password);
	
		

		Bookhotel bh = new Bookhotel();
		String location = getData("Test", 1, 2);
		String hotels = getData("Test", 1, 3);
		String room_type = getData("Test", 1, 4);
		String room_nos = getData("Test", 1, 5);
		String datepick_in = getData("Test", 1, 6);
		String datepick_out = getData("Test", 1, 7);
		String adult_room = getData("Test", 1, 8);
		String child_room = getData("Test", 1, 9);

		bh.Bookhhotel(location, hotels, room_type, room_nos, datepick_in, datepick_out, adult_room, child_room);

		Selecthotel selecthotel = new Selecthotel();

		selecthotel.SelectHotel();

		Bookingconfirmation bookingcon = new Bookingconfirmation();
		String FirstName = getData("Test", 1, 10);
		String LastName = getData("Test", 1, 11);
		String Address = getData("Test", 1, 12);
		String CCNo = getData("Test", 1, 13);
		String CCType = getData("Test", 1, 14);
		String ExpMonth = getData("Test", 1, 15);
		String ExpYear = getData("Test", 1, 16);
		String CcCvv = getData("Test", 1, 17);

		bookingcon.BookingConfirm(FirstName, LastName, Address, CCNo, CCType, ExpMonth, ExpYear, CcCvv);

		Thread.sleep(5000);

		Bookingcancellation bookcancel = new Bookingcancellation();

		bookcancel.bookingcancel();

	}

}

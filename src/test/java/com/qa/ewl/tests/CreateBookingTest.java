package com.qa.ewl.tests;


import org.testng.annotations.Test;

import com.qa.ewl.base.BaseTest;

public class CreateBookingTest extends BaseTest{

	@Test
	public void createNewBooking() throws InterruptedException {
		dashboard=loginPage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());	
		dashboard.ClickBookings();
		bookinglist =dashboard.ClickBookingList();
		createBooking = bookinglist.clickAddNewBookingBtn();
		bookingdetails = createBooking.createBooking();
		bookingdetails.bookingFlow();


	}

}

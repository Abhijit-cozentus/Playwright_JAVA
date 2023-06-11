package com.qa.ewl.base;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.qa.ewl.factory.PlaywrightFactory;
import com.qa.ewl.pages.BookingDetailsPage;
import com.qa.ewl.pages.BookingListPage;
import com.qa.ewl.pages.CreateBookingPage;
import com.qa.ewl.pages.Dashboard;
import com.qa.ewl.pages.LoginPage;

public class BaseTest {
	
	PlaywrightFactory pf;
	Page page;
	protected Properties prop;
	
	protected LoginPage loginPage;
	protected Dashboard dashboard;
	protected BookingListPage bookinglist;
	protected CreateBookingPage createBooking;
	protected BookingDetailsPage bookingdetails;

	@BeforeTest
	public void setup() {
		pf = new PlaywrightFactory();
		prop=pf.init_prop();
		page = pf.initBrowser(prop);
		loginPage = new LoginPage(page);	
	}
	
	@AfterTest
	public void tearDown() {
		page.context().browser().close();		
	}

}

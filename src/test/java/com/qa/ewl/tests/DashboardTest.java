package com.qa.ewl.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ewl.base.BaseTest;
import com.qa.ewl.constant.AppConstant;

public class DashboardTest extends BaseTest {
	

	@Test
	public void navigateToBookingList() {
		dashboard=loginPage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());	
		dashboard.ClickBookings();
		bookinglist =dashboard.ClickBookingList();
		String acttitle= bookinglist.getPagetitle();
		Assert.assertEquals(acttitle, AppConstant.BOKKINGLIST_PAGE_TITLE);
		
	}

	
	
	
	
}

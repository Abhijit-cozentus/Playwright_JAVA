package com.qa.ewl.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ewl.base.BaseTest;
import com.qa.ewl.constant.AppConstant;

public class BookingListTest extends BaseTest{
	
	@Test
	public void BookingListTitleTest() {
		String actualTitle = bookinglist.getPagetitle();
		Assert.assertEquals(actualTitle, AppConstant.BOKKINGLIST_PAGE_TITLE);			
	}
	



}

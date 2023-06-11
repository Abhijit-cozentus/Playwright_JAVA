package com.qa.ewl.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ewl.base.BaseTest;
import com.qa.ewl.constant.AppConstant;

public class LoginPageTest extends BaseTest {


	@Test
	public void LoginPageTitleTest() {
		String actualTitle = loginPage.LoginPageTitle();
		Assert.assertEquals(actualTitle, AppConstant.LOGIN_PAGE_TITLE);			
	}

	@Test
	public void LoginTest() throws InterruptedException {	
		dashboard=loginPage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());	
		Thread.sleep(8000);
		String pageTitle = dashboard.dashboardTitle();
		Assert.assertEquals(pageTitle, AppConstant.DASHBORD_PAGE_TITLE);
		}








}

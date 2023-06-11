package com.qa.ewl.pages;


import com.microsoft.playwright.Page;

import java.util.Properties;

public class LoginPage {

	private Page page;
	Properties prop;

	private String username = "//*[@id=\"mat-input-0\"]";
	private String password = "//*[@id=\"mat-input-1\"]";
	private String loginBtn = "//button[@type='submit']";


	public LoginPage(Page page) {
		this.page = page;	
	}



	public String LoginPageTitle() {
		String title = page.title();
		System.out.println("page title is: " + title);
		return title;
	}

	public void enterUsername() {
		page.fill(username,prop.getProperty(username));

	}

	public void enterPassword () {
		page.fill(password,prop.getProperty(password));

	}

	public void clickLoginBtn() {
		page.click(loginBtn);

	}

	public Dashboard doLogin(String appUsername,String appPassword) {
		page.fill(username,appUsername);
		page.fill(password,appPassword);
		page.click(loginBtn);
		return new Dashboard(page);
	}






}

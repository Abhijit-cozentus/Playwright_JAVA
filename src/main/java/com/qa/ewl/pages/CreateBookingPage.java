package com.qa.ewl.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CreateBookingPage {

	Page page;


	private String customer = "//input[@placeholder='Customer']";
	private String supplier = "//input[@placeholder='Supplier']";
	private String confirmBtn = "//button[@color='primary']";
	private String cleOpt= "//span[normalize-space()='CLE01 |']";
	private String ajedgeOpt= "//span[normalize-space()='AJEDGE |']";
	public CreateBookingPage(Page page) {
		this.page = page;	
	}


	public String getPagetitle() {
		String title= page.title();
		System.out.println("CreateBooking page title is " + title);
		return title;

	}

	public void fillCustomer()  {
		page.fill(customer, "cle");
		page.click(cleOpt);
	}

	public void fillSupplier()  {
		page.fill(supplier, "aj");
		page.click(ajedgeOpt);
	}

	public BookingDetailsPage clickConfirm() {
		page.click(confirmBtn);
		return new BookingDetailsPage(page);
	}
	
	public BookingDetailsPage createBooking() {
		fillCustomer();
		fillSupplier();
		clickConfirm();
		return new BookingDetailsPage(page);

	}
}

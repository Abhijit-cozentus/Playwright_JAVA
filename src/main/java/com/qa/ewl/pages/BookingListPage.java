package com.qa.ewl.pages;

import com.microsoft.playwright.Page;

public class BookingListPage {

	Page page;
	
	private String newBookingBtn ="//button[@mattooltip='New Booking']";
	private String booking = "//mat-icon[normalize-space()='create_new_folder']";
	private String bookingList ="//span[normalize-space()='Booking List']";
	private String searchBar ="//input[@data-placeholder='Ref, Agent Ref, POL, PO, Supplier & Customer']";
	private String bookingId ="body app-root mat-cell:nth-child(7)";
	private String statesDropdown ="//mat-select[@placeholder='States']";
	private String statesSelectAllOpt ="//div[@role='listbox']//mat-checkbox";
	private String AwaitingApprovalOpt ="//span[normalize-space()='AwaitingApproval']";
	private String listCount ="body > app-root:nth-child(1) > block-ui:nth-child(1) > app-main-layout:nth-child(2) > div:nth-child(1) > mat-sidenav-container:nth-child(2) > mat-sidenav-content:nth-child(5) > div:nth-child(1) > app-booking-list:nth-child(2) > mat-card:nth-child(2) > mat-card-content:nth-child(1) > div:nth-child(3) > mat-paginator:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)";
	private String toolbar ="//mat-toolbar[@color='primary']";
	
	
	
	public BookingListPage(Page page) {
		this.page=page;
	}
	
	
	public String getPagetitle() {
	String title= page.title();
	System.out.println("BookingList page title is "+ title);
	return title;	
	}
	
	public CreateBookingPage clickAddNewBookingBtn() {
		page.click(newBookingBtn);
		return new CreateBookingPage(page);
	}
	
	
	
}

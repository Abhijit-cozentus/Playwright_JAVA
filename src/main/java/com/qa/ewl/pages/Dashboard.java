package com.qa.ewl.pages;

import com.microsoft.playwright.Page;

public class Dashboard {
	
	Page page;
	
	private String bookings = "//mat-icon[normalize-space()='create_new_folder']";
	private String bookingList = "//span[normalize-space()='Booking List']";
	private String jobs = "//mat-icon[normalize-space()='travel_explore']";
	private String jobList ="//span[normalize-space()='Job List']";
	private String finance = "#mat-expansion-panel-header-9";
	
	public Dashboard(Page page) {
		this.page=page;
	}
	
	public String dashboardTitle() {
		String title =page.title();
		System.out.println("dashboad page title is: " + title);
		return title;
	}
	
	public void ClickBookings() {
		page.click(bookings);
	}
	
	public BookingListPage ClickBookingList() {
		page.click(bookingList);
		return new BookingListPage(page);
	}
	
	public JobListPage ClickToJobList() {
		page.click(jobList);	
		return new JobListPage(page);

	}
	
	public void ClickJobs() {
		page.click(jobs);
		
	}

}

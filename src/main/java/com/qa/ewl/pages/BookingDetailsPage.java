package com.qa.ewl.pages;


import com.microsoft.playwright.Page;

public class BookingDetailsPage {

	Page page;
	
	
	private String pol =   "//input[@placeholder='POL']";
	private String dkaabOpt= "//span[normalize-space()='DKAAB |']";
	private String pod =   "//input[@placeholder='POD']";
	private String dkaalOpt="//span[normalize-space()='DKAAL |']";
	private String incoTerm =   "//components-generic-select[@placeholder='Inco Term']//span";
	private String cifOPT = "//span[normalize-space()='CIF |']";
	private String saveBtn =   "//span[normalize-space()='Save']";
	private String sailingIcon =   "//mat-icon[normalize-space()='directions_boat']";
	private String addNewSailing =   "//span[contains(text(),'Add new')]";
	private String vessel =   "//input[@placeholder='Vessel']";
	private String archimidsOpt="//span[normalize-space()='ARCHIMIDIS']";
	private String voyage =   "//input[@id='voyage']";
	private String carrier =   "//input[@placeholder='Carrier']";
	private String carrierOpt="//span[normalize-space()='086AIRNZ |']";
	private String ETD =   "//control-date-picker[@placeholder='ETD']//input[@formcontrolname='innerValue']";
	private String ETA =   "//control-date-picker[@placeholder='ETA']//input[@formcontrolname='innerValue']";
	private String sailingSave =   "//mat-icon[normalize-space()='save']";
	private String euipmentDetails20gp =   "//input[@placeholder='20GP']";
	private String euipmentDetailsLcl =   "//input[@placeholder='LCL']";
	private String itemDetails =   "//span[contains(text(),'Item Details')]";
	private String addNewOrder =   "//mat-icon[normalize-space()='plus_one']";
	private String orderNumber =   "//input[@placeholder='Order Number']";
	private String carierRef =   "//input[@placeholder='Carrier Ref']";
	private String markAndNumbers =   "//input[@placeholder='Marks and numbers']";
	private String cbm =   "//input[@placeholder='Cbm']";
	private String weight =   "//input[@placeholder='weight']";
	private String cartons =   "//input[@placeholder='Cartons']";
	private String sa =   "//span[normalize-space()='SA']";
	private String sendToSa =   "//span[normalize-space()='Send to SA']";
	private String selectSailing=  "//span[normalize-space()='Select']";
	private String approve =   "//span[normalize-space()='Approve']";
	private String headerDetail=   "//span[contains(text(),'Header Details')]";
	private String refId =   "//body/app-root/block-ui/app-main-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-edit-booking/mat-card/mat-card-content/div[1]";
	private String sentToAgentBtn =   "//span[normalize-space()='Send to Agent']";
	private String popUpSentToAgentBtn=   "//button[@type='button']//span[contains(text(),'Send to Agent')]";
	private String serviceContractField=   "//body[1]/app-root[1]/block-ui[1]/app-main-layout[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-edit-booking[1]/mat-card[1]/mat-card-content[1]/div[4]/app-booking-sea-fcl-capture[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/booking-select-schedules[1]/div[1]/div[2]/mat-table[1]/mat-row[1]/mat-cell[5]/mat-form-field[1]/div[1]/div[2]/div[1]/input[1]";
	private String confirmBookingBtn=   "//span[normalize-space()='Confirm Booking']";
	private String popUpConfrimbookingBtn=   "//button[@type='button']//span[contains(text(),'Confirm Booking')]";
	private String settingBtn=   "//mat-icon[normalize-space()='settings']";
	private String converToSI = "//span[normalize-space()='Convert to job (SI)']";
	private String popUpConvertToSI= "//span[normalize-space()='Convert to job (SI)']";
	
	
	
	
	public BookingDetailsPage(Page page) {
		this.page=page;
	}
	
	public void fillPOL() {
		page.fill(pol, "a");
		page.click(dkaabOpt);
		
	}
	
	public void fillPOD() {
		page.fill(pod, "a");
		page.click(dkaalOpt);
	}
	
	public void clickIncoTerm() {
		page.click(incoTerm);
		page.click(cifOPT);
		
	}
	
	public void clickSave() {
		page.click(saveBtn);
	}
	
	public void clickSailingBtn() {
		page.click(sailingIcon);
	}
	
	public void clickAddNewSailingTab() {
		page.click(addNewSailing);
		
	}
	
	public void fillVessel() {
		page.fill(vessel, "a");
		page.click(archimidsOpt);
		
	}
	
	public void fillVoyage() {
		page.fill(voyage, "Test Voyage");
	}
	
	public void fillETD() {
		page.fill(ETD, "1/5/2023");
	}
	
	public void fillETA() {
		page.fill(ETA,"6/5/2023");
		
	}
	
	public void fillCarrier() {
		page.fill(carrier, "a");
		page.click(carrierOpt);
			
	}
	
	public void clickSalingSave() {
		page.click(sailingSave);
		
	}
	
	public void fillServiceContract() {
		page.fill(serviceContractField, "Test Service contract");
	}
	public void fillEquipmentDetails() {
		page.fill(euipmentDetails20gp, "1");

	}
	
	public void clickItemDetailsTab() {
		page.click(itemDetails);
	}
	
	public void clickAddnewOrder() {
		page.click(addNewOrder);
	}
	
	public void fillOrderNumber() {
		page.fill(orderNumber, "Test Order 12");
		
	}
	
	public void fillCarrierRef() {
		page.fill(carierRef, "Test@1323");
	}
	
	public void fillOrder() {
	page.fill(markAndNumbers, "@test");
	page.fill(cbm, "1");
	page.fill(weight, "125");
	page.fill(cartons, "12");
	}
	
	public void clickSendToSA() {
		page.click(sendToSa);
	}
	
	public void clickSA() {
		page.click(sa);
		
	}
	
	public void selectSailing() {
	page.click(selectSailing);	
	
	}
	
	public void clickApprove() {
		page.click(approve);
	}
	
	public void clickSentToAgent() {
		page.click(sentToAgentBtn);
		page.click(popUpSentToAgentBtn);
	}
	
	public void clickConfirmBooking() {
		page.click(confirmBookingBtn);
		page.click(popUpConfrimbookingBtn);
	}
	
	public void clickConvrtToSI() {
		page.click(settingBtn);
		page.click(converToSI);
		page.click(popUpConvertToSI);
	}
	
	public void bookingFlow() throws InterruptedException {
		fillPOL();
		fillPOD();
		clickIncoTerm();
		clickSave();
		clickSailingBtn();
		Thread.sleep(2000);
		clickAddNewSailingTab();
		fillVessel();
		fillVoyage();
		fillCarrier();
		fillETD();
		fillETA();
		clickSalingSave();
		fillServiceContract();
		fillEquipmentDetails();
		clickItemDetailsTab();
		clickAddnewOrder();
		fillOrderNumber();
		fillCarrierRef();
		fillOrder();
		clickSendToSA();
		clickSA();
		selectSailing();
		clickApprove();
		clickSentToAgent();
		clickConfirmBooking();
		clickConvrtToSI();
		Thread.sleep(5000);
	}
}
























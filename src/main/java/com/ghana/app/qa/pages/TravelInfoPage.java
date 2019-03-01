package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class TravelInfoPage extends TestBase{

	public TravelInfoPage() throws IOException, InterruptedException {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='departure_date']")
	WebElement departureDate ;
	
	@FindBy(xpath = "//span[text()='Is Applicant in Possession of Round Ticket?']")
	WebElement isApplicantPossessionRoundTicket ;
	
	@FindBy(xpath = "//li[text()='Yes']")
	WebElement yes ;
	
	@FindBy(xpath = "//li[text()='No']")
	WebElement no ;
	
	@FindBy(id = "ticket_number")
	WebElement ticketNumber ;
	
	@FindBy(xpath = "//span[text()='Traveling By']")
	WebElement travelingBy ;
	
	@FindBy(xpath = "//li[text()='Air']")
	WebElement air ;
	
	@FindBy(xpath = "//li[text()='Ship']")
	WebElement ship ;
	
	@FindBy(xpath = "//li[text()='Road']")
	WebElement road ;
	
	@FindBy(xpath = "//li[text()='Train']")
	WebElement train ;
	
	@FindBy(xpath = "//input[@id='purpose_of_journey']")
	WebElement purpose_of_journey ;
	@FindBy(xpath = "//ul[@id='img_category_options']//li[text()='Visit Family']")
	WebElement VisitFamily;
	
	@FindBy(xpath = "//input[@id='primary_ref_firstname']")
	WebElement primaryRefFirstname ;
	
	@FindBy(xpath = "//label[@for='primary_ref_lastname']")
	WebElement primary_ref_lastname ;
	
	@FindBy(xpath = "//input[@id='primary_ref_address']")
	WebElement primary_ref_address ;
	
	@FindBy(xpath = "//label[@for='primary_ref_pincode']")
	WebElement primary_ref_pincode ;

	@FindBy(xpath = "//input[@id='primary_ref_city']")
	WebElement primary_ref_city ;
	
	@FindBy(xpath = "//input[@id='primary_ref_state']")
	WebElement primary_ref_state ;
	
	@FindBy(xpath = "//input[@id='primary_ref_country']")
	WebElement primary_ref_country;
	
	@FindBy(xpath = "//input[@id='primary_ref_phone_number']")
	WebElement primary_ref_phone_number ;
	
	@FindBy(xpath = "//input[@id='secondary_ref_firstname']")
	WebElement secondaryRefFirstname ;
	
	@FindBy(xpath = "//label[@for='secondary_ref_lastname']")
	WebElement secondary_ref_lastname ;
	
	@FindBy(xpath = "//input[@id='secondary_ref_address']")
	WebElement secondary_ref_address ;
	
	@FindBy(xpath = "//label[@for='secondary_ref_pincode']")
	WebElement secondary_ref_pincode ;

	@FindBy(xpath = "//input[@id='secondary_ref_city']")
	WebElement secondary_ref_city ;
	
	@FindBy(xpath = "//input[@id='secondary_ref_state']")
	WebElement secondary_ref_state ;
	
	@FindBy(xpath = "//input[@id='secondary_ref_country']")
	WebElement secondary_ref_country;
	
	@FindBy(xpath = "//input[@id='secondary_ref_phone_number']")
	WebElement secondary_ref_phone_number;
	
	@FindBy(id = "by_phone_checkbox")
	WebElement by_phone_checkbox ;
	
	@FindBy(id = "by_email_checkbox")
	WebElement by_email_checkbox;
	
	@FindBy(id = "by_text_message_checkbox")
	WebElement by_text_message_checkbox ;
	
	@FindBy(id = "applicant_travel_information_form_btn")
	WebElement applicant_travel_information_form_btn ;
	
	@FindBy(xpath = "//form[@name='applicant_travel_information_form']//input[@value='Previous']")
	WebElement previous ;
	
	
	public void passDateOfDeparture(String date){
		departureDate.sendKeys(date);
		
	}
	public void clickOnIsApplicantPossessionRoundTicket(){
		TestUtil.actionClassMethod(isApplicantPossessionRoundTicket);
		
	}
	public void clickOnYes(){
		yes.click();
		
	}
	public void passTicketNumber(String ticketNO){
		ticketNumber.sendKeys(ticketNO);
		
	}
	public void clickOnTravelBy(){
		TestUtil.actionClassMethod(travelingBy);
		
	}
	public void clickOnTravelByAir(){
		air.click();
		
	}
	public void clickOnTravelByShip(){
		ship.click();
		
	}
	public void clickOnTravelByRoad(){
		road.click();
		
	}
	public void clickOnTravelByTrain(){
		train.click();
		
	}
	public void clickPurpose_of_journey() throws InterruptedException{
		TestUtil.actionClassMethod(purpose_of_journey);
		Thread.sleep(1000);
		VisitFamily.click();
		
	}
	public void passPrimaryRefFirstname(String firstname){
		primaryRefFirstname.sendKeys(firstname);
		
	}
	public void passPrimaryRefLastname(String lastName){
		primary_ref_lastname.sendKeys(lastName);
		
	}
	
	public void pass_Primary_ref_address(String adress){
		primary_ref_address.sendKeys(adress);
		
	}
	public void pass_primary_ref_pincode(String pincode){
		primary_ref_pincode.sendKeys(pincode);
		
	}
	public void pass_primary_ref_city(String city){
		primary_ref_city.sendKeys(city);
		
	}
	public void pass_primary_ref_state(String state){
		primary_ref_state.sendKeys(state);
		
	}
	
	public void pass_primary_ref_country(String country){
		primary_ref_country.sendKeys(country);
		
	}
	public void pass_primary_ref_phone_number(String phoneNo){
		primary_ref_phone_number.sendKeys(phoneNo);
		
	}
	
	public void passsecondaryRefFirstname(String firstname){
		secondaryRefFirstname.sendKeys(firstname);
		
	}
	public void pass_secondary_ref_lastname(String lastName){
		secondary_ref_lastname.sendKeys(lastName);
		
	}
	
	public void pass_secondary_ref_address(String adress){
		secondary_ref_address.sendKeys(adress);
		
	}
	public void pass_secondary_ref_pincode(String pincode){
		secondary_ref_pincode.sendKeys(pincode);
		
	}
	public void pass_secondary_ref_city(String city){
		secondary_ref_city.sendKeys(city);
		
	}
	public void pass_secondary_ref_state(String state){
		secondary_ref_state.sendKeys(state);
		
	}
	
	public void pass_secondary_ref_country(String country){
		secondary_ref_country.sendKeys(country);
		
	}
	public void pass_secondary_ref_phone_number(String phoneNo){
		secondary_ref_phone_number.sendKeys(phoneNo);
		
	}
	public void PassSecondaryRefDetails(String sec_firstname, String sec_lastName, String sec_adress, String sec_pincode, String sec_city, String sec_state, String sec_country, String sec_phoneNo){
		secondaryRefFirstname.sendKeys(sec_firstname);
		secondary_ref_lastname.sendKeys(sec_lastName);
		secondary_ref_address.sendKeys(sec_adress);
		secondary_ref_pincode.sendKeys(sec_pincode);
		secondary_ref_city.sendKeys(sec_city);
		secondary_ref_state.sendKeys(sec_state);
		secondary_ref_country.sendKeys(sec_country);
		secondary_ref_phone_number.sendKeys(sec_phoneNo);
	}
	public void clickOnContinuebutton(){
		applicant_travel_information_form_btn.click();
		
	}
	public void clickOnPreviuosbutton(){
		previous.click();
		
	}

	
}

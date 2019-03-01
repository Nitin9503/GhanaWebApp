package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class EmergencyContactPage extends TestBase {

	
	public EmergencyContactPage()throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	// element id for emergency contact
	@FindBy(xpath="//input[@id='emergency_firstname']")
	WebElement emergency_firstname;
	@FindBy(xpath="//input[@id='emergency_lastname']")
	WebElement emergency_lastname;
	@FindBy(xpath="//span[text()='Relationship']")
	WebElement Relationship;
	@FindBy(xpath="//ul[@id='img_category_options']/li[text()='Mother']")
	WebElement Mother;
	@FindBy(xpath="//input[@id='emergency_phone_number']")
	WebElement emergency_phone_number;
	@FindBy(xpath="//input[@id='emergency_profession']")
	WebElement emergency_profession;
	@FindBy(xpath="//input[@id='emergency_employer_name']")
	WebElement emergencyCompanyOrSchoolname;
	@FindBy(xpath="//input[@id='emergency_employer_address']")
	WebElement emergency_employer_address;
	@FindBy(xpath="//input[@id='emergency_pincode']")
	WebElement emergency_pincode;
	@FindBy(xpath="//input[@id='emergency_city']")
	WebElement emergency_city;
	@FindBy(xpath="//input[@id='emergency_state']")
	WebElement emergency_state;
	@FindBy(xpath="//input[@id='emergency_country']")
	WebElement emergency_country;
	@FindBy(xpath="//input[@id='emergency_employer_phone_number']")
	WebElement emergency_employer_phone_number;
	@FindBy(xpath="//div[@id='nav-contact']//input[@value='Previous']")
	WebElement Previousbtn;
	@FindBy(xpath="//button[@id='applicant_emergency_contact_form_btn']")
	WebElement emergencySaveAndContinuebtn;
		
			
		
	public void emergencyContactDetails(String eFirstName, String eLastName, String eContactNo){
		emergency_firstname.sendKeys(eFirstName);
		emergency_lastname.sendKeys(eLastName);
		emergency_phone_number.sendKeys(eContactNo);
	}
	
	public void selectRelation(){
		TestUtil.actionClassMethod(Relationship);
		Mother.click();
	}
	public void emergencyProfessionDetails(String empProfession, String employerOrSchoolName, String employerOrSchooladdress, String ePincode, String eCity, String eState, String eCountry, String eSchoolContactNo){
		emergency_profession.sendKeys(empProfession);
		emergencyCompanyOrSchoolname.sendKeys(employerOrSchooladdress);
		emergency_pincode.sendKeys(ePincode);
		emergency_employer_address.sendKeys(employerOrSchooladdress);
		emergency_city.sendKeys(eCity);
		emergency_state.sendKeys(eState);
		emergency_country.sendKeys(eCountry);
		emergency_employer_phone_number.sendKeys(eSchoolContactNo);
		emergencySaveAndContinuebtn.click();
		
		
		
		
		
	}
}

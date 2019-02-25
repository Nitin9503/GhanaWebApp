package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class ReviewApplicationPage extends TestBase{

	public ReviewApplicationPage() throws IOException, InterruptedException {
   PageFactory.initElements(driver, this);
	}
	
	//Personal Info
	@FindBy(xpath = "//label[@id='lbl_name']")
	WebElement firstLastName ;
	
	@FindBy(xpath = "//label[@id='lbl_birth']")
	WebElement birthDate ;
	
	@FindBy(xpath = "//label[@id='lbl_birth']")
	WebElement birthPlace ;
	
	@FindBy(xpath = "//label[@id='lbl_passport']")
	WebElement passportNumber ;
	
	@FindBy(xpath = "//label[@id='lbl_passport']")
	WebElement passportIssuedDate ;
	
	@FindBy(xpath = "//label[@id='lbl_passport']")
	WebElement passportExpiryDate ;
	
	// Address info
	@FindBy(xpath = "//label[@id='lbl_address']")
	WebElement address ;
	
	@FindBy(xpath = "//label[@id='lbl_pin']")
	WebElement pinCode ;
	
	@FindBy(xpath = "//label[@id='lbl_pin']")
	WebElement cityName ;
	
	@FindBy(xpath = "//label[@id='lbl_pin']")
	WebElement stateName ;
	
	@FindBy(xpath = "//label[@id='lbl_pin']")
	WebElement countryName ;
	
	@FindBy(xpath = "//label[@id='lbl_address_type']")
	WebElement addressType ;
	
	@FindBy(xpath = "//label[@id='lbl_nationality']")
	WebElement nationality ;
	
	@FindBy(xpath = "//label[@id='lbl_nationality']")
	WebElement formerNationality ;
	
	@FindBy(xpath = "//label[@id='lbl_email']")
	WebElement emailId ;
	
	@FindBy(xpath = "//label[@id='lbl_phone']")
	WebElement phoneNumber ;
	
	// Emergency contact
	@FindBy(xpath = "//label[@id='lbl_em_name']")
	WebElement emerContactName ;
	
	@FindBy(xpath = "//label[@id='lbl_reln']")
	WebElement relationShip ;
	
	@FindBy(xpath = "//label[@id='lbl_em_phon']")
	WebElement emerPhoneNumber ;
	
	@FindBy(xpath = "//label[@id='lbl_profession']")
	WebElement profession ;
	
	@FindBy(xpath = "//label[@id='lbl_employer']")
	WebElement employer ;
	
	@FindBy(xpath = "//label[@id='lbl_em_address']")
	WebElement employerAddress ;
	
	@FindBy(xpath = "//label[@id='lbl_em_pin']")
	WebElement emerPincode ;
	
	@FindBy(xpath = "//label[@id='lbl_em_pin']")
	WebElement emerCityName ;
	
	@FindBy(xpath = "//label[@id='lbl_profession']")
	WebElement emerState ;
	
	@FindBy(xpath = "//label[@id='lbl_profession']")
	WebElement emerCountry ;
	
	@FindBy(xpath = "//label[@id='lbl_em_phone']")
	WebElement emerEmployerPhoneNumber ;
	
	// Travel Info
	
	@FindBy(xpath = "//label[@id='lbl_depart']")
	WebElement dateOfDeparture ;
	
	@FindBy(xpath = "//label[@id='lbl_tkt_no']")
	WebElement ticketNumber ;
	
	@FindBy(xpath = "//label[@id='lbl_tkt_no']")
	WebElement roundTicket ;
	
	@FindBy(xpath = "//label[@id='lbl_trav_by']")
	WebElement travellingBy ;
	
	@FindBy(xpath = "//label[@id='lbl_reach']")
	WebElement reachBy ;
	
	//Primary Reference
	@FindBy(xpath = "//label[@id='lbl_tr_name']")
	WebElement primaryFirstLastName ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_address']")
	WebElement primaryAddress ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_pin']")
	WebElement primaryPinCode ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_pin']")
	WebElement primaryCity ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_pin']")
	WebElement primaryState ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_pin']")
	WebElement primaryCountry ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_ref']")
	WebElement primaryRefrencePhoneNo ;
	
	// Secondary Reference
	
	@FindBy(xpath = "//label[@id='lbl_tr_name2']")
	WebElement secondaryFirstLastName ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_address2']")
	WebElement secondaryAddress ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_pin2']")
	WebElement secondaryPinCode ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_pin2']")
	WebElement secondaryCity ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_pin2']")
	WebElement secondaryState ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_pin2']")
	WebElement secondaryCountry ;
	
	@FindBy(xpath = "//label[@id='lbl_tr_ref2']")
	WebElement secondaryRefrencePhoneNo ;

	@FindBy(id = "applicant_review_application_form_btn")
	WebElement saveContinueButton ;
	
	@FindBy(className = "btn btn-primary btn-lg btnPrevious")
	WebElement previous ;

	public String getTextFromfirstLastName(){
		return firstLastName.getText();
		
	}
	
	public String getTextBirthDate(){
		return birthDate.getText();
		
	}
	
	public String getTextFromBirthPlace(){
		return birthPlace.getText();
		
	}
	
	public String getTextFromPassportNumber(){
		return passportNumber.getText();
		
	}
	
	public String getTextFromPassportIssuedDate(){
		return passportIssuedDate.getText();
		
	}
	public String getTextFromPassportExpiryDate(){
		return passportExpiryDate.getText();
		
	}
	public String getTextFromAddress(){
		return address.getText();
		
	}
	public String getTextFrompinCode(){
		return pinCode.getText();
		
	}	

	public String getTextFromCityName(){
		return cityName.getText();
		
	}
	public String getTextFromStateName(){
		return stateName.getText();
		
	}
	public String getTextFromCountryName(){
		return countryName.getText();
		
	}
	public String getTextFromAddressType(){
		return nationality.getText();
		
	}
	public String getTextFromFormerNationality(){
		return formerNationality.getText();
		
	}
	public String getTextFromEmailId(){
		return emailId.getText();
		
	}
	public String getTextFromPhoneNumber(){
		return phoneNumber.getText();
		
	}
	public String getTextFromEmerContactName(){
		return emerContactName.getText();
		
	}
	public String getTextFromRelationShip(){
		return relationShip.getText();
		
	}
	
	public String getTextFromEmerPhoneNumber(){
		return emerPhoneNumber.getText();
		
	}
	
	public String getTextFromProfession(){
		return profession.getText();
		
	}
	public String getTextFromEmployer(){
		return employer.getText();
		
	}
	
	public String getTextFromEmployerAddress(){
		return employerAddress.getText();
		
	}
	public String getTextFromEmerPincode(){
		return emerPincode.getText();
		
	}
	public String getTextFromEmerCityName(){
		return emerCityName.getText();
		
	}
	public String getTextFromEmerState(){
		return emerState.getText();
		
	}
	public String getTextFromEmerCountry(){
		return emerCountry.getText();
		
	}
	public String getTextFromEmerEmployerPhoneNumber(){
		return emerEmployerPhoneNumber.getText();
		
	}
	public String getTextFromDateOfDeparture(){
		return dateOfDeparture.getText();
		
	}
	public String getTextFromtTicketNumber(){
		return ticketNumber.getText();
		
	}
	public String getTextFromRoundTicket(){
		return roundTicket.getText();
		
	}
	public String getTextFromTravellingBy(){
		return travellingBy.getText();
		
	}
	public String getTextFromReachBy(){
		return reachBy.getText();
		
	}
	public String getTextFromPrimaryFirstLastName(){
		return primaryFirstLastName.getText();
		
	}
	public String getTextFromPrimaryAddress(){
		return primaryAddress.getText();
		
	}
	public String getTextFromPrimaryPinCode(){
		return primaryPinCode.getText();
		
	}
	public String getTextFromPrimaryCity(){
		return reachBy.getText();
		
	}
	public String getTextFromPrimaryState(){
		return primaryState.getText();
		
	}
	public String getTextFromPrimaryCountry(){
		return primaryCountry.getText();
		
	}
	public String getTextFromPrimaryRefrencePhoneNo(){
		return primaryRefrencePhoneNo.getText();
		
	}
	
	
	
	public String getTextFromSecondaryFirstLastName(){
		return secondaryFirstLastName.getText();
		
	}
	public String getTextFromSecondaryAddress(){
		return secondaryAddress.getText();
		
	}
	public String getTextFromSecondaryPinCode(){
		return secondaryPinCode.getText();
		
	}
	
	public String getTextFromSecondaryState(){
		return secondaryState.getText();
		
	}
	public String getTextFromSecondaryCountry(){
		return secondaryCountry.getText();
		
	}
	public String getTextFromSecondaryRefrencePhoneNo(){
		return secondaryRefrencePhoneNo.getText();
		
	}
	
	public void clickOnContinuebutton(){
		saveContinueButton.click();
		
	}
	public void clickOnPreviuosbutton(){
		previous.click();
		
	}

}

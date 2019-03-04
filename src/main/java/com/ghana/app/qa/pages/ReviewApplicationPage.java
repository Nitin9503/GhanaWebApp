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

	//--------Applicant info
	public String getTextFromfirstLastName(){
		return firstLastName.getText().substring(7);
		
	}
	
	public String getTextBirthDate(){
		return birthDate.getText().substring(13, 23);
		
	}
	
	public String getTextFromBirthPlace(){
		return birthPlace.getText().substring(40);
		
	}
	
	public String getTextFromPassportNumber(){
		return passportNumber.getText().substring(14, 22);
		
	}
	
	public String getTextFromPassportIssuedDate(){
		return passportIssuedDate.getText().substring(43, 53);
		
	}
	public String getTextFromPassportExpiryDate(){
		return passportExpiryDate.getText().substring(74);
		
	}
	
	//------------------------Address Info
	public String getTextFromAddress(){
		return address.getText().substring(10);
		
	}
	public String getTextFrompinCode(){
		return pinCode.getText().substring(6, 11);
		
	}	

	public String getTextFromCityName(){
		return cityName.getText().substring(23, 29);
		
	}
	public String getTextFromStateName(){
		return stateName.getText().substring(41, 51);
		
	}
	public String getTextFromCountryName(){
		return countryName.getText().substring(70);
		
	}
	
	public String getTextFromAddressType(){
		return addressType.getText().substring(14);
	}
	
	
	
	public String getTextFromNationality(){
		return nationality.getText().substring(15, 19);
		
	}
	public String getTextFromFormerNationality(){
		return formerNationality.getText().substring(28);
		
	}
	public String getTextFromEmailId(){
		return emailId.getText().substring(8);
		
	}
	public String getTextFromPhoneNumber(){
		return phoneNumber.getText().substring(11);
		
	}
	
//-----------------Emergency Contact
	public String getTextFromEmerContactName(){
		return emerContactName.getText().substring(7);
		
	}
	public String getTextFromRelationShip(){
		return relationShip.getText().substring(10);
		
	}
	
	public String getTextFromEmerPhoneNumber(){
		return emerPhoneNumber.getText().substring(16);
		
	}
	
	public String getTextFromProfession(){
		return profession.getText().substring(23);
		
	}
	public String getTextFromEmployer(){
		return employer.getText().substring(15);
		
	}
	
	public String getTextFromEmployerAddress(){
		return employerAddress.getText().substring(20);
		
	}
	public String getTextFromEmerPincode(){
		return emerPincode.getText().substring(11, 16);
		
	}
	public String getTextFromEmerCityName(){
		return emerCityName.getText().substring(28, 34);
		
	}
	public String getTextFromEmerState(){
		return emerState.getText().substring(58, 65);
		
	}
	public String getTextFromEmerCountry(){
		return emerCountry.getText().substring(78);
		
	}
	public String getTextFromEmerEmployerPhoneNumber(){
		return emerEmployerPhoneNumber.getText().substring(22);
		
	}
	
	//-------Travel info
	public String getTextFromDateOfDeparture(){
		return dateOfDeparture.getText().substring(19);
		
	}
	public String getTextFromtTicketNumber(){
		return ticketNumber.getText().substring(14, 24);
		
	}
	public String getTextFromRoundTicket(){
		return roundTicket.getText().substring(38);
		
	}
	public String getTextFromTravellingBy(){
		return travellingBy.getText().substring(17);
		
	}
	public String getTextFromReachBy(){
		return reachBy.getText().substring(13);
		
	}
	public String getTextFromPrimaryFirstLastName(){
		return primaryFirstLastName.getText().substring(9);
		
	}
	public String getTextFromPrimaryAddress(){
		return primaryAddress.getText().substring(12);
		
	}
	public String getTextFromPrimaryPinCode(){
		return primaryPinCode.getText().substring(13, 18);
		
	}
	public String getTextFromPrimaryCity(){
		return primaryCity.getText().substring(24, 30);
		
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

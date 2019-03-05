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
	@FindBy(id = "lbl_name")
	WebElement firstLastName ;
	
	@FindBy(id = "lbl_birth")
	WebElement birthDate ;
	
	@FindBy(id = "lbl_place")
	WebElement birthPlace ;
	
	@FindBy(id = "lbl_passport")
	WebElement passportNumber ;
	
	@FindBy(id = "lbl_passport_issue")
	WebElement passportIssuedDate ;
	
	@FindBy(id = "lbl_passport_expiry")
	WebElement passportExpiryDate ;
	
	// Address info
	@FindBy(id = "lbl_address")
	WebElement address ;
	
	@FindBy(id = "lbl_addresspin")
	WebElement pinCode ;
	
	@FindBy(id = "lbl_addresscity")
	WebElement cityName ;
	
	@FindBy(id = "lbl_addressstate")
	WebElement stateName ;
	
	@FindBy(id = "lbl_addresscountry")
	WebElement countryName ;
	
	@FindBy(id = "lbl_address_type]")
	WebElement addressType ;
	
	@FindBy(id = "lbl_nationality")
	WebElement nationality ;
	
	@FindBy(id = "lbl_formarnationality")
	WebElement formerNationality ;
	
	@FindBy(id = "lbl_email")
	WebElement emailId ;
	
	@FindBy(id = "lbl_phone")
	WebElement phoneNumber ;
	
	// Emergency contact
	@FindBy(id = "lbl_em_name")
	WebElement emerContactName ;
	
	@FindBy(id = "lbl_reln")
	WebElement relationShip ;
	
	@FindBy(id = "lbl_em_phon")
	WebElement emerPhoneNumber ;
	
	@FindBy(id = "lbl_profession")
	WebElement profession ;
	
	@FindBy(id = "lbl_employer")
	WebElement employer ;
	
	@FindBy(id = "lbl_em_address")
	WebElement employerAddress ;
	
	@FindBy(id = "lbl_em_pin")
	WebElement emerPincode ;
	
	@FindBy(id = "lbl_em_city")
	WebElement emerCityName ;
	
	@FindBy(id = "lbl_em_state")
	WebElement emerState ;
	
	@FindBy(id = "lbl_em_country")
	WebElement emerCountry ;
	
	@FindBy(id = "lbl_em_phone")
	WebElement emerEmployerPhoneNumber ;
	
	// Travel Info
	
	@FindBy(id = "lbl_depart")
	WebElement dateOfDeparture ;
	
	@FindBy(id = "lbl_tkt_no")
	WebElement ticketNumber ;
	
	@FindBy(id = "lbl_tkt_Rdno")
	WebElement roundTicket ;
	
	@FindBy(id = "lbl_trav_by")
	WebElement travellingBy ;
	
	@FindBy(id = "lbl_purpose_journey")
	WebElement reachBy ;
	
	//Primary Reference
	@FindBy(id = "lbl_tr_name")
	WebElement primaryFirstLastName ;
	
	@FindBy(id = "lbl_tr_address")
	WebElement primaryAddress ;
	
	@FindBy(id = "lbl_tr_pin")
	WebElement primaryPinCode ;
	
	@FindBy(id = "lbl_tr_city")
	WebElement primaryCity ;
	
	@FindBy(id = "lbl_tr_state")
	WebElement primaryState ;
	
	@FindBy(id = "lbl_tr_country")
	WebElement primaryCountry ;
	
	@FindBy(id = "lbl_tr_ref")
	WebElement primaryRefrencePhoneNo ;
	
	// Secondary Reference
	
	@FindBy(id = "lbl_tr_name2")
	WebElement secondaryFirstLastName ;
	
	@FindBy(id = "lbl_tr_address2")
	WebElement secondaryAddress ;
	
	@FindBy(id = "lbl_tr_pin2")
	WebElement secondaryPinCode ;
	
	@FindBy(id = "lbl_tr_city2")
	WebElement secondaryCity ;
	
	@FindBy(id = "lbl_tr_state2")
	WebElement secondaryState ;
	
	@FindBy(id = "lbl_tr_city2")
	WebElement secondaryCountry ;
	
	@FindBy(id = "lbl_tr_ref2")
	WebElement secondaryRefrencePhoneNo ;
	

	@FindBy(id = "applicant_review_application_form_btn")
	WebElement saveContinueButton ;
	
	@FindBy(className = "btn btn-primary btn-lg btnPrevious")
	WebElement previous ;

	//--------Applicant info
	public String getTextFromfirstLastName(){
		return firstLastName.getText().substring(2);
		
	}
	
	public String getTextBirthDate(){
		return birthDate.getText().substring(2);
		
	}
	
	public String getTextFromBirthPlace(){
		return birthPlace.getText().substring(2);
		
	}
	
	public String getTextFromPassportNumber(){
		return passportNumber.getText().substring(2);
		
	}
	
	public String getTextFromPassportIssuedDate(){
		return passportIssuedDate.getText().substring(2);
		
	}
	public String getTextFromPassportExpiryDate(){
		return passportExpiryDate.getText().substring(2);
		
	}
	
	//------------------------Address Info
	public String getTextFromAddress(){
		return address.getText().substring(2);
		
	}
	public String getTextFrompinCode(){
		return pinCode.getText().substring(2);
		
	}	

	public String getTextFromCityName(){
		return cityName.getText().substring(2);
		
	}
	public String getTextFromStateName(){
		return stateName.getText().substring(2);
		
	}
	public String getTextFromCountryName(){
		return countryName.getText().substring(2);
		
	}
	
	public String getTextFromAddressType(){
		return addressType.getText().substring(2);
	}
	
	
	
	public String getTextFromNationality(){
		return nationality.getText().substring(2);
		
	}
	public String getTextFromFormerNationality(){
		return formerNationality.getText();
		
	}
	public String getTextFromEmailId(){
		return emailId.getText().substring(2);
		
	}
	public String getTextFromPhoneNumber(){
		return phoneNumber.getText().substring(2);
		
	}
	
//-----------------Emergency Contact
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
	
	//-------Travel info
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
		return primaryCity.getText();
		
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

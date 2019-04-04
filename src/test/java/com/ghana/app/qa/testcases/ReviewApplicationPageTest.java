package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.TestBase;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

public class ReviewApplicationPageTest extends ApplicationFormFilling {
	SoftAssert softAssertion= new SoftAssert();
	public ReviewApplicationPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	    }
	
	@Test(priority = 51)
	public void getTextPersonalInfoTest() throws InterruptedException, IOException {
		System.out.println( "applicationID==>Revie1" +applicationID);
		//------Personal info
        softAssertion.assertEquals(reviewApplicationPage.getTextFromfirstLastName(), (firstName+" "+lastName), "Provided and Get firstName are not matched");
		//System.out.println(reviewApplicationPage.getTextFromfirstLastName() +" = "+(firstName+" "+lastName));
		
		softAssertion.assertEquals(reviewApplicationPage.getTextBirthDate(), birthDate, "Provided and Get Birthdate are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromBirthPlace(), birthPlace, "Provided and Get birthPlace are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPassportNumber(), passportNumber, "Provided and Get passportNumber are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPassportIssuedDate(), passportIssuedDate, "Provided and Get passportIssuedDate are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPassportExpiryDate(), passportExpiryDate, "Provided and Get passportExpiryDate are not matched");

		softAssertion.assertAll();
		
		
	}
	@Test(priority = 52)
		public void getTextAddressInfoTest() throws InterruptedException, IOException {
		//Address Info
		softAssertion.assertEquals(reviewApplicationPage.getTextFromAddress(), (FlatNo+", "+StreetName+", "+Landmark), "Provided and Get address are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFrompinCode(), pinCode, "Provided and Get pinCode are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromCityName(), cityName, "Provided and Get cityName are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromStateName(), stateName, "Provided and Get stateName are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromCountryName(), countryName, "Provided and Get countryName are not matched");
		
		//softAssertion.assertEquals(reviewApplicationPage.getTextFromAddressType(), addressType, "Provided and Get addressType are not matched");
		
	    softAssertion.assertEquals(reviewApplicationPage.getTextFromNationality(), nationalityName, "Provided and Get nationality are not matched");
		
		//softAssertion.assertEquals(reviewApplicationPage.getTextFromFormerNationality(), formerNationality, "Provided and Get formerNationality are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmailId(), emailId, "Provided and Get emailId are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPhoneNumber(), phoneNumber, "Provided and Get phoneNumber are not matched");
		
	    softAssertion.assertAll();
		
	
	}
	@Test(priority = 53)
	public void getTextEmergencyContactTest() throws InterruptedException, IOException {
	//Emergency contact 
	softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerContactName(), (emerContactName+" "+emerContactSurname), "Provided and Get address are not matched");

		softAssertion.assertAll();
		
		
	
	/*@Test(priority = 50)
		public void getTextAddressInfoTest() throws InterruptedException, IOException {
		//Address Info
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		String st=reviewApplicationPage.getTextFromfirstLastName();
		
		System.out.println(st);
	*/
	


	softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerPhoneNumber(), emerPhoneNumber, "Provided and Get emerPhoneNumber are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromProfession(), profession, "Provided and Get profession are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromEmployer(), employer, "Provided and Get employer are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromEmployerAddress(), employerAddress, "Provided and Get countryName are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerPincode(), emerPincode, "Provided and Get emerPincode are not matched");
	
    softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerCityName(), emerCityName, "Provided and Get emerCityName are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerState(), emerState, "Provided and Get emerState are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerCountry(), emerCountry, "Provided and Get emerCountry are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerEmployerPhoneNumber(), emerEmployerPhoneNumber, "Provided and Get emerEmployerPhoneNumber are not matched");
	
    softAssertion.assertAll();
	
}
	@Test(priority = 54)
	public void getTextTravelInfoTest() throws InterruptedException, IOException {
	//Travel Info
	softAssertion.assertEquals(reviewApplicationPage.getTextFromDateOfDeparture(), dateOfDeparture, "Provided and Get dateOfDeparture are not matched");

	softAssertion.assertEquals(reviewApplicationPage.getTextFromtTicketNumber(), ticketNumber, "Provided and Get emerPhoneNumber are not matched");
	
	//primary reference
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryFirstLastName(), (priFirstName+" "+priLastName), "Provided and Get primaryFirstLastName are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryAddress(), primaryAddress, "Provided and Get primaryAddress are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryPinCode(), primaryPinCode, "Provided and Get primaryPinCode are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryCity(), primaryCity, "Provided and Get primaryCity are not matched");
	
    softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryState(), primaryState, "Provided and Get primaryState are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryCountry(), primaryCountry, "Provided and Get primaryCountry are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryRefrencePhoneNo(), primaryRefrencePhoneNo, "Provided and Get primaryRefrencePhoneNo are not matched");
	
	
	//Secondary reference
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryFirstLastName(), (secFirstName+" "+secLastName), "Provided and Get secondaryFirstLastName are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryAddress(), secondaryAddress, "Provided and Get secondaryAddress are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryPinCode(), secondaryPinCode, "Provided and Get primaryPinCode are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryCity(), secondaryCity, "Provided and Get secondaryCity are not matched");
	
    softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryState(), secondaryState, "Provided and Get secondaryState are not matched");
    
	softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryCountry(), secondaryCountry, "Provided and Get secondaryCountry are not matched");
	
	softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryRefrencePhoneNo(), secondaryRefrencePhoneNo, "Provided and Get secondaryRefrencePhoneNo are not matched");
	
    softAssertion.assertAll();

}
	@Test(priority = 55)
	public void clickOnContinueBtnTest() throws InterruptedException, IOException {
		reviewApplicationPage.clickOnContinuebutton();
		System.out.println( "applicationID==>Revie2" +applicationID);
	}
	
}

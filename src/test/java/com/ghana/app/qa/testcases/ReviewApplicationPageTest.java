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
	
	@Test(priority = 49)
	public void getTextPersonalInfoTest() throws InterruptedException, IOException {
		
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
	@Test(priority = 50)
		public void getTextAddressInfoTest() throws InterruptedException, IOException {
		//Address Info
		softAssertion.assertEquals(reviewApplicationPage.getTextFromAddress(), (FlatNo+", "+StreetName+", "+Landmark), "Provided and Get address are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFrompinCode(), pinCode, "Provided and Get pinCode are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromCityName(), cityName, "Provided and Get cityName are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromStateName(), stateName, "Provided and Get stateName are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromCountryName(), countryName, "Provided and Get countryName are not matched");
		
		//softAssertion.assertEquals(reviewApplicationPage.getTextFromAddressType(), addressType, "Provided and Get addressType are not matched");
		
	    softAssertion.assertEquals(reviewApplicationPage.getTextFromNationality(), nationality, "Provided and Get nationality are not matched");
		
		//softAssertion.assertEquals(reviewApplicationPage.getTextFromFormerNationality(), formerNationality, "Provided and Get formerNationality are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmailId(), emailId, "Provided and Get emailId are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPhoneNumber(), phoneNumber, "Provided and Get phoneNumber are not matched");
		
	
		
		softAssertion.assertAll();
		
	

	
	
	
	
	}

}

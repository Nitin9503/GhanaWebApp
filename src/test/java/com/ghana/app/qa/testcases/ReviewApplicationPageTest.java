package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.TestBase;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

public class ReviewApplicationPageTest extends ApplicationFormFilling {

	public ReviewApplicationPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(priority = 49)
	public void getTextPersonalInfoTest() throws InterruptedException, IOException {
		
		//------Personal info
		SoftAssert softAssertion= new SoftAssert();
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromfirstLastName(), (firstName+" "+lastName), "Provided and Get firstName are not matched");
		//System.out.println(reviewApplicationPage.getTextFromfirstLastName() +" = "+(firstName+" "+lastName));
		
		softAssertion.assertEquals(reviewApplicationPage.getTextBirthDate(), birthDate, "Provided and Get Birthdate are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromBirthPlace(), birthPlace, "Provided and Get birthPlace are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPassportNumber(), passportNumber, "Provided and Get passportNumber are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPassportIssuedDate(), passportIssuedDate, "Provided and Get passportIssuedDate are not matched");
		
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPassportExpiryDate(), passportExpiryDate, "Provided and Get passportExpiryDate are not matched");
		
		softAssertion.assertAll();
		
		
	}
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
	

	
	
	
	
	

}

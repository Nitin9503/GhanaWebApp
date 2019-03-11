package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import static org.testng.Assert.assertEquals;

public class ApplicationFormFilling extends DriverInit {
	SoftAssert softAssertion= new SoftAssert();
	public ApplicationFormFilling() throws IOException, InterruptedException {
		super();
	}

	// ---------------------SignUp page Test----------------------------------//
	@Test(priority = 1)
	public void selectPassPortType() throws InterruptedException, IOException {

		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
        signUpPage.clickOnCheckBoxes();
        signUpPage.selectRadioButton();
        signUpPage.SelectPassportType();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void selectNationalityTest() throws InterruptedException, IOException {
		signUpPage.selectNationality();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void selectPortOfArrivalTest() throws InterruptedException, IOException {
		signUpPage.selectPortOfArrival();

	}

	@Test(priority = 4)
	public void passPhoneNoTest() throws InterruptedException, IOException {
		signUpPage.passPhoneNo("9503152126");
	}

	@Test(priority = 5)
	public void passEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passEmailId("arjunthaokar9@gmail.com");
	}

	@Test(priority = 6)
	public void passReEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passReEmailId("arjunthaokar9@gmail.com");
	}

	@Test(priority = 7)
	public void enterCaptchaFieldTest() throws InterruptedException, IOException {
		signUpPage.enterCaptchaField("AUX125P");
		//signUpPage.continueBtn();
		//signUpPage.cancelBtn();
	}
		@Test(priority = 9)
	
		public void clickOnSaveAndContinueBtnTest() throws InterruptedException, IOException {
			//signUpPage.continueBtn();
			softAssertion.assertEquals(personalInfoPage.getTextPersonalInfoPageTitle(), "Personal Information", "it is not match with personal info page title hence it is not navigated");
			
		}
	

	@Test(priority = 8)


	public void selectDateOfBirthTest() throws InterruptedException,
			IOException {
		signUpPage.selectDateOfBirth(birthDate);
        signUpPage.continueBtn();

	}

	// ----------------------Personal info page
	// Test----------------------------------//
	@Test(priority = 10)
	public void getApplicationPageTitleTest() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(personalInfoPage.getApplicantPageTitle(), "Applicant Form");

	}

	@Test(priority = 11)
	public void getApplicationIdTest() throws InterruptedException {
		String st = personalInfoPage.getApplicationId();
		System.out.println(st);
	}

	@Test(priority = 12)
	public void selectVisaFeesTest() throws InterruptedException, IOException {
		personalInfoPage.SelectvisaFees();

	}

	@Test(priority = 13)
	public void selectVisaLocationTest() throws InterruptedException, IOException {
		personalInfoPage.SelectvisaLocation();

	}

	@Test(priority = 14)
	public void passFirstNameTest() throws InterruptedException, IOException {
		personalInfoPage.passFirstName(firstName);

	}

	@Test(priority = 15)
	public void passLastNameTest() throws InterruptedException, IOException {
		personalInfoPage.passLastName(lastName);

	}

	@Test(priority = 16)

	public void passPassportNumberTest() throws InterruptedException,
			IOException {
		personalInfoPage.passPassportNumber(passportNumber);


	}

	@Test(priority = 17)
	public void clickOnGenderTest() throws InterruptedException, IOException {
		personalInfoPage.clickOnGender();

	}

	@Test(priority = 18)

	public void selectPassIssueDateTest() throws InterruptedException,
			IOException {
		personalInfoPage.selectPassIssueDate(passportIssuedDate);


	}

	@Test(priority = 19)

	public void selectPassExpiryDateTest() throws InterruptedException,
			IOException {
		personalInfoPage.selectPassExpiryDate(passportExpiryDate);

	}

	@Test(priority = 20)
	public void passPlaceOfBirthTest() throws InterruptedException, IOException {
		personalInfoPage.passPlaceOfBirth(birthPlace);

	}

@Test(priority = 21)
	public void clickOnSaveAndContinueTest() throws InterruptedException, IOException {
		personalInfoPage.clickOnSaveAndContinue();
		addressInfoPage.getTextAddressInfoPageTitle();
			softAssertion.assertEquals(travelInfoPage.getTextTravelInfoPagetitle(), "Address Information", "it is not navigate to address info page");
			
	        
		
	}

	// ----------------------Address Info page
	// Test----------------------------------//
	@Test(priority = 22)
	
	public void selectFormerNationalityTest() throws InterruptedException, IOException {
		assertEquals(addressInfoPage.getTextAddressInfoPageTitle(), "Address Information", "after compairing both text not match   ");;
		addressInfoPage.selectFormerNaitonality();

	}

	@Test(priority = 23)
	public void filladdressInfoTest() throws InterruptedException, IOException {
		addressInfoPage.PassAddressInfofield(FlatNo, StreetName,
				Landmark, pinCode, cityName, stateName, countryName);

	}

	@Test(priority = 24)
	public void clickSaveAndContinuebtnTest() throws InterruptedException, IOException {
		addressInfoPage.clickSaveAndContinuebtn();
		emergencyContactPage.getTextEmerPageTitle();
		softAssertion.assertEquals(travelInfoPage.getTextTravelInfoPagetitle(), "Emergency Contact", "it is not navigate to Emergency Contact page");
		
        
	
	}
	
	// ----------------------Emergency contact page
	// Test----------------------------------//
	@Test(priority = 25)
	public void emergencyContactDetailsTest() throws InterruptedException, IOException {
		emergencyContactPage.emergencyContactDetails(emerContactName, emerContactSurname, emerPhoneNumber);

	}

	@Test(priority = 26)
	public void selectRelationTest() throws InterruptedException, IOException {
		emergencyContactPage.selectRelation();

	}

	@Test(priority = 27)
	public void emergencyProfessionDetailsTest() throws InterruptedException, IOException {
		emergencyContactPage.emergencyProfessionDetails(profession, employer,
				employerAddress, emerPincode, emerCityName, emerState, emerCountry, emerEmployerPhoneNumber);

	}
	@Test(priority = 28)
	public void clickOnCintinueBtnTest() throws InterruptedException, IOException {
		emergencyContactPage.clickEmeContinueBtn();
		travelInfoPage.getTextTravelInfoPagetitle();
		softAssertion.assertEquals(travelInfoPage.getTextTravelInfoPagetitle(), "Travel Information", "it is not navigate to travel info page");
		
        
	}
	// ----------------------Travel Info page
	// Test----------------------------------//
	@Test(priority = 29)
	public void clickOnIsApplicantPossessionRoundTicketTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		

	}

	@Test(priority = 30)
	public void passDateOfDepartureTest() throws InterruptedException, IOException {
		travelInfoPage.passDateOfDeparture(dateOfDeparture);
		travelInfoPage.clickOnContinuebutton();
	}

	@Test(priority = 31)
	public void passTicketNumberTest() throws InterruptedException, IOException {
		travelInfoPage.passTicketNumber(ticketNumber);

	}

	@Test(priority = 32)
	public void clickOnTravelByTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnTravelBy();
		

	}

	@Test(priority = 33)
	public void clickPurpose_of_journeyTest() throws InterruptedException, IOException {
		travelInfoPage.clickPurpose_of_journey();

	}

	@Test(priority = 34)
	public void passPrimaryRefFirstnameTest() throws InterruptedException, IOException {
		travelInfoPage.passPrimaryRefFirstname(priFirstName);

	}

	@Test(priority = 35)
	public void passPrimaryRefLastnameTest() throws InterruptedException, IOException {
		travelInfoPage.passPrimaryRefLastname(priLastName);

	}

	@Test(priority = 36)
	public void pass_Primary_ref_addressTest() throws InterruptedException, IOException {
		travelInfoPage.pass_Primary_ref_address(primaryAddress);

	}

	@Test(priority = 37)
	public void pass_primary_ref_pincodeTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_pincode(primaryPinCode);

	}

	@Test(priority = 38)
	public void pass_primary_ref_cityTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_city(primaryCity);

	}

	@Test(priority = 39)
	public void pass_primary_ref_stateTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_state(primaryState);

	}

	@Test(priority = 40)
	public void pass_primary_ref_countryTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_country(primaryCountry);

	}

	@Test(priority = 41)
	public void pass_primary_ref_phone_numberTest() throws InterruptedException, IOException {

		travelInfoPage.pass_primary_ref_phone_number(primaryRefrencePhoneNo);

	}

	@Test(priority = 42)
	public void PassSecondaryRefDetailsTest() throws InterruptedException, IOException {
		travelInfoPage.PassSecondaryRefDetails(secFirstName, secLastName, secondaryAddress, secondaryPinCode,
				secondaryCity, secondaryState, secondaryCountry, secondaryRefrencePhoneNo);

	}

	@Test(priority = 43)
	public void clickOnContinuebuttonTest() throws InterruptedException, IOException {

		travelInfoPage.clickOnContinuebutton();

	}

	// ----------------------Upload Doc page
	// Test----------------------------------//
	@Test(priority = 44)
	public void getUploadDocTest() throws InterruptedException, IOException {

		uploadDocPage.getUploadDoc();

	}

	@Test(priority = 45)
	public void clicksaveAndContiBtnTest() throws InterruptedException, IOException {

		uploadDocPage.clicksaveAndContiBtn();
		softAssertion.assertEquals(visaPaymentPage.getTextPaymentPageTitle(), "Visa Payment", "here visa Payment title not match hence it is not navigated to this page");
        
	}

}
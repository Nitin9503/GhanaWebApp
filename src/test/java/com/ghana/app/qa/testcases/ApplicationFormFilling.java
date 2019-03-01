package com.ghana.app.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class ApplicationFormFilling extends DriverInit {

	public ApplicationFormFilling() throws IOException, InterruptedException {
		super();
	}

	// ---------------------SignUp page Test----------------------------------//
	@Test(priority = 6)
	public void selectPassPortType() throws InterruptedException, IOException {

		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		Thread.sleep(2000);
		// TestUtil.actionClassMethod(driver.findElement(By.xpath("//input[@type='checkbox' and @id ='customCheck3']")));

		signUpPage.clickOnCheckBoxes();
		signUpPage.selectRadioButton();
		// driver.findElement(By.xpath("//input[@type='checkbox' and @id ='customCheck3']")).click();
		// signUpPage.termsCheckboxselect();
		signUpPage.SelectPassportType();

	}

	@Test(priority = 7)
	public void selectNationalityTest() throws InterruptedException,
			IOException {
		signUpPage.selectNationality();

	}

	@Test(priority = 8)
	public void selectPortOfArrivalTest() throws InterruptedException,
			IOException {
		signUpPage.selectPortOfArrival();

	}

	@Test(priority = 9)
	public void passPhoneNoTest() throws InterruptedException, IOException {
		signUpPage.passPhoneNo("9503152126");
	}

	@Test(priority = 10)
	public void passEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passEmailId("arjunthaokar9@gmail.com");
	}

	@Test(priority = 12)
	public void passReEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passReEmailId("arjunthaokar9@gmail.com");
	}

	@Test(priority = 13)
	public void enterCaptchaFieldTest() throws InterruptedException,
			IOException {
		signUpPage.enterCaptchaField("AUX125P");
		signUpPage.continueBtn();
		// signUpPage.cancelBtn();
	}

	@Test(priority = 11)
	public void selectDateOfBirthTest() throws InterruptedException,
			IOException {
		signUpPage.selectDateOfBirth("8-Dec-2000");
		signUpPage.continueBtn();

	}

	// ----------------------Personal info page
	// Test----------------------------------//
	@Test(priority = 14)
	public void getApplicationPageTitleTest() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(personalInfoPage.getApplicantPageTitle(), "Applicant Form");

	}

	@Test(priority = 15)
	public void getApplicationIdTest() throws InterruptedException {
		String st = personalInfoPage.getApplicationId();
		System.out.println(st);
	}

	@Test(priority = 16)
	public void selectVisaFeesTest() throws InterruptedException, IOException {
		personalInfoPage.SelectvisaFees();

	}

	@Test(priority = 17)
	public void selectVisaLocationTest() throws InterruptedException,
			IOException {
		personalInfoPage.SelectvisaLocation();

	}

	@Test(priority = 18)
	public void passFirstNameTest() throws InterruptedException, IOException {
		personalInfoPage.passFirstName("Sachin");

	}

	@Test(priority = 19)
	public void passLastNameTest() throws InterruptedException, IOException {
		personalInfoPage.passLastName("Patil");

	}

	@Test(priority = 20)
	public void passPassportNumberTest() throws InterruptedException,
			IOException {
		personalInfoPage.passPassportNumber("A986532A");

	}

	@Test(priority = 21)
	public void clickOnGenderTest() throws InterruptedException, IOException {
		personalInfoPage.clickOnGender();

	}

	@Test(priority = 22)
	public void selectPassIssueDateTest() throws InterruptedException,
			IOException {
		personalInfoPage.selectPassIssueDate("28-Jan-2014");

	}

	@Test(priority = 23)
	public void selectPassExpiryDateTest() throws InterruptedException,
			IOException {
		personalInfoPage.selectPassExpiryDate("8-Dec-2032");

	}

	@Test(priority = 24)
	public void passPlaceOfBirthTest() throws InterruptedException, IOException {
		personalInfoPage.passPlaceOfBirth("Nagpur");

	}

	@Test(priority = 25)
	public void clickOnSaveAndContinueTest() throws InterruptedException,
			IOException {
		personalInfoPage.clickOnSaveAndContinue();

	}

	// ----------------------Address Info page
	// Test----------------------------------//
	@Test(priority = 26)
	public void selectFormerNationalityTest() throws InterruptedException,
			IOException {
		addressInfoPage.selectFormerNaitonality();

	}

	@Test(priority = 27)
	public void filladdressInfoTest() throws InterruptedException, IOException {
		addressInfoPage.PassAddressInfofield("Flat No. 302 Lambodhar Classic",
				"Serene Medows, Gangapur Raod ", " Near Media House,",
				"444015", "Nashik", "Maharashtra", "India");

	}

	@Test(priority = 28)
	public void clickSaveAndContinuebtnTest() throws InterruptedException,
			IOException {
		addressInfoPage.clickSaveAndContinuebtn();

	}

	// ----------------------Emergency contact page
	// Test----------------------------------//
	@Test(priority = 29)
	public void emergencyContactDetailsTest() throws InterruptedException,
			IOException {
		emergencyContactPage.emergencyContactDetails("Pratik", "Shirsath",
				"7620098193");

	}

	@Test(priority = 30)
	public void selectRelationTest() throws InterruptedException, IOException {
		emergencyContactPage.selectRelation();

	}

	@Test(priority = 31)
	public void emergencyProfessionDetailsTest() throws InterruptedException,
			IOException {
		emergencyContactPage.emergencyProfessionDetails("Engineer", "infosys ",
				"B wing Complex It park, hinjewadi phage 1", "440012", "Pune",
				"Maharashtra", "India", "9856231254");

	}

	// ----------------------Travel Info page
	// Test----------------------------------//
	@Test(priority = 32)
	public void clickOnIsApplicantPossessionRoundTicketTest()
			throws InterruptedException, IOException {
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		travelInfoPage.clickOnYes();

	}

	@Test(priority = 33)
	public void passDateOfDepartureTest() throws InterruptedException,
			IOException {
		travelInfoPage.passDateOfDeparture("8-Dec-2019");
		travelInfoPage.clickOnContinuebutton();
	}

	@Test(priority = 34)
	public void passTicketNumberTest() throws InterruptedException, IOException {
		travelInfoPage.passTicketNumber("AF123652");

	}

	@Test(priority = 35)
	public void clickOnTravelByTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnTravelBy();
		travelInfoPage.clickOnTravelByAir();

	}

	@Test(priority = 36)
	public void clickPurpose_of_journeyTest() throws InterruptedException,
			IOException {
		travelInfoPage.clickPurpose_of_journey();

	}

	@Test(priority = 37)
	public void passPrimaryRefFirstnameTest() throws InterruptedException,
			IOException {
		travelInfoPage.passPrimaryRefFirstname("Kojo");

	}

	@Test(priority = 38)
	public void passPrimaryRefLastnameTest() throws InterruptedException,
			IOException {
		travelInfoPage.passPrimaryRefLastname("Amankwah");

	}

	@Test(priority = 39)
	public void pass_Primary_ref_addressTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_Primary_ref_address("8 John Wall Way, Ashaiman");

	}

	@Test(priority = 40)
	public void pass_primary_ref_pincodeTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_pincode("GA017");

	}

	@Test(priority = 41)
	public void pass_primary_ref_cityTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_city("Sekondi-Takoradi");

	}

	@Test(priority = 42)
	public void pass_primary_ref_stateTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_state("Brong-Aha[5]fo");

	}

	@Test(priority = 43)
	public void pass_primary_ref_countryTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_country("Ghana");

	}

	@Test(priority = 44)
	public void pass_primary_ref_phone_numberTest()
			throws InterruptedException, IOException {

		travelInfoPage.pass_primary_ref_phone_number("+233-24 222 3344");

	}

	@Test(priority = 45)
	public void PassSecondaryRefDetailsTest() throws InterruptedException,
			IOException {
		travelInfoPage.PassSecondaryRefDetails("Ebo", "Afriyie",
				"77436 Fairview Trail, Sekondi-Takoradi", "GA015", "Kumasi",
				"Ashanti[4]", "Ghana", "+233-24 222 3344");

	}

	@Test(priority = 46)
	public void clickOnContinuebuttonTest() throws InterruptedException,
			IOException {

		travelInfoPage.clickOnContinuebutton();

	}

}
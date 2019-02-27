package com.ghana.app.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class ApplicationFormFilling extends DriverInit {

	public ApplicationFormFilling() throws IOException, InterruptedException {
		super();
	}

	@Test(priority = 6)
	public void selectPassPortType() throws InterruptedException, IOException {
		
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		Thread.sleep(2000);
		//TestUtil.actionClassMethod(driver.findElement(By.xpath("//input[@type='checkbox' and @id ='customCheck3']")));
		
		signUpPage.clickOnCheckBoxes();
		signUpPage.selectRadioButton();
		//driver.findElement(By.xpath("//input[@type='checkbox' and @id ='customCheck3']")).click();
		//signUpPage.termsCheckboxselect();
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

	@Test(priority = 14)
	public void getApplicationPageTitleTest() throws InterruptedException {
		Thread.sleep(2000);
		assertEquals(personalInfoPage.getApplicantPageTitle(), "Applicant Form");

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

}

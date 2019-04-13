package com.ghana.app.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;

public class SignUpPageTest extends DriverInit {

	public SignUpPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 6)
	public void selectPassPortType() throws InterruptedException, IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		Thread.sleep(2000);
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
		//signUpPage.continueBtn();
		//signUpPage.cancelBtn();
	}
	@Test(priority = 11)
	public void selectDateOfBirthTest() throws InterruptedException,
			IOException {
		Thread.sleep(3000);
		signUpPage.selectDateOfBirth("822014");
		Thread.sleep(3000);
		//signUpPage.continueBtn();
		
	}
}

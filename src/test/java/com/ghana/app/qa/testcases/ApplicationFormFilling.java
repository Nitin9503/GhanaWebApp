package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class ApplicationFormFilling extends DriverInit {
	
	public ApplicationFormFilling() throws IOException, InterruptedException{
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
		//signUpPage.cancelBtn();
	}
	@Test(priority = 11)
	public void selectDateOfBirthTest() throws InterruptedException,
			IOException {
		signUpPage.selectDateOfBirth("8-Dec-2014");
		signUpPage.continueBtn();
		
	}
	@Test(priority=14)
	public void getApplicationIdTest(){
		String st =personalInfoPage.getApplicationId();
	System.out.println(st);
	
	}
}

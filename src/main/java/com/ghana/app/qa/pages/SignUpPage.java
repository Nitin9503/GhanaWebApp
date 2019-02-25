package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class SignUpPage extends TestBase {

	public SignUpPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from signup page
	@FindBy(xpath = "//span[text()='Passport Type']")
	public static WebElement PassportType;

	@FindBy(id = "Official")
	// Diplomatic, Service, Special, Ordinary
	WebElement PassportTypeName;

	@FindBy(xpath = "//span[text()='Nationality']")
	WebElement Nationality;

	@FindBy(xpath = "//ul[@id='ul_nationality']//li[text()='India']")
	WebElement selectNationality;

	@FindBy(id = "nationality_search")
	WebElement nationalitySearchField;

	@FindBy(xpath = "//span[text()='Port of Arrival']")
	WebElement PortofArrival;

	@FindBy(xpath = "//ul[@id='img_category_options']//li[text()='Ghana Airport']")
	WebElement selectPortofArrival;

	@FindBy(xpath = "//label[text()='Phone Number']")
	WebElement PhoneNumber;

	@FindBy(xpath = "//input[@id='dateofbirth']")
	WebElement dateofbirth;

	@FindBy(id = "useremail")
	WebElement emailId;

	@FindBy(id = "renter_email")
	WebElement reenterEmailId;

	/*
	 * @FindBy(xpath="//input[@id='renter_email']") WebElement renter_email;
	 * 
	 * @FindBy(xpath="//input[@id='useremail']") WebElement useremail;
	 */

	@FindBy(xpath = "//input[@id='customCheck1']")
	WebElement customCheck1;

	@FindBy(xpath = "//div[@id='touristVisa']//input[@type='radio' and @value='1']")
	WebElement visaTypeCheckBox;

	@FindBy(xpath = "//input[@id='usercaptchacode']")
	WebElement usercaptchacode;

	@FindBy(xpath = "//input[@id='customCheck3' and @type='checkbox']")
	WebElement basicDoccheckbox;

	@FindBy(xpath = "//input[@id='customCheck1' and @name='example1']")
	WebElement termsCheckkbox;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//input[@value='//input[@value='Continue']']")
	WebElement Continue;

	public String validateSignUpPageTitle() {

		return driver.getTitle();
	}

	public void SelectPassportType() {
		TestUtil.actionClassMethod(PassportType);
		//PassportType.click();
		PassportTypeName.click();
	}

	public void SelectNationality() {
		Nationality.click();
		nationalitySearchField.sendKeys("India");
		Select select0 = new Select(selectNationality);
		select0.selectByValue("India");

	}

	public void selectPortOfArrival() {
		PortofArrival.click();
		Select select0 = new Select(selectPortofArrival);
		select0.selectByValue("Ghana Airport");

	}

	public void passPhoneNo() {
		PhoneNumber.sendKeys("7620098193");
	}

	public void passEmailId() {
		emailId.sendKeys("nitinthaokar9@gmail.com");
	}

	public void passReEmailId() {
		emailId.sendKeys("nitinthaokar9@gmail.com");
	}

	public void visaTypeRadioBtn() {
		visaTypeCheckBox.click();
	}

	public void enterCaptchaField() {
		usercaptchacode.sendKeys("AUX125P");
	}

	public void cancelBtn() {
		Cancel.click();
	}

	public void continueBtn() {
		Continue.click();
	}

	public void termsCheckboxselect() {
		termsCheckkbox.click();
	}

}

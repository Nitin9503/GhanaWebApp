package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;
import static com.ghana.app.qa.testdata.ConstantVariable.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

	@FindBy(id = "phone_number")
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

	@FindBy(xpath = "//input[@id='customRadio3']")
	WebElement visaTypeCheckBox;

	@FindBy(xpath = "//input[@id='usercaptchacode']")
	WebElement usercaptchacode;

	@FindBy(xpath = "//input[@id='customCheck3' and @type='checkbox']")
	WebElement basicDoccheckbox;

	@FindBy(xpath = "//input[@id='customCheck1' and @name='example1']")
	WebElement termsCheckkbox;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continue;

	@FindBy(xpath = "//input[@name='example1']")
	List<WebElement> checkBoxesClick;

	@FindBy(xpath = "//div[@class ='custom-control custom-radio custom-control-inline']")
	List<WebElement> selectRadioButton;

	public String validateSignUpPageTitle() {

		return driver.getTitle();
	}

	public void SelectPassportType() {
		TestUtil.actionClassMethod(PassportType);
		PassportTypeName.click();
	}

	public void selectNationality() throws InterruptedException {
		TestUtil.actionClassMethod(Nationality);
		nationalitySearchField.sendKeys("India");
		Thread.sleep(2000);
		selectNationality.click();

	}

	public void selectPortOfArrival() {
		TestUtil.actionClassMethod(PortofArrival);
		selectPortofArrival.click();

	}

	public void passPhoneNo(String phoneNo) {
		PhoneNumber.sendKeys(phoneNo);
	}

	public void selectDateOfBirth(String birthDate) throws InterruptedException {
		((JavascriptExecutor) driver)
				.executeScript("document.getElementById('dateofbirth').removeAttribute('readonly',0);");
		dateofbirth.sendKeys(birthDate); // Enter date in required format
	}

	public void passEmailId(String EmailId) {
		emailId.sendKeys(EmailId);// nitinthaokar9@gmail.com
	}

	public void passReEmailId(String EmailId) {
		reenterEmailId.sendKeys(EmailId);
	}

	public void visaTypeRadioBtn() {
		visaTypeCheckBox.click();
	}

	public void enterCaptchaField(String captchacode) {
		usercaptchacode.sendKeys(captchacode);
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

	public void clickOnCheckBoxes() {
		System.out.println("checkBoxesClick==>" + checkBoxesClick.size());

		for (WebElement we : checkBoxesClick) {
			TestUtil.actionClassMethod(we);
			int j = checkBoxesClick.size();
			for (int i = 0; i < j; i++) {
				WebElement check = checkBoxesClick.get(i);
				selectedBoxOnSignUp = check.isSelected();
				System.out.println("selectedBox==>" +selectedBoxOnSignUp);
			}
		}
	}

	public void verifyCheckBoxIsSelectedInSignUpPage() {

	}

	public void selectRadioButton() {

		try {
			for (WebElement we : selectRadioButton) {
				TestUtil.actionClassMethod(we);
			}

		} catch (Exception e) {
			System.out.println("all check boxes click done");

		}

	}

}

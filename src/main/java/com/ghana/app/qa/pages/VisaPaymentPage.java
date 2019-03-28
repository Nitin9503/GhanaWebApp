package com.ghana.app.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.ghana.app.qa.testdata.ConstantVariable.*;
import com.ghana.app.qa.base.TestBase;

public class VisaPaymentPage extends TestBase {

	public VisaPaymentPage() throws Exception {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[contains(text(),'Do You Want To Submit Application?')]")
	WebElement confimationMessage;

	@FindBy(xpath = "//h5[contains(text(),'Visa Payment')]")
	WebElement paymentPageTitle;

	@FindBy(id = "btn_submit_to_consulate")
	WebElement submitBtn;

	@FindBy(xpath = "//div[@id='nav-payment']//input[@value='Previous']")
	WebElement previousBtn;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement okBtn;

	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][contains(text(),'Cancel')]")
	WebElement cancelBtn;

	public String getTextPaymentPageTitle() {
		return paymentPageTitle.getText();

	}

	public void clickOnSubmitBtn() {
		submitBtn.click();
	}
	public void getTextsubmitBtn() throws InterruptedException {
		Thread.sleep(3000);
		String value   = submitBtn.getAttribute("value");
		System.out.println("value==>" +value);
		newApplication = value.replaceAll(value, "New Application");
		System.out.println("newApplication==>" +newApplication);
		
	}

	public void clickOnPreviousBtn() {
		previousBtn.click();

	}

	public void verifyConfirmationPop() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if ((confimationMessage.getText()).equalsIgnoreCase("Do You Want To Submit Application?")) {
				okBtn.click();
			}

		} catch (Exception e) {
			cancelBtn.click();
			System.out.println("here confirmation message not match");
			// TODO: handle exception
		}

	}

}

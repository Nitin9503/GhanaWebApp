package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class CNDocumentVerificaton extends TestBase {

	public CNDocumentVerificaton() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Reject']")
	WebElement reject;

	@FindBy(xpath = "//button[text()='Approve']")
	WebElement approve;

	@FindBy(xpath = "//div[@id='rejectModel']//h4[text()='Confirmation' and @class='modal-title']")
	WebElement rejectConfirmationPop;

	@FindBy(xpath = "//input[@value='Flag Passport']")
	WebElement flagPassport;

	@FindBy(xpath = "//div[@id='rejectModel']//button[text()='Cancel' and @type='button']")
	WebElement cancelFromRejectPop;

	@FindBy(xpath = "//input[@value='Reject']")
	WebElement rejectFromRejectConfir;

	@FindBy(xpath = "//div[@id='rejectModel']//button[@class='close' and @type='button']")
	WebElement closeFromRejectConfir;

	@FindBy(xpath = "//div[@id='acceptModel']//div[@class='modal-header']")
	WebElement acceptConfirmationPop;

	@FindBy(xpath = "	//input[@value='Cancel']")
	WebElement cancelFromApprove;

	@FindBy(xpath = "//input[@value='Confirm']")
	WebElement confirmFromApprove;

	@FindBy(xpath = "//div[@id='acceptModel']//button[@type='button'][contains(text(),'×')]")
	WebElement closeApprove;

	@FindBy(xpath = "//input[@value='Flag And Reject']")
	WebElement flagAndReject;
	
	@FindBy(xpath = "//input[@type='checkbox' and @onclick='selectall(this)']")
	WebElement selectAllCheckBox;
	

	public void clickOnReject() {
		reject.click();

	}
	public void selectAllCheckBoxes() {
		selectAllCheckBox.click();

	}
	public void clickOnApprove() {
		approve.click();

	}

	public void clickOnFlagPassport() {
		flagPassport.click();

	}

	public void clickOnCancelFromRejectPop() {
		cancelFromRejectPop.click();

	}

	public void clickOnRejectFromRejectConfir() {
		rejectFromRejectConfir.click();

	}

	public void clickOnCloseFromRejectConfir() {
		closeFromRejectConfir.click();

	}

	public String textFromRejectConfirmationPop() {
		return rejectConfirmationPop.getText();

	}

	public void clickOnAcceptConfirmationPop() {
		acceptConfirmationPop.click();

	}

	public void clickOnCancelFromApprove() {
		cancelFromApprove.click();

	}

	public void clickOnConfirmFromApprove() {
		confirmFromApprove.click();

	}

	public void clickOnFlagAndReject() {
		flagAndReject.click();

	}

	public void clickOnCloseApprove() {
		closeApprove.click();

	}
	
	public String titleOfCNDocumentVerificatonPage() {

		return driver.getTitle();

	}
	
}

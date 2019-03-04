package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.applicationID;

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

	@FindBy(xpath = "//div[@class='form-group row']//div[1]//img[1]")
	WebElement confirmAirTicket;

	@FindBy(xpath = "//div[@class='col-sm-4 stretch-card']//div[2]//img[1]")
	WebElement clickOnPhoto;

	@FindBy(xpath = "//div[3]//img[1]")
	WebElement yellowFeverVaccination;

	@FindBy(xpath = "//div[4]//img[1]")
	WebElement coveringLetter;

	@FindBy(xpath = "//div[5]//img[1]")
	WebElement photoCopyOfDraft;

	@FindBy(xpath = "//div[6]//img[1]")
	WebElement idProofOfReference;

	@FindBy(xpath = "//div[7]//img[1]")
	WebElement originalInvitationLetter;

	@FindBy(xpath = "//div[8]//img[1]")
	WebElement proofOfTransitValidVisa;

	@FindBy(xpath = "//h4[contains(text(),'Confirmed air ticket')]")
	WebElement titleOfConfirmedAirTicketWindow;

	@FindBy(xpath = "//h4[contains(text(),'Recent passport size photo')]")
	WebElement titleOfRecentPhotoWindow;

	@FindBy(xpath = "//h4[contains(text(),'Yellow fever vaccination')]")
	WebElement titleOfYellowFeverWindow;

	@FindBy(xpath = "//h4[contains(text(),'Covering letter')]")
	WebElement titleOfCoveringLetterWindow;

	@FindBy(xpath = "//h4[contains(text(),'Photocopy of draft')]")
	WebElement titleOfPhotocopyOfDraftWindow;

	@FindBy(xpath = "//h4[contains(text(),'ID proof of reference')]")
	WebElement titleOfIDProofOfReferenceWindow;

	@FindBy(xpath = "//h4[contains(text(),'Original invitation letter')]")
	WebElement titleOfOriginalInvitationLetterWindow;

	@FindBy(xpath = "//h4[contains(text(),'Proof of transit valid visa')]")
	WebElement titleOfProofOfTransitValidVisaWindow;

	@FindBy(xpath = "//button[@type='button'][contains(text(),'×')]")
	List<WebElement> crossButtonToCloseWindow;

	@FindBy(xpath = "//button[@type='button'][contains(text(),'Close')]")
	List<WebElement> closeButtonToCloseWindow;

	public void crossButtonToCloseWindow1() {
		TestUtil.waitForElementforType(crossButtonToCloseWindow.get(0), 30);
		WebElement closeButton = crossButtonToCloseWindow.get(0);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();

	}
	public void crossButtonToCloseWindow2() {
		TestUtil.waitForElementforType(crossButtonToCloseWindow.get(1), 30);
		WebElement closeButton = crossButtonToCloseWindow.get(1);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void crossButtonToCloseWindow3() {
		TestUtil.waitForElementforType(crossButtonToCloseWindow.get(2), 30);
		WebElement closeButton = crossButtonToCloseWindow.get(2);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void crossButtonToCloseWindow4() {
		TestUtil.waitForElementforType(crossButtonToCloseWindow.get(3), 30);
		WebElement closeButton = crossButtonToCloseWindow.get(3);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void crossButtonToCloseWindow5() {
		TestUtil.waitForElementforType(crossButtonToCloseWindow.get(4), 30);
		WebElement closeButton = crossButtonToCloseWindow.get(4);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void crossButtonToCloseWindow6() {
		TestUtil.waitForElementforType(crossButtonToCloseWindow.get(5), 30);
		WebElement closeButton = crossButtonToCloseWindow.get(5);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void crossButtonToCloseWindow7() {
		TestUtil.waitForElementforType(crossButtonToCloseWindow.get(6), 30);
		WebElement closeButton = crossButtonToCloseWindow.get(6);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void crossButtonToCloseWindow8() {
		TestUtil.waitForElementforType(crossButtonToCloseWindow.get(7), 30);
		WebElement closeButton = crossButtonToCloseWindow.get(7);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	
	public void closeButtonToCloseWindow1() {
		TestUtil.waitForElementforType(closeButtonToCloseWindow.get(0), 30);
		WebElement closeButton = closeButtonToCloseWindow.get(0);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void closeButtonToCloseWindow2() {
		TestUtil.waitForElementforType(closeButtonToCloseWindow.get(1), 30);
		WebElement closeButton = closeButtonToCloseWindow.get(1);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void closeButtonToCloseWindow3() {
		TestUtil.waitForElementforType(closeButtonToCloseWindow.get(2), 30);
		WebElement closeButton = closeButtonToCloseWindow.get(2);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void closeButtonToCloseWindow4() {
		TestUtil.waitForElementforType(closeButtonToCloseWindow.get(3), 30);
		WebElement closeButton = closeButtonToCloseWindow.get(3);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}

	public void closeButtonToCloseWindow5() {
		TestUtil.waitForElementforType(closeButtonToCloseWindow.get(4), 30);
		WebElement closeButton = closeButtonToCloseWindow.get(4);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void closeButtonToCloseWindow6() {
		TestUtil.waitForElementforType(closeButtonToCloseWindow.get(5), 30);
		WebElement closeButton = closeButtonToCloseWindow.get(5);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void closeButtonToCloseWindow7() {
		TestUtil.waitForElementforType(closeButtonToCloseWindow.get(6), 30);
		WebElement closeButton = closeButtonToCloseWindow.get(6);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	public void closeButtonToCloseWindow8() {
		TestUtil.waitForElementforType(closeButtonToCloseWindow.get(7), 30);
		WebElement closeButton = closeButtonToCloseWindow.get(7);
		Actions action = new Actions(driver);
		action.moveToElement(closeButton).click().perform();
	}
	

	public void clickOnConfirmAirTicket() {
		//TestUtil.waitForElementforType(confirmAirTicket, 30);
		Actions action = new Actions(driver);
		action.moveToElement(confirmAirTicket).click().perform();
	//	confirmAirTicket.click();
		
	}

	public void clickOnYellowFevervaccination() {
		TestUtil.waitForElementforType(yellowFeverVaccination, 30);
		Actions action = new Actions(driver);
		action.moveToElement(yellowFeverVaccination).click().perform();
		
	}

	public void clickOnCoveringLetter() {
		TestUtil.waitForElementforType(coveringLetter, 30);
		Actions action = new Actions(driver);
		action.moveToElement(coveringLetter).click().perform();
		
	}

	public void clickOnPhotoOfDraft() {
		TestUtil.waitForElementforType(photoCopyOfDraft, 30);
		Actions action = new Actions(driver);
		action.moveToElement(photoCopyOfDraft).click().perform();
		
	}

	public void clickOnIdProofReference() {
		TestUtil.waitForElementforType(idProofOfReference, 30);
		Actions action = new Actions(driver);
		action.moveToElement(idProofOfReference).click().perform();
	
	}

	public void clickOnOriginalInvitationLetter() {
		TestUtil.waitForElementforType(originalInvitationLetter, 30);
		Actions action = new Actions(driver);
		action.moveToElement(originalInvitationLetter).click().perform();
		
	}

	public void clickOnProofOfTransitVisa() {
		TestUtil.waitForElementforType(proofOfTransitValidVisa, 30);
		Actions action = new Actions(driver);
		action.moveToElement(proofOfTransitValidVisa).click().perform();
	
	}

	public void clickOnPhoto() {
		TestUtil.waitForElementforType(clickOnPhoto, 30);
		Actions action = new Actions(driver);
		action.moveToElement(clickOnPhoto).click().perform();

	}

	public String titleOfConfirmedAirTicketWindow() throws InterruptedException {
		TestUtil.waitForElementforType(titleOfConfirmedAirTicketWindow, 30);
		return titleOfConfirmedAirTicketWindow.getText();
	}
		public String titleOfRecentPhotoWindow() throws InterruptedException {
		TestUtil.waitForElementforType(titleOfRecentPhotoWindow, 30);
		return titleOfRecentPhotoWindow.getText();

	}

	public String titleOfYellowFeverWindow() {
		TestUtil.waitForElementforType(titleOfYellowFeverWindow, 30);
		return titleOfYellowFeverWindow.getText();

	}

	public String titleOfCoveringLetterWindow() {
		TestUtil.waitForElementforType(titleOfCoveringLetterWindow, 30);
		return titleOfCoveringLetterWindow.getText();
	}

	public String titleOfPhotocopyOfDraftWindow() {
		TestUtil.waitForElementforType(titleOfPhotocopyOfDraftWindow, 30);
		return titleOfPhotocopyOfDraftWindow.getText();

	}

	public String titleOfIDProofOfReferenceWindow() {
		return titleOfIDProofOfReferenceWindow.getText();

	}

	public String titleOfOriginalInvitationLetterWindow() {
		return titleOfOriginalInvitationLetterWindow.getText();

	}

	public String titleOfProofOfTransitValidVisaWindow() {
		return titleOfProofOfTransitValidVisaWindow.getText();

	}

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

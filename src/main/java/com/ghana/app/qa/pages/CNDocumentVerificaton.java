package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
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
	
	
	@FindBy(xpath = "//img[@src='/images/pdfimg.png']")
	List<WebElement> clcikOnDocuments;
	
	@FindBy(xpath = "/uploaded_Doc/applicationID/1.png")
	WebElement clcikOnPhoto;

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

	@FindBy(xpath = "//div[@id='270965']//button[@type='button'][contains(text(),'×')]")
	WebElement crossButtonToCloseWindow;

	@FindBy(xpath = "//button[@type='button' and text()='Close']")
	WebElement closeButtonToCloseWindow;
	
	public void crossButtonToCloseWindow(){
		crossButtonToCloseWindow.click();
		
	}
	public void closeButtonToCloseWindow(){
		closeButtonToCloseWindow.click();
		
	}
	public void clickOnDocument() {
	WebElement i =	clcikOnDocuments.get(3);	
			i.click();	

	}
	public String titleOfConfirmedAirTicketWindow() throws InterruptedException{
		Thread.sleep(2000);
		return titleOfConfirmedAirTicketWindow.getText();
	}
    
	public String titleOfRecentPhotoWindow(){
		
		return titleOfRecentPhotoWindow.getText();
		
	}
	public String titleOfYellowFeverWindow(){
		return titleOfYellowFeverWindow.getText();
		
	}
	public String titleOfCoveringLetterWindow(){
		
		return titleOfCoveringLetterWindow.getText();
	}
	public String titleOfPhotocopyOfDraftWindow(){
		return titleOfPhotocopyOfDraftWindow.getText();
		
	}
	public String titleOfIDProofOfReferenceWindow(){
		return titleOfIDProofOfReferenceWindow.getText();
		
	}
	public String titleOfOriginalInvitationLetterWindow(){
		return titleOfOriginalInvitationLetterWindow.getText();
		
	}
	public String titleOfProofOfTransitValidVisaWindow(){
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

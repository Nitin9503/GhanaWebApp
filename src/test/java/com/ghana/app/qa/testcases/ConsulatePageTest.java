package com.ghana.app.qa.testcases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.CNAddressInfo;

public class ConsulatePageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ConsulatePageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 0)
	public void loginIntoConsulate() {
		highAndConsulateLoginPage.passUserName("CN1234");
		highAndConsulateLoginPage.passPassword("1234");
		highAndConsulateLoginPage.clickOnLoginButton();
	}

	@Test(priority = 1)
	public void verifyTitleOfConsulateTitle() {
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
	}

	@Test(priority = 2)
	public void clickOnNewApplication() {
		consulatedashBoardPage.clickOnNewApplication();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 3)
	public void verfiyTitleOfCNAddressInfoPage() throws InterruptedException {
		applicantDashBoardPage.clickOnAddressInfor();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to CN Address Info page upon clicking on Address Information from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 4)
	public void verfiyTitleOfCNTravelInfoPage() throws InterruptedException {
		applicantDashBoardPage.clickOnTravelInfor();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Travel Information from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 5)
	public void verfiyTitleOfCNDocumentVerificatonPage() throws InterruptedException {
		applicantDashBoardPage.clickOnDocumentVeri();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification",
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 6)
	public void clickOnCheckBoxes() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cNDocumentVerificaton.selectAllCheckBoxes();
		softAssertion.assertTrue(cNDocumentVerificaton.selectAllCheckBoxes(),
				"Check Boxes is not selected upon clicking on [Select All Check] from Document Verification page");
		softAssertion.assertAll();
	}

	@Test(priority = 7)
	public void passComment() {
		applicantDashBoardPage.passComment("Verifying your Application");
		applicantDashBoardPage.addCooment();
		applicantDashBoardPage.getTextFromAddedComment();
		softAssertion.assertEquals(applicantDashBoardPage.getTextFromAddedComment(), "Verifying your Application",
				"Latest passed comment is not matched after getting text from comment section");
		softAssertion.assertAll();
	}

	@Test(priority = 8)
	public void clickOnConfirmedAirTicketWindow() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), "Confirmed air ticket",
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow1();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification",
				"We are not navigate to Document Verification page upon clicking on Close Button from Confirm Air Ticket Window");
		softAssertion.assertAll();
	}

	@Test(priority = 9)
	public void clickOnYellowFevervaccination() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), "Yellow fever vaccination",
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		cNDocumentVerificaton.closeButtonToCloseWindow3();
		softAssertion.assertAll();
	}

	@Test(priority = 10)
	public void clickOnOnPhoto() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), "Recent passport size photo",
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		cNDocumentVerificaton.closeButtonToCloseWindow2();
		softAssertion.assertAll();
	}

	@Test(priority = 11)
	public void clickOnCoveringLetter() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), "Covering letter",
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow4();
		softAssertion.assertAll();

	}

	@Test(priority = 12)
	public void clickOnPhotoOfDraft() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhotoOfDraft();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfPhotocopyOfDraftWindow(), "Photocopy of draft",
				"Photocopy of draft window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Photocopy of draft)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow5();
		softAssertion.assertAll();
	}

	@Test(priority = 13)
	public void clickOnIdProofReference() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), "ID proof of reference",
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow6();
		softAssertion.assertAll();
	}

	@Test(priority = 14)
	public void clickOnOriginalInvitationLetter() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(),
				"Original invitation letter",
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow7();
		softAssertion.assertAll();
	}

	@Test(priority = 15)
	public void clickOnProofOfTransitVisa() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(),
				"Proof of transit valid visa",
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		cNDocumentVerificaton.closeButtonToCloseWindow8();
		softAssertion.assertAll();
	}

	@Test(priority = 16)
	public void clickOnApplicantInfor() throws InterruptedException {
		Thread.sleep(2000);
		applicantDashBoardPage.clickOnApplicantInfor();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on Applicant Information from Document Verifcation");
		softAssertion.assertAll();

	}

	@Test(priority = 17)
	public void clickOnNextButtonAndVerifyTitleAddressInformation() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to CN Address Info page upon clicking on Next Button from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 18)
	public void clickOnNextButtonAndVerifyTitleTravelInformation() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Next Button from Address Information");
		softAssertion.assertAll();
	}

	@Test(priority = 19)
	public void clickOnNextButtonAndVerifyTitleDocumentVerification() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification",
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");
		softAssertion.assertAll();
	}

	@Test(priority = 20, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopText() throws InterruptedException {
		cNDocumentVerificaton.clickOnApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		cNDocumentVerificaton.clickOnCancelFromApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 21, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopText1() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnCloseApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 22, description = "Click On Reject And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		softAssertion.assertEquals(cNDocumentVerificaton.textFromRejectConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		cNDocumentVerificaton.clickOnCancelFromRejectPop();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 23, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText1() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		softAssertion.assertEquals(cNDocumentVerificaton.textFromRejectConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnCloseFromRejectConfir();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 24, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleTravelInformation() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Back Button from Document Verification");
		softAssertion.assertAll();
		
	}
	@Test(priority = 24, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleAddressInformation() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to Address Information page upon clicking on Back Button from Travel Information");
		softAssertion.assertAll();
		
	}
}

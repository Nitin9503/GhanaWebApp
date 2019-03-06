package com.ghana.app.qa.testcases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;

public class ConsulatePageTest extends DriverInit {

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
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");

	}

	@Test(priority = 2)
	public void clickOnNewApplication() {
		consulatedashBoardPage.clickOnNewApplication();
		Assert.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");

	}

	@Test(priority = 3)
	public void verfiyTitleOfCNAddressInfoPage() throws InterruptedException {
		applicantDashBoardPage.clickOnAddressInfor();
		Assert.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to CN Address Info page upon clicking on Address Information from Applicant Dashboard");

	}

	@Test(priority = 4)
	public void verfiyTitleOfCNTravelInfoPage() throws InterruptedException {
		applicantDashBoardPage.clickOnTravelInfor();
		Assert.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Travel Information from Applicant Dashboard");

	}

	@Test(priority = 5)
	public void verfiyTitleOfCNDocumentVerificatonPage() throws InterruptedException {
		applicantDashBoardPage.clickOnDocumentVeri();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification",
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");

	}

	@Test(priority = 6)
	public void clickOnCheckBoxes() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cNDocumentVerificaton.selectAllCheckBoxes();
		System.out.println("value  ==>>" +cNDocumentVerificaton.selectAllCheckBoxes());
		Assert.assertTrue(cNDocumentVerificaton.selectAllCheckBoxes(), "Check Boxes is not selected upon clicking on [Select All Check] from Document Verification page" );

	}

	/*@Test(priority = 7)
	public void passComment() {
		applicantDashBoardPage.passComment("Verifying your Application");
		applicantDashBoardPage.addCooment();
		applicantDashBoardPage.getTextFromAddedComment();
		Assert.assertEquals(applicantDashBoardPage.getTextFromAddedComment(), "Verifying your Application",
				"Latest passed comment is not matched after getting text from comment section");

	}

	@Test(priority = 8)
	public void clickOnConfirmedAirTicketWindow() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		Assert.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), "Confirmed air ticket",
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow1();

	}

	@Test(priority = 9)
	public void clickOnYellowFevervaccination() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		Assert.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), "Yellow fever vaccination",
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		cNDocumentVerificaton.closeButtonToCloseWindow3();
	
	}

	@Test(priority = 10)
	public void clickOnOnPhoto() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		Assert.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), "Recent passport size photo",
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		cNDocumentVerificaton.closeButtonToCloseWindow2();

	}

	@Test(priority = 11)
	public void clickOnCoveringLetter() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), "Covering letter",
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow4();

	}

	@Test(priority = 12)
	public void clickOnPhotoOfDraft() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhotoOfDraft();
		Assert.assertEquals(cNDocumentVerificaton.titleOfPhotocopyOfDraftWindow(), "Photocopy of draft",
				"Photocopy of draft window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Photocopy of draft)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow5();

	}

	@Test(priority = 13)
	public void clickOnIdProofReference() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		Assert.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), "ID proof of reference",
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow6();

	}

	@Test(priority = 14)
	public void clickOnOriginalInvitationLetter() throws InterruptedException {
		cNDocumentVerificaton.clickOnOriginalInvitationLetter();
		Assert.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(), "Original invitation letter",
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow7();

	}

	@Test(priority = 15)
	public void clickOnProofOfTransitVisa() throws InterruptedException {
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		Assert.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(), "Proof of transit valid visa",
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		cNDocumentVerificaton.closeButtonToCloseWindow8();

	}*/
	@Test(priority = 16)
	public void clickOnApplicantInfor() throws InterruptedException {
		applicantDashBoardPage.clickOnApplicantInfor();
		Assert.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on Applicant Information from Document Verifcation");


	}
	@Test(priority = 17)
	public void clickOnNextButtonAndVerifyTitleAddressInformation() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		Assert.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to CN Address Info page upon clicking on Next Button from Applicant Dashboard");

	}

	@Test(priority = 18)
	public void clickOnNextButtonAndVerifyTitleTravelInformation() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		Assert.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Next Button from Address Information");


	}

	@Test(priority = 19)
	public void clickOnNextButtonAndVerifyTitleDocumentVerification() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification",
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");

	}
	@Test(priority = 20)
	public void clickOnApprove() throws InterruptedException {
		cNDocumentVerificaton.clickOnApprove();
		Assert.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		cNDocumentVerificaton.clickOnCancelFromApprove();
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnApprove();
		cNDocumentVerificaton.clickOnCloseApprove();
	}
	
}

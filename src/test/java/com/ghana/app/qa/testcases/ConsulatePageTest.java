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

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import com.ghana.app.qa.util.TestUtil;

public class ConsulatePageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ConsulatePageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 0, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
	public void loginIntoConsulate() {
		highAndConsulateLoginPage.passUserName("CN1234");
		highAndConsulateLoginPage.passPassword("1234");
		highAndConsulateLoginPage.clickOnLoginButton();
	}

	@Test(priority = 1 , description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button")
	public void verifyTitleOfConsulateTitle() {
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
	}  

	@Test(priority = 2 ,description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button" )
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
	public void passComment() {
		applicantDashBoardPage.passComment("Verifying your Application");
		applicantDashBoardPage.addCooment();
		applicantDashBoardPage.getTextFromAddedComment();
		softAssertion.assertEquals(applicantDashBoardPage.getTextFromAddedComment(), "Verifying your Application",
				"Latest passed comment is not matched after getting text from comment section");
		softAssertion.assertAll();
	}

	@Test(priority = 7, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnConfirmedAirTicketWindowClose() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), "Confirmed air ticket",
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow1();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("1");
	}	

	@Test(priority = 8, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page  ")
	public void clickOnConfirmedAirTicketWindow() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), "Confirmed air ticket",
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("2");
	}

	@Test(priority = 9, description = "click On Photo and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOnPhotoClose() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), "Recent passport size photo",
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		cNDocumentVerificaton.closeButtonToCloseWindow2();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("4");
	}

	@Test(priority = 10, description = "click On Photo and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOnPhoto() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), "Recent passport size photo",
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("3");
	}

	@Test(priority = 11, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationClose() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), "Yellow fever vaccination",
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		cNDocumentVerificaton.closeButtonToCloseWindow3();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 12, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnYellowFevervaccination() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), "Yellow fever vaccination",
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 13, description = "click On Covering Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnCoveringLetterClose() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), "Covering letter",
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow4();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 14, description = "click On Covering Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnCoveringLetter() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), "Covering letter",
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 15, description = "click On Photo Of Draft and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnPhotoOfDraftClose() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhotoOfDraft();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfPhotocopyOfDraftWindow(), "Photocopy of draft",
				"Photocopy of draft window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Photocopy of draft)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow5();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Photocopy of draft");
		softAssertion.assertAll();
	}

	@Test(priority = 16, description = "click On Photo Of Draft and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnPhotoOfDraft() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhotoOfDraft();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfPhotocopyOfDraftWindow(), "Photocopy of draft",
				"Photocopy of draft window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Photocopy of draft)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Photocopy of draft");
		softAssertion.assertAll();
	}

	@Test(priority = 17, description = "click On Id Proof Reference and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnIdProofReferenceClose() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), "ID proof of reference",
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow6();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 18, description = "click On Id Proof Reference and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnIdProofReference() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), "ID proof of reference",
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 19, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetterClose() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(),
				"Original invitation letter",
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow7();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 20, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetter() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(),
				"Original invitation letter",
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 21, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaClose() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(),
				"Proof of transit valid visa",
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		cNDocumentVerificaton.closeButtonToCloseWindow8();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		softAssertion.assertAll();
	}

	@Test(priority = 22, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisa() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(),
				"Proof of transit valid visa",
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		softAssertion.assertAll();
	}

	@Test(priority = 23)
	public void clickOnApplicantInfor() throws InterruptedException {
		Thread.sleep(2000);
		applicantDashBoardPage.clickOnApplicantInfor();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on Applicant Information from Document Verifcation");
		softAssertion.assertAll();

	}

	@Test(priority = 24)
	public void clickOnNextButtonAndVerifyTitleAddressInformation() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to CN Address Info page upon clicking on Next Button from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 25)
	public void clickOnNextButtonAndVerifyTitleTravelInformation() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Next Button from Address Information");
		softAssertion.assertAll();
	}

	@Test(priority = 26)
	public void clickOnNextButtonAndVerifyTitleDocumentVerification() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification",
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");
		softAssertion.assertAll();
	}

	@Test(priority = 27)
	public void selectAllCheckBoxAndVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.verifyAllCheckBox();
		System.out.println("selectedBoxDoc" +selectedBoxDocAll);
		softAssertion.assertTrue(selectedBoxDocAll,
				"Check Boxes is not selected upon clicking on [Select All Check] only select all button from Document Verification page");		
		softAssertion.assertTrue(selectedCheckBoxOnDocSingle,
				"All check Boxes is not selected upon clicking on [Select All Check] from Document Verification page");
		softAssertion.assertAll();
	}
	@Test(priority = 28)
	public void selectOneByOneCheckBoxAndVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.selectOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		cNDocumentVerificaton.verifyOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		softAssertion.assertTrue(selectedCheckBoxOnDocSingle,
				"Check Boxes is not selected upon clicking on [One By One Check] from Document Verification page");
		softAssertion.assertAll();
	}
	

	@Test(priority = 28, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopText() throws InterruptedException {
		cNDocumentVerificaton.clickOnApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		cNDocumentVerificaton.clickOnCancelFromApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 29, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
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

	@Test(priority = 30, description = "Click On Reject And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
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

	@Test(priority = 31, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
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

	@Test(priority = 32, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleTravelInformation() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Back Button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 33, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleAddressInformation() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to Address Information page upon clicking on Back Button from Travel Information");
		softAssertion.assertAll();

	}

	@Test(priority = 34, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleApplicantInformation() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on Applicant Information from Document Verifcation");
		softAssertion.assertAll();

	}

	@Test(priority = 35, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Cancel")
	public void clickOnInterviewScheduleAndcancel() throws InterruptedException {
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(9000);
		System.out.println("cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		softAssertion.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), "Confirmation",
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		System.out.println("cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		cNInterviewSchedule.cancelButtonFromInterviewConfirpop();
		softAssertion.assertAll();

	}

	@Test(priority = 36, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Close")
	public void clickOnInterviewScheduleAndClose() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		softAssertion.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), "Confirmation",
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		Thread.sleep(3000);
		cNInterviewSchedule.closeButtonFromInterviewConfirpop();
		softAssertion.assertAll();

	}

	/*@Test(priority = 37, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Pass Date And Time")
	public void passDateAndTimeInFiled() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		softAssertion.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), "Confirmation",
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		cNInterviewSchedule.passDate1("04/23/2019");
		cNInterviewSchedule.passDate2("04/23/2019");
		cNInterviewSchedule.passDate3("04/23/2019");
		cNInterviewSchedule.passTime1("12:00PM");
		cNInterviewSchedule.passTime2("02:00AM");
		cNInterviewSchedule.passTime3("03:00AM");
		Thread.sleep(3000);
		cNInterviewSchedule.confirmButtonFromInterviewConfirpop();
		softAssertion.assertAll();
	}*/

	@Test(priority = 38, description = "Here we are getting text from Applicant Information and comparing with Applicant filed data")
	public void getTextFromApplicantInformation() throws InterruptedException {

		softAssertion.assertEquals(applicantDashBoardPage.getTextFullName(), (firstName + " " + lastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextPassportNumber(), (passportNumber),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextDateOfBirth(), (birthDate),
				"Provided and Get Birth Date  are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextBirthPlace(), (birthPlace),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextDateOfPassportIssue(), (passportIssuedDate),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextPassportExpiryDate(), (passportExpiryDate),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
		applicantDashBoardPage.clickOnNextButton();
	}

	@Test(priority = 39, description = "Here we are getting text from Address Information and comparing with Applicant filed data")
	public void getTextFromAddressInformation() throws InterruptedException {

		softAssertion.assertEquals(cNAddressInfo.getTextFromEmailID(), (emailId),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromPhoneNumber(), (phoneNumber),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextlandmark(), (Landmark),
				"Provided and Get Landmark are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromAddress(), (FlatNo + "," + StreetName),
				"Provided and Get Birth Date  are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromCityAndPinCode(), (cityName + "," + pinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromState(), (stateName),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromCountry(), (countryName),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
		applicantDashBoardPage.clickOnNextButton();
	}

	@Test(priority = 40, description = "Here we are getting text from Travel Information and comparing with Applicant filed data")
	public void getTextFromTravelInformation() throws InterruptedException {

		softAssertion.assertEquals(cNTravelInfo.getTextReferenceName1(), (priFirstName + " " + priLastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceContact1(), (primaryRefrencePhoneNo),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceAddress1(),
				(primaryAddress + "," + primaryCity + "," + primaryState + "," + primaryCountry + "," + primaryPinCode),
				"Provided and Get Landmark are not matched 1");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceCity1(), (primaryCity + "," + primaryPinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceState1(), (primaryState),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceCountry1(), (primaryCountry),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceName2(), (secFirstName + " " + secLastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceContact2(), (secondaryRefrencePhoneNo),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(
				cNTravelInfo.getTextReferenceAddress2(), (secondaryAddress + "," + secondaryCity + "," + secondaryState
						+ "," + secondaryCountry + "," + secondaryPinCode),
				"Provided and Get Landmark are not matched 2");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceCity2(), (secondaryCity + "," + secondaryPinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceState2(), (secondaryState),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceCountry2(), (secondaryCountry),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
		applicantDashBoardPage.clickOnNextButton();
	}
}

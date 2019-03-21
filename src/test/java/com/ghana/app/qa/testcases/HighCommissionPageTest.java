package com.ghana.app.qa.testcases;
import static com.ghana.app.qa.testdata.ConstantVariable.FlatNo;
import static com.ghana.app.qa.testdata.ConstantVariable.Landmark;
import static com.ghana.app.qa.testdata.ConstantVariable.StreetName;
import static com.ghana.app.qa.testdata.ConstantVariable.birthDate;
import static com.ghana.app.qa.testdata.ConstantVariable.birthPlace;
import static com.ghana.app.qa.testdata.ConstantVariable.cityName;
import static com.ghana.app.qa.testdata.ConstantVariable.countryName;
import static com.ghana.app.qa.testdata.ConstantVariable.emailId;
import static com.ghana.app.qa.testdata.ConstantVariable.firstName;
import static com.ghana.app.qa.testdata.ConstantVariable.lastName;
import static com.ghana.app.qa.testdata.ConstantVariable.passportExpiryDate;
import static com.ghana.app.qa.testdata.ConstantVariable.passportIssuedDate;
import static com.ghana.app.qa.testdata.ConstantVariable.passportNumber;
import static com.ghana.app.qa.testdata.ConstantVariable.phoneNumber;
import static com.ghana.app.qa.testdata.ConstantVariable.pinCode;
import static com.ghana.app.qa.testdata.ConstantVariable.priFirstName;
import static com.ghana.app.qa.testdata.ConstantVariable.priLastName;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryAddress;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryCity;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryCountry;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryPinCode;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryRefrencePhoneNo;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryState;
import static com.ghana.app.qa.testdata.ConstantVariable.secFirstName;
import static com.ghana.app.qa.testdata.ConstantVariable.secLastName;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryAddress;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryCity;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryCountry;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryPinCode;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryRefrencePhoneNo;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryState;
import static com.ghana.app.qa.testdata.ConstantVariable.selectedBoxDocAll;
import static com.ghana.app.qa.testdata.ConstantVariable.selectedCheckBoxOnDocSingle;
import static com.ghana.app.qa.testdata.ConstantVariable.stateName;
import static com.ghana.app.qa.util.TestUtil.prop;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class HighCommissionPageTest extends ConsulatePageTest{

	SoftAssert softAssertion = new SoftAssert();
	
	public HighCommissionPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test(priority = 94, description = "This test will verify login functinality of HighCommission with valid creadentials and click on Login button")
	public void loginIntoHighCommission() throws InterruptedException {
		Thread.sleep(5000);
		
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(2);	
		driver.get(prop.getProperty("HCDLoginURL"));
		highAndConsulateLoginPage.passUserName("HCD1234");
		highAndConsulateLoginPage.passPassword("1234");
		highAndConsulateLoginPage.clickOnLoginButton();

	}
	
	@Test(priority=95, description = "This test will verify the title of HighCommission page after login" )
	public void verifHighCommissionPageTitle(){
		softAssertion.assertEquals(		
				hCDDashboardPage.titleofHCDDashBoard(), "Welcome To Ghana Embassy",
				"We are not navigate to High Commission dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
	}
	@Test(priority = 96 ,description = "This test will verify we navigated to HCDGeneral Verification page upon cliclking on New Application" )
	public void clickOnNewApplication() {
		hCDDashboardPage.clickOnNewApplication();
		softAssertion.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), "HCDGeneral Verification",
				"We are not navigate to HCDGeneral Verification page upon clicking on New Application from HCD Dashboard");
		softAssertion.assertAll();
	}
	@Test(priority =97)
	public void passComment() {
		hCDDocumentVerificationPage.passComment("Verifying your Application");
		hCDDocumentVerificationPage.addCooment();
		hCDDocumentVerificationPage.getTextFromAddedComment();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextFromAddedComment(), "Verifying your Application",
				"Latest passed comment is not matched after getting text from comment section");
		softAssertion.assertAll();
	}

	@Test(priority = 98, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnConfirmedAirTicketWindowClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnConfirmAirTicket();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfConfirmedAirTicketWindow(), "Confirmed air ticket",
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.closeButtonToCloseWindow1();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("1");
	}	

	@Test(priority = 99, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page  ")
	public void clickOnConfirmedAirTicketWindow() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnConfirmAirTicket();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfConfirmedAirTicketWindow(), "Confirmed air ticket",
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("2");
	}

	@Test(priority = 100, description = "click On Photo and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOnPhotoClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnPhoto();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfRecentPhotoWindow(), "Recent passport size photo",
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow2();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("4");
	}

	@Test(priority = 101, description = "click On Photo and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOnPhoto() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnPhoto();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfRecentPhotoWindow(), "Recent passport size photo",
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("3");
	}

	@Test(priority = 102, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnYellowFevervaccination();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfYellowFeverWindow(), "Yellow fever vaccination",
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow3();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 103, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnYellowFevervaccination() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnYellowFevervaccination();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfYellowFeverWindow(), "Yellow fever vaccination",
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 104, description = "click On Covering Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnCoveringLetterClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnCoveringLetter();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfCoveringLetterWindow(), "Covering letter/introduction Letter",
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow4();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 105, description = "click On Covering Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnCoveringLetter() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnCoveringLetter();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfCoveringLetterWindow(), "Covering letter/introduction Letter",
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 106, description = "click On Photo Of Draft and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnPhotoOfDraftClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnPhotoOfDraft();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfPhotocopyOfDraftWindow(), "One photocopy of draft",
				"Photocopy of draft window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Photocopy of draft)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.closeButtonToCloseWindow5();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Photocopy of draft");
		softAssertion.assertAll();
	}

	@Test(priority = 107, description = "click On Photo Of Draft and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnPhotoOfDraft() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnPhotoOfDraft();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfPhotocopyOfDraftWindow(), "One photocopy of draft",
				"Photocopy of draft window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Photocopy of draft)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Photocopy of draft");
		softAssertion.assertAll();
	}

	@Test(priority = 108, description = "click On Id Proof Reference and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnIdProofReferenceClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnIdProofReference();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfIDProofOfReferenceWindow(), "ID proof of reference in Ghana",
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.closeButtonToCloseWindow6();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 109, description = "click On Id Proof Reference and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnIdProofReference() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnIdProofReference();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfIDProofOfReferenceWindow(), "ID proof of reference in Ghana",
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 110, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetterClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfOriginalInvitationLetterWindow(),
				"Original invitation letter",
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow7();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 111, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetter() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfOriginalInvitationLetterWindow(),
				"Original invitation letter",
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 112, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfProofOfTransitValidVisaWindow(),
				"Proof of transit valid visa for subsequent destination",
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow8();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		softAssertion.assertAll();
	}

	@Test(priority = 113, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisa() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfProofOfTransitValidVisaWindow(),
				"Proof of transit valid visa for subsequent destination",
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Applicant Information",
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		softAssertion.assertAll();
	}
	@Test(priority = 114)
	public void verfiyTitleOfCNDocumentVerificatonPage() throws InterruptedException {
		hCDGeneralVerificationPage.clickOnDocumentVeri();
		softAssertion.assertEquals(hCDGeneralVerificationPage.titleOfCNDocumentVerificatonPage(), "HCD Doccument Verification",
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	}
	
	@Test(priority = 115)
	public void selectAllCheckBoxAndVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		hCDDocumentVerificationPage.selectAllCheckBoxes();
		hCDDocumentVerificationPage.verifyAllCheckBox();
		System.out.println("selectedBoxDoc" +selectedBoxDocAll);
		softAssertion.assertTrue(selectedBoxDocAll,
				"Check Boxes is not selected upon clicking on [Select All Check] only select all button from Document Verification page");		
		softAssertion.assertTrue(selectedCheckBoxOnDocSingle,
				"All check Boxes is not selected upon clicking on [Select All Check] from Document Verification page");
		softAssertion.assertAll();
	}
	@Test(priority = 116)
	public void selectOneByOneCheckBoxAndVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hCDDocumentVerificationPage.selectAllCheckBoxes();
		hCDDocumentVerificationPage.selectOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		hCDDocumentVerificationPage.verifyOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		softAssertion.assertTrue(selectedCheckBoxOnDocSingle,
				"Check Boxes is not selected upon clicking on [One By One Check] from Document Verification page");
		softAssertion.assertAll();
	}
	@Test(priority = 117, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopText() throws InterruptedException {
		hCDDocumentVerificationPage.clickOnApprove();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextFromAcceptConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		hCDDocumentVerificationPage.clickOnCancelFromApprove();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 118, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopText1() throws InterruptedException {
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnApprove();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextFromAcceptConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnCloseApprove();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		
		
		
		softAssertion.assertAll();
	}

	@Test(priority = 119, description = "Click On Reject And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText() throws InterruptedException {
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnReject();
		softAssertion.assertEquals(hCDDocumentVerificationPage.textFromRejectConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		hCDDocumentVerificationPage.clickOnCancelFromRejectPop();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority =120, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText1() throws InterruptedException {
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnReject();
		softAssertion.assertEquals(hCDDocumentVerificationPage.textFromRejectConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnCloseFromRejectConfir();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		softAssertion.assertAll();
	}
	@Test(priority = 121, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Cancel")
	public void clickOnInterviewScheduleAndcancel() throws InterruptedException {
		hCDGeneralVerificationPage.clickOnScheduleInterview();
		Thread.sleep(9000);
		System.out.println("hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		softAssertion.assertEquals(hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), "Confirmation",
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		System.out.println("hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		hCDInterviewSchedule.cancelButtonFromInterviewConfirpop();
		softAssertion.assertAll();

	}

	@Test(priority = 122, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Close")
	public void clickOnInterviewScheduleAndClose() throws InterruptedException {
		Thread.sleep(3000);
		hCDGeneralVerificationPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		softAssertion.assertEquals(hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), "Confirmation",
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		Thread.sleep(3000);
		hCDInterviewSchedule.closeButtonFromInterviewConfirpop();
		softAssertion.assertAll();

	}

	@Test(priority = 123, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Pass Date And Time")
	public void passDateAndTimeInFiled() throws InterruptedException {
		Thread.sleep(3000);
		hCDGeneralVerificationPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		softAssertion.assertEquals(hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), "Confirmation",
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		hCDInterviewSchedule.passDate1("04/23/2019");
		hCDInterviewSchedule.passDate2("04/23/2019");
		hCDInterviewSchedule.passDate3("04/23/2019");
		hCDInterviewSchedule.passTime1("12:00PM");
		hCDInterviewSchedule.passTime2("02:00AM");
		hCDInterviewSchedule.passTime3("03:00AM");
		Thread.sleep(3000);
		hCDInterviewSchedule.confirmButtonFromInterviewConfirpop();
		softAssertion.assertAll();
	}
	@Test(priority = 124)
	public void clickOnPreviousButtonAndVerifyTitleApplicantInformation() throws InterruptedException {
		hCDDocumentVerificationPage.previousButtonFromDocument();
		softAssertion.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), "HCDGeneral Verification",
				"We are not navigate to HCDGeneral Verification page upon clicking on Previous Button from Applicant Information");
		softAssertion.assertAll();
	}
	@Test(priority = 125)
	public void clickOnNextButtonAndVerifyTitleDocumentVerifi() throws InterruptedException {
		hCDGeneralVerificationPage.clickOnnNxtButton();
		softAssertion.assertEquals(hCDGeneralVerificationPage.titleOfCNDocumentVerificatonPage(), "HCD Doccument Verification",
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	
	}
	
	@Test(priority = 126, description = "Here we are getting text from Applicant Information and comparing with Applicant filed data")
	public void getTextFromApplicantInformation() throws InterruptedException {
		hCDGeneralVerificationPage.clickOnApplicantInfor();
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextFullName(), (firstName + " " + lastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextPassportNumberHCD(), (passportNumber),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextDateOfBirthHCD(), (birthDate),
				"Provided and Get Birth Date  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextPlaceOfBirthHCD(), (birthPlace),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextPassportDateOfIssueHCD(), (passportIssuedDate),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextPassportExpiryDateHCD(), (passportExpiryDate),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
	
	}

	@Test(priority = 127, description = "Here we are getting text from Address Information and comparing with Applicant filed data")
	public void getTextFromAddressInformation() throws InterruptedException {

		softAssertion.assertEquals(hCDApplicantInfoPage.getTextEmailIdHCD(), (emailId),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextPhoneNumberHCD(), (phoneNumber),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextLandmarkHCD(), (Landmark),
				"Provided and Get Landmark are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextAddressLine1HCD(), (FlatNo + "," + StreetName),
				"Provided and Get Birth Date  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextcityAndPinHCD(), (cityName + "," + pinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextEm_state(), (stateName),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextEm_country(), (countryName),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
	
	}

	@Test(priority = 128, description = "Here we are getting text from Travel Information and comparing with Applicant filed data")
	public void getTextFromTravelInformation() throws InterruptedException {

		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefName1HCD(), (priFirstName + " " + priLastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefContact1HCD(), (primaryRefrencePhoneNo),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefAddress1HCD(),
				(primaryAddress + "," + primaryCity + "," + primaryState + "," + primaryCountry + "," + primaryPinCode),
				"Provided and Get Landmark are not matched 1");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefCity1HCD(), (primaryCity + "," + primaryPinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefState1HCD(), (primaryState),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefCountry1HCD(), (primaryCountry),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefName2HCD(), (secFirstName + " " + secLastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefContact2HCD(), (secondaryRefrencePhoneNo),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(
				hCDApplicantInfoPage.getTextRefAddress2HCD(), (secondaryAddress + "," + secondaryCity + "," + secondaryState
						+ "," + secondaryCountry + "," + secondaryPinCode),
				"Provided and Get Landmark are not matched 2");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefCity2HCD(), (secondaryCity + "," + secondaryPinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefState2HCD(), (secondaryState),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextrefCountry2HCD(), (secondaryCountry),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
		TestUtil.toSwitchBetweenWindows(0);
	}
	
}

/*hCDDashboardPage
hCDGeneralVerificationPage
hCDApplicantInfoPage
hCDDocumentVerificationPage*/
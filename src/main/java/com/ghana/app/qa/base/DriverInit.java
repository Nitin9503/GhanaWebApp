package com.ghana.app.qa.base;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ghana.app.qa.pages.EmergencyContactPage;
import com.ghana.app.qa.pages.ConsulatedashBoardPage;
import com.ghana.app.qa.pages.HighAndConsulateLoginPage;
import com.ghana.app.qa.pages.AddressInfoPage;
import com.ghana.app.qa.pages.HomePage;
import com.ghana.app.qa.pages.ApplicantDashBoardPage;
import com.ghana.app.qa.pages.CNAddressInfo;
import com.ghana.app.qa.pages.CNDocumentVerificaton;
import com.ghana.app.qa.pages.CNInterviewSchedule;
import com.ghana.app.qa.pages.CNTravelInfo;
import com.ghana.app.qa.pages.PersonalInfoPage;
import com.ghana.app.qa.pages.ReviewApplicationPage;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.pages.TravelInfoPage;
import com.ghana.app.qa.pages.UploadDocPage;
import com.ghana.app.qa.pages.VisaCategoriesPage;

public class DriverInit extends TestBase {

	public DriverInit() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static HomePage homePage;
	public static VisaCategoriesPage visaCategoriesPage;
	public static SignUpPage signUpPage;
	public static PersonalInfoPage personalInfoPage;
	public static AddressInfoPage addressInfoPage;
	public static EmergencyContactPage emergencyContactPage;
	public static TravelInfoPage travelInfoPage;
	public static ReviewApplicationPage reviewApplicationPage;

	// Consulate and HighCommission side
	public static HighAndConsulateLoginPage highAndConsulateLoginPage;
	public static ConsulatedashBoardPage consulatedashBoardPage;
	public static ApplicantDashBoardPage applicantDashBoardPage;
	public static CNAddressInfo cNAddressInfo;
	public static CNTravelInfo cNTravelInfo;
	public static CNDocumentVerificaton cNDocumentVerificaton;
	public static CNInterviewSchedule cNInterviewSchedule;
	public static UploadDocPage uploadDocPage;


	@BeforeClass
	public void setUp() throws Exception {

		initialization();
		homePage = new HomePage();
		visaCategoriesPage = new VisaCategoriesPage();
		signUpPage = new SignUpPage();
		personalInfoPage = new PersonalInfoPage();
        highAndConsulateLoginPage =new HighAndConsulateLoginPage();
		addressInfoPage = new AddressInfoPage();
		emergencyContactPage = new EmergencyContactPage();
		travelInfoPage =new TravelInfoPage();
		uploadDocPage = new UploadDocPage();
		reviewApplicationPage = new ReviewApplicationPage();
		
		highAndConsulateLoginPage = new HighAndConsulateLoginPage();
		consulatedashBoardPage = new ConsulatedashBoardPage();
		applicantDashBoardPage = new ApplicantDashBoardPage();
		cNAddressInfo = new CNAddressInfo();
		cNTravelInfo = new CNTravelInfo();
		cNDocumentVerificaton = new CNDocumentVerificaton();
		cNInterviewSchedule = new CNInterviewSchedule();

		
	}
	


	/*
	 * @AfterClass public void tearDown() {
	 * 
	 * driver.quit(); }
	 */

}

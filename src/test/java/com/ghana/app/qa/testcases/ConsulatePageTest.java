package com.ghana.app.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;

public class ConsulatePageTest extends DriverInit {

	public ConsulatePageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=0)
	public void loginIntoConsulate(){
		highAndConsulateLoginPage.passUserName("CN1234");
		highAndConsulateLoginPage.passPassword("1234");
		highAndConsulateLoginPage.clickOnLoginButton();
	}
	@Test(priority=1)
	public void verifyTitleOfConsulateTitle(){	
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy", "We are not navigate to consulate dashboard page after enetering valid creadentials");

	}
	@Test(priority=2)
	public void clickOnNewApplication(){	
		consulatedashBoardPage.clickOnNewApplication();
	}
	
	@Test(priority=3)
	public void verfiyTitleOfApplcationDetails(){
		Assert.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard", "We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
	
		
	}
	@Test(priority=4)
	public void verfiyTitleOfCNAddressInfoPage() throws InterruptedException{
		
		applicantDashBoardPage.clickOnAddressInfor();
		Assert.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information", "We are not navigate to CN Address Info page upon clicking on Address Information from Applicant Dashboard");	
		
	}
	@Test(priority=5)
	public void verfiyTitleOfCNTravelInfoPage() throws InterruptedException{
		applicantDashBoardPage.clickOnTravelInfor();
		Assert.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information", "We are not navigate to Travel Information page upon clicking on Travel Information from Applicant Dashboard");
			
	}
	@Test(priority=6)
	public void verfiyTitleOfCNDocumentVerificatonPage() throws InterruptedException{
		applicantDashBoardPage.clickOnDocumentVeri();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification", "We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
			
	}
	@Test(priority=7)
	public void clickOnCheckBoxes(){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	cNDocumentVerificaton.selectAllCheckBoxes();
		
	}
	@Test(priority=8)
	public void passComment(){	
		applicantDashBoardPage.passComment("Verifying your Application");
		applicantDashBoardPage.addCooment();
		applicantDashBoardPage.getTextFromAddedComment();
		Assert.assertEquals(applicantDashBoardPage.getTextFromAddedComment(), "Verifying your Application", "Latest passed comment is not matched after getting text from comment section");
		
	}
	@Test(priority=9)
	public void clickOnDocuments() throws InterruptedException{	
		cNDocumentVerificaton.clickOnDocument();
		Assert.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), "Confirmed air ticket", "Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section");
		
	}

	
}

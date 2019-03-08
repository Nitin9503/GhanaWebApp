package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VisaPaymentPageTest extends ReviewApplicationPageTest {

	public VisaPaymentPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(priority=50, description="Here verifying confirmation message and click on ok btn ")
	public void verifyClickOnSubmitBtnTest() throws InterruptedException{
		visaPaymentPage.clickOnSubmitBtn();
		visaPaymentPage.verifyConfirmationPop();
		Thread.sleep(2000);
		System.out.println("home page title   "
				+ homePage.validateHomePageTitle());
		Assert.assertEquals(homePage.validateHomePageTitle(), "Home1",
				"given title not match nence it is not navigated to home page");
	}

}

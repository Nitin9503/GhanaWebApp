package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.util.TestUtil;

public class VisaPaymentPageTest extends ReviewApplicationPageTest {

	public VisaPaymentPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(priority=56, description="Here verifying confirmation message and click on ok btn ")
	public void verifyClickOnSubmitBtnTest() throws InterruptedException{
		/*visaPaymentPage.getTextsubmitBtn();	
		visaPaymentPage.clickOnSubmitBtn();
		visaPaymentPage.verifyConfirmationPop();
		Thread.sleep(2000);
		System.out.println("home page title   "
				+ homePage.validateHomePageTitle());*/
		visaPaymentPage.clickOnCheckoutBtn();
		visaPaymentPage.passCardNo();
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
		visaPaymentPage.passCvvNo();
		visaPaymentPage.clickOnMakePaymentBtn();
		visaPaymentPage.clickOnOKtbtn();
		visaPaymentPage.clickOnDonetbtn();
		Assert.assertEquals(homePage.validateHomePageTitle(), "Home",
				"given title not match nence it is not navigated to home page");
		System.out.println( "applicationID==>visa" +applicationID);
		
	}

}

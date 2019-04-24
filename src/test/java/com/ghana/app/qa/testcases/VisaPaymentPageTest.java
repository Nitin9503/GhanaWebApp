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
=======
		//visaPaymentPage.getTextsubmitBtn();	
		visaPaymentPage.clickOnCheckoutBtn();
		visaPaymentPage.passCardNo();
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
		visaPaymentPage.passCvvNo();
		visaPaymentPage.clickOnMakePaymentBtn();
		visaPaymentPage.clickOnOKtbtn();
		visaPaymentPage.clickOnDonetbtn();
		
		
>>>>>>> d838d399f3031e0448d3e76141ee80c80da2f3bc
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
		
		visaPaymentPage.clickOnSubmitbtn();
		visaPaymentPage.clickOnOKtbtn();
		visaPaymentPage.clickOnDonetbtn();
		Assert.assertEquals(homePage.validateHomePageTitle(), "Home",
				"given title not match nence it is not navigated to home page");
		System.out.println( "applicationID==>visa" +applicationID);
		
	}

}

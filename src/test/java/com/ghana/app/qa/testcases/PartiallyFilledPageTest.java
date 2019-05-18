package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
public class PartiallyFilledPageTest extends DriverInit {

	public PartiallyFilledPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=58)
	public void NegativePartiallyFilledTest() throws InterruptedException{
		partiallyfilledPage.clickOnpartialFilledTab();
		partiallyfilledPage.passApplicationId("3434242244242");
		partiallyfilledPage.selectDOB("25091990");
		String capchatext = partiallyfilledPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyfilledPage.passCaptchaText(capchatext);
		partiallyfilledPage.clickOnsubmitbtn();
		System.out.println(partiallyfilledPage.getErrorMessage().substring(2));
		Assert.assertEquals(partiallyfilledPage.getErrorMessage().substring(2), "Error! Incorrect Application ID or Date of Birth.");
		partiallyfilledPage.clickclosebtn();
	}
	@Test(priority=59)
	public void AlreadySubmittedPartiallyFilledTest() throws InterruptedException{
		partiallyfilledPage.passApplicationId("86557728A0DF");
		partiallyfilledPage.selectDOB("22102009");
		String capchatext = partiallyfilledPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyfilledPage.passCaptchaText(capchatext);
		partiallyfilledPage.clickOnsubmitbtn();
		System.out.println(partiallyfilledPage.getErrorMessage().substring(2));
		Assert.assertEquals(partiallyfilledPage.getErrorMessage().substring(2), "Error! Your application is submiited for verification, Please check status.");
		partiallyfilledPage.clickclosebtn();
	}
	@Test(priority=60)
	public void PartiallyFilledTest() throws InterruptedException{
		partiallyfilledPage.passApplicationId("17B56E9CAAE0");
	    partiallyfilledPage.selectDOB("03032000");
		String capchatext = partiallyfilledPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyfilledPage.passCaptchaText(capchatext);
		partiallyfilledPage.clickOnsubmitbtn();
		System.out.println(partiallyfilledPage.getErrorMessage().substring(2));
		//Assert.assertEquals(partiallyfilledPage.getErrorMessage().substring(2), expected);
		
	}
}

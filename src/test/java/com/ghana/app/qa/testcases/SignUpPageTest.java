package com.ghana.app.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;

public class SignUpPageTest extends DriverInit{

	public SignUpPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=6)
	public void selectPassPortType() throws InterruptedException, IOException{
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		Thread.sleep(2000);
		signUpPage.SelectPassportType();
		
	}
	
}

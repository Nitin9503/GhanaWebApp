package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;

public class ConsulatePageTest extends DriverInit {

	public ConsulatePageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=0)
	public void loginIntoCOnsulate(){
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
	
}

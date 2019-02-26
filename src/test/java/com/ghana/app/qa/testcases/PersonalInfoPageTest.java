package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;

public class PersonalInfoPageTest extends DriverInit {

	public PersonalInfoPageTest() throws IOException, InterruptedException{
		super();
		
	}
	
	@Test(priority=14)
	public void getApplicationIdTest(){
	System.out.println(personalInfoPage.getApplicationId());
	
	
	}
	
}

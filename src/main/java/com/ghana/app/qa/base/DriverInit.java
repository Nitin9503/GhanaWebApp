package com.ghana.app.qa.base;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ghana.app.qa.pages.HighAndConsulateLoginPage;
import com.ghana.app.qa.pages.HomePage;
import com.ghana.app.qa.pages.PersonalInfoPage;
import com.ghana.app.qa.pages.SignUpPage;
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
	public static HighAndConsulateLoginPage highAndConsulateLoginPage;
	

	@BeforeClass
	public void setUp() throws IOException, InterruptedException {

		initialization();
		homePage = new HomePage();
		visaCategoriesPage = new VisaCategoriesPage();
		signUpPage = new SignUpPage();
		personalInfoPage = new PersonalInfoPage();
		highAndConsulateLoginPage =new HighAndConsulateLoginPage();
		
		
	}
	
	/*@AfterClass
	public void tearDown() {

		driver.quit();
	}
	*/

	
	
	
	
	
}

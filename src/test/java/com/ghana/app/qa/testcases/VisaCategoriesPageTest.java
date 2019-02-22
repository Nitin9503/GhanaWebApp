package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.HomePage;
import com.ghana.app.qa.pages.VisaCategoriesPage;

public class VisaCategoriesPageTest extends TestBase {

	HomePage homePage;
	VisaCategoriesPage visaCategoriesPage;
	
	public VisaCategoriesPageTest() throws IOException, InterruptedException{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {

		initialization();
		homePage = new HomePage();
		visaCategoriesPage = new VisaCategoriesPage();
		homePage.verifyApplyVisa();
	}
}

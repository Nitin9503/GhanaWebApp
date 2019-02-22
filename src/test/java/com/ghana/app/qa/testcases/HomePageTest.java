package com.ghana.app.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.HomePage;
import com.ghana.app.qa.pages.VisaCategoriesPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	VisaCategoriesPage visaCategoriesPage;

	public HomePageTest() throws IOException, InterruptedException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {

		initialization();
		homePage = new HomePage();
		visaCategoriesPage = new VisaCategoriesPage();
	}

	@Test(priority = 1)
	public void validateHomePageTitle() {
		System.out.println("home page title   "
				+ homePage.validateHomePageTitle());
		Assert.assertEquals(homePage.validateHomePageTitle(), "Home",
				"given title not match");
	}

	@Test(priority = 2)
	public void verifyApplyVisaClickTest() throws IOException,
			InterruptedException {
		homePage.verifyApplyVisa();
		Thread.sleep(2000);
		System.out.println("visa category heading title "+visaCategoriesPage.visaCategorisText());
		visaCategoriesPage.visaCategorisText();
		Assert.assertEquals(visaCategoriesPage.visaCategorisText(), "VISA CATEGORIES");

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}
}

package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class CNTravelInfo extends TestBase {

	public CNTravelInfo() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='HGD76332']")
	WebElement ticketNumber;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='AirIndia']")
	WebElement travelBy;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value=' visit Familly']")
	WebElement purposeOfVisit;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Yaw Kwakye']")
	WebElement referenceName1;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Yaw Kwakye']")
	WebElement referenceName2;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='+233-24 222 3344']")
	WebElement referenceContact1;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='+233-24 222 3344']")
	WebElement referenceContact2;

	@FindBy(xpath = "//textarea[@id='exampleInputEmail2' and text()='1301 Summer Lee DR Accra.,Acrea,South Ghana,Ghana,GA188']")
	WebElement referenceAddress1;

	@FindBy(xpath = "//textarea[@id='exampleInputEmail2' and text()='1301 Summer Lee DR Accra.,Acrea,South Ghana,Ghana,GA188']")
	WebElement referenceAddress2;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='nashik,422236")
	WebElement referenceCity1;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='nashik,422236")
	WebElement referenceCity2;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Maharashtra']")
	WebElement referenceState1;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Maharashtra']")
	WebElement referenceState2;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='India']")
	WebElement referenceCountry1;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='India']")
	WebElement referenceCountry2;

	public String titleOfCNTravelInfoPage() {

		return driver.getTitle();

	}

}

package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class CNAddressInfo extends TestBase {

	public CNAddressInfo() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Indian']")
	WebElement farmerNationality;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Indian']")
	WebElement nationality;
		
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='vikas@namet.com']")
	WebElement emailID;
		
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='+91-9850290120']")
	WebElement phoneNumber;
		
	@FindBy(xpath = "//textarea[@id='exampleInputEmail2' and text()='ganesh chawl ,New Delhi']")
	WebElement address;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Mumbai,424004']")
	WebElement cityAndPinCode;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Maharastra']")
	WebElement state;

	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='India']")
	WebElement country;
	

	public String titleOfCNAddressInfoPage(){
		
		return driver.getTitle();
		
	}
}

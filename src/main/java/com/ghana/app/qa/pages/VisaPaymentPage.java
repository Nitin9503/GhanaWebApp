package com.ghana.app.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class VisaPaymentPage extends TestBase{

	public VisaPaymentPage() throws Exception{
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="btn_submit_to_consulate")
	WebElement submitBtn;

	@FindBy (xpath="//div[@id='nav-payment']//input[@value='Previous']")
	WebElement previousBtn;
}
package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class VisaCategories extends TestBase {
	
	public VisaCategories()throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="html/body/div[2]/div/div[2]/div[1]/div/div[2]/button")
	WebElement touristVisa;
	
	@FindBy(xpath="html/body/div[2]/div/div[2]/div[1]/div/div[2]/button")
	WebElement businessVisa;
	
	@FindBy(xpath="html/body/div[2]/div/div[2]/div[1]/div/div[2]/button")
	WebElement transitVisa;
	
	@FindBy(xpath="html/body/div[2]/div/div[2]/div[1]/div/div[2]/button")
	WebElement employmentVisa;
	
	@FindBy(xpath="html/body/div[2]/div/div[2]/div[1]/div/div[2]/button")
	WebElement studentVisa;
	
	
	
	

	

	
	
	
}

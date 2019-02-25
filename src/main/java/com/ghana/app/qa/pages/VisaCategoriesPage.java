package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class VisaCategoriesPage extends TestBase {
	
	public VisaCategoriesPage()throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[@class='title-a']")
	WebElement visaCategorisText;
	
	@FindBy(xpath="html/body/div[2]/div/div[2]/div[1]/div/div[2]/button")
	WebElement touristVisa;
	
	@FindBy(xpath="html/body/div[2]/div/div[2]/div[2]/div/div[2]/button")
	WebElement businessVisa;
	
	@FindBy(xpath="html/body/div[2]/div/div[2]/div[3]/div/div[2]/button")
	WebElement transitVisa;
	
	@FindBy(xpath="html/body/div[2]/div/div[2]/div[4]/div/div[2]/button")
	WebElement employmentVisa;
	
	@FindBy(xpath="html/body/div[2]/div/div[2]/div[5]/div/div[2]/button")
	WebElement studentVisa;
	
	public String validateVisaTypeTitle(){
		return driver.getTitle();
	}
	
	public String visaCategorisText(){
		return visaCategorisText.getText();
	}
	
	public void clickOnVisaType(){
		touristVisa.click();
		
	}
	
	
}

package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;
import com.ghana.app.qa.testdata.ConstantVariable.*;
public class PartiallyFilledPage extends TestBase{

	public PartiallyFilledPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//button[text()='Partially/Filled Application']")
	WebElement partiallyFilledApplication;
    
	@FindBy(xpath="//input[@id='txt_appn_id_prt']")
	WebElement partiallyAppliIdField;
	
	@FindBy(xpath="//input[@id='dateofbirth']")
	WebElement dateOfBirthField;
	
	@FindBy(xpath="//label[@id='text_captcha']")
	WebElement textCaptcha;
	
	
	@FindBy(xpath="//input[@id='txt_captcha_prt']")
	WebElement textCaptchaFiled;
	
	public void clickOnpartialFilledTab(){
		partiallyFilledApplication.click();
	}
	
	public void passApplicationId(){
		partiallyAppliIdField.sendKeys(applicationID);
	}
	
	public void selectDOB(String birthDate) throws InterruptedException {
		
        TestUtil.actionClassMethod(dateOfBirthField);
        dateOfBirthField.sendKeys(birthDate);
        
}
}

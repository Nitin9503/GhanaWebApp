package com.ghana.app.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class UploadDocPage extends TestBase {

	
	public UploadDocPage() throws Exception, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='uploadBtn1']")
	WebElement attachFileBtn1;
	@FindBy(xpath="//input[@id='uploadBtn2']")
	WebElement attachFileBtn2;
	@FindBy(xpath="//input[@id='uploadBtn3']")
	WebElement attachFileBtn3;
	@FindBy(xpath="//input[@id='uploadBtn4']")
	WebElement attachFileBtn4;
	@FindBy(xpath="//input[@id='uploadBtn5']")
	WebElement attachFileBtn5;
	@FindBy(xpath="//input[@id='uploadBtn6']")
	WebElement attachFileBtn6;
	@FindBy(xpath="//input[@id='uploadBtn7']")
	WebElement attachFileBtn7;
	@FindBy(xpath="//input[@id='uploadBtn8']")
	WebElement attachFileBtn8;
	@FindBy(id="applicant_upload_document_form_btn")
	WebElement saveAndComtinueBtn;
	
	
	public void getUploadDoc(){
		// enter the file path onto the file-selection input field
		attachFileBtn1.sendKeys("C:\\Users\\nikhil.sonawane\\Downloads\\Visa Doc\\airticket.jpeg");
		attachFileBtn2.sendKeys("C:\\Users\\nikhil.sonawane\\Downloads\\Visa Doc\\Passport-size-photo.jpg");
		attachFileBtn3.sendKeys("C:\\Users\\nikhil.sonawane\\Downloads\\Visa Doc\\YellowFeverVaccination.pdf");
		attachFileBtn4.sendKeys("C:\\Users\\nikhil.sonawane\\Downloads\\Visa Doc\\Covering Letter for tourist.pdf");
		attachFileBtn5.sendKeys("C:\\Users\\nikhil.sonawane\\Downloads\\Visa Doc\\demand-draft-1.jpg");
		attachFileBtn6.sendKeys("C:\\Users\\nikhil.sonawane\\Downloads\\Visa Doc\\IDcard_Ghana.jpg");
		attachFileBtn7.sendKeys("C:\\Users\\nikhil.sonawane\\Downloads\\Visa Doc\\invitation letter.pdf");
		attachFileBtn8.sendKeys("C:\\Users\\nikhil.sonawane\\Downloads\\Visa Doc\\proofofvisa.pdf");
	 
	}
	public void clicksaveAndContiBtn(){
		saveAndComtinueBtn.click();
	}
}

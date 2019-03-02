package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class ApplicantDashBoardPage extends TestBase {

	public ApplicantDashBoardPage() throws IOException, InterruptedException {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Applicant Information']")
	WebElement applicantInforClick;
	
	@FindBy(xpath = "//span[text()='Address Information']")
	WebElement addressInforClick;

	@FindBy(xpath = "//span[text()='Travel Information']")
	WebElement travelInforClick;
	
	@FindBy(xpath = "//span[text()='Document Verification']")
	WebElement documentVeriClick;
		
	@FindBy(xpath = "//span[text()='Schedule Interview']")
	WebElement scheduleInterviewClick;
	
	@FindBy(xpath = "//input[@id='applicantID' and @value='AP12354']")
	WebElement applicationID ;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Employment']")
	WebElement yettoconfirm ;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Transit Multiple Visa â¹6500']")
	WebElement visaFees ;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Akashay Khanna']")
	WebElement fullName ;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='AK7897GH']")
	WebElement passportNumber ;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='28/04/1992']")
	WebElement dateOfBirth ;
		
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='02/12/2017']")
	WebElement dateOfPassportIssue;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='New Delhi']")
	WebElement birthPlace;
	
	@FindBy(xpath = "//button[text()='Back']")
	WebElement backButton;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//input[@id='txt_comment']")
	WebElement passComment;
	
	@FindBy(xpath = "//button[text()='Add']")
	WebElement addComment;
	
	@FindBy(xpath = "//div[@class='commentText']")
	WebElement textFromPassComment;
		

	
	public void clickOnApplicantInfor(){
		applicantInforClick.click();
	}

	public void clickOnTravelInfor(){
		travelInforClick.click();
	}
	
	public void clickOnDocumentVeri(){
		documentVeriClick.click();
	}
	
	public void clickOnScheduleInterview(){
		scheduleInterviewClick.click();
	}
	
	public void clickOnAddressInfor(){
		addressInforClick.click();
	}
	
	public String titleOfApplicationDetailsPage(){		
		return driver.getTitle();
		
	}
	
	public void passComment(String comment){		
		passComment.sendKeys(comment);
		
	}
	public void addCooment(){		
		addComment.click();
		
	}
	public String getTextFromAddedComment(){		
		String str = textFromPassComment.getText();
		String newString  = str.replaceAll("01 Mar 2019 10:41 AM", "");
		return newString;
		

		
	}

	
	
	

}
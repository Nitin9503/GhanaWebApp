package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class ConsulatedashBoardPage extends TestBase{

	public ConsulatedashBoardPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}
	


	@FindBy(xpath = "//ul[@class='list-group list-group-flush']")
	List<WebElement> clickOnNewApplication;
	
	@FindBy(xpath = "//h6[contains(text(), 'Reverification')]")
	WebElement reverification;
		
	@FindBy(xpath = "//h6[contains(text(),'Approved Applications')]")
	WebElement approvedApplications;
	
	@FindBy(xpath = "//h6[contains(text(),'Rejected Application')]")
	WebElement rejectedApplication;
	
	@FindBy(xpath = "//h6[contains(text(),'Interview Scheduled')]")
	WebElement interviewScheduled;
	
	@FindBy(xpath = "//h6[contains(text(),'HCG Application')]")
	WebElement HCGApplication;
	
	
	public void clickOnNewApplication(){
	
		for (WebElement we :clickOnNewApplication ){
		we.click();
		break;
		}
		
	}

}
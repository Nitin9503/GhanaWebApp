package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class CNInterviewSchedule extends TestBase {

	public CNInterviewSchedule() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='myModal1' ]//h4[@class='modal-title'][ text()='Confirmation']")
	WebElement confrmationPopTitleFromInterview;

	@FindBy(xpath = "//input[@id='r1']")
	WebElement radioButtonOnline;

	@FindBy(xpath = "//input[@id='r2']")
	WebElement radioButtonOffline;

	@FindBy(xpath = "//div[@class='md-form']//button[@type='button' and text()='Cancel']")
	WebElement cancelButtonFromInterviewConfirpop;

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement confirmButtonFromInterviewConfirpop;

	@FindBy(xpath = "//div[@id='myModal1']//button[@type='button'][contains(text(),'×')]")
	WebElement closeButtonFromInterviewConfirpop;

	@FindBy(id = "date1")
	WebElement dateOne;

	@FindBy(id = "date2")
	WebElement dateTwo;

	@FindBy(id = "date13")
	WebElement dateThree;

	@FindBy(id = "time1")
	WebElement timeOne;

	@FindBy(id = "time1")
	WebElement timeTwo;

	@FindBy(id = "time1")
	WebElement timeThree;


	public String getTextFromConfrmationPopTitleFromInterview() {
		return confrmationPopTitleFromInterview.getText();

	}
	public void clickOnOnline() {
		radioButtonOnline.click();

	}
	public void clickOnOffline() {
		radioButtonOffline.click();

	}
	public void cancelButtonFromInterviewConfirpop() {
		cancelButtonFromInterviewConfirpop.click();

	}
	public void confirmButtonFromInterviewConfirpop() {
		confirmButtonFromInterviewConfirpop.click();

	}
	
	public void closeButtonFromInterviewConfirpop() {
		closeButtonFromInterviewConfirpop.click();

	}

	
	public void passDate1(String Date1) {
		dateOne.sendKeys(Date1);

	}

	public void passDate2(String Date2) {

		dateTwo.sendKeys(Date2);
	}

	public void passDate3(String Date3) {

		dateThree.sendKeys(Date3);
	}

	public void passTime1(String time1) {

		timeOne.sendKeys(time1);
	}

	public void passTime2(String time2) {

		timeTwo.sendKeys(time2);
	}
	public void passTime3(String time3) {

		timeThree.sendKeys(time3);
	}

}

package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ghana.app.qa.base.TestBase;

public class NewApplicationDetailsPage extends TestBase {

	public NewApplicationDetailsPage() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	
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
	
	@FindBy(xpath = "//input[@id='txt_comment']")
	WebElement passComment;
	
	@FindBy(xpath = "//button[text()='Add']")
	WebElement addComment;
	
	@FindBy(xpath = "//div[@class='commentText']")
	WebElement textFromPassComment;
		
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
	WebElement referenceContact;
		
		
		

		//input[@id='exampleInputEmail2' and @value='+233-24 9654 5412']
		//textarea[@id='exampleInputEmail2' and text()='1301 Summer Lee DR Accra.,Acrea,South Ghana,Ghana,GA188']
		//button[text()='Reject']
		//button[text()='Approve']
		//div[@id='rejectModel']//h4[text()='Confirmation' and @class='modal-title']
		//input[@value='Flag Passport']
		//div[@id='rejectModel']//button[text()='Cancel' and @type='button']
		//input[@value='Reject']
		//div[@id='rejectModel']//button[@class='close' and @type='button']
		//input[@value='Cancel']
		//input[@value='Confirm']
		//div[@id='acceptModel']//button[@type='button'][contains(text(),'×')]
		//h6[text()='Reverification']
		//h6[contains(text(), 'Reverification')]
		//h6[contains(text(),'Approved Applications')]
		//h6[contains(text(),'Rejected Application')]
		//h6[contains(text(),'Interview Scheduled')]
		//h6[contains(text(),'HCG Application')]


}

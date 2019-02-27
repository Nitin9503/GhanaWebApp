package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class AddressInfoPage extends TestBase{

	
	public AddressInfoPage() throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	
	//elements from address information page
	
		@FindBy(xpath="//span[text()='Former Nationality']")
		WebElement FormerNationality;
		@FindBy(xpath="//input[@id='former_nationality_search']")
		WebElement former_nationality_search;
		@FindBy(xpath="//ul[@id='ul_former_nationality']//li[text()='Andorra']")
		WebElement former_nationality_click;
		@FindBy(xpath="//input[@id='nationalityText']")
		WebElement nationalityText;
		@FindBy(xpath="//input[@id='email']")
		WebElement email;
		@FindBy(xpath="//input[@id='phone_number']")
		WebElement phone_number;
		
		//manage address
		@FindBy(xpath="//input[@id='flat_no']")
		WebElement flat_no;
		@FindBy(xpath="//input[@id='street']")
		WebElement street;
		@FindBy(xpath="//input[@id='landmark']")
		WebElement landmark;
		@FindBy(xpath="//input[@id='pincode']")
		WebElement pincode;
		@FindBy(xpath="//input[@id='city']")
		WebElement city;
		@FindBy(xpath="//input[@id='state']")
		WebElement state;
		@FindBy(xpath="//input[@id='mailing_country']")
		WebElement mailing_country;
		@FindBy(xpath="//span[text()='Address Type']")
		WebElement AddressType;
		@FindBy(xpath="//li[text()='Present Address']")
		WebElement PresentAddress;
		@FindBy(xpath="//div[@id='nav-address']//input[@value='Previous']")
		WebElement PreviousBtn;
		@FindBy(xpath="//input[@id='emergency_firstname']")
		WebElement emergency_firstname;
		@FindBy(xpath="//input[@id='emergency_lastname']")
		WebElement emergency_lastname;
		
		public
		
		
}

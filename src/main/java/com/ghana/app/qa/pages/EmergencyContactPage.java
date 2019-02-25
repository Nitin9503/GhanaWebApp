package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class EmergencyContactPage extends TestBase {

	
	public EmergencyContactPage()throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	// element id for emergency contact
	
		//span[text()='Relationship']
		//ul[@id='img_category_options']/li[text()='Mother']
		//input[@id='emergency_phone_number']
		//input[@id='emergency_profession']
		//input[@id='emergency_employer_name']
		//input[@id='emergency_pincode']
		//input[@id='emergency_city']
		//input[@id='emergency_state']
		//input[@id='emergency_country']
		//input[@id='emergency_employer_phone_number']
		//div[@id='nav-contact']//input[@value='Previous']
		//button[@id='applicant_emergency_contact_form_btn'] //save and continue
		
}

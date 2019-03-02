package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ghana.app.qa.base.TestBase;

public class ReviewApplicationPageTest extends ApplicationFormFilling {

	public ReviewApplicationPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(priority = 49)
	public void getTextFromfirstLastNameTest() throws InterruptedException, IOException {
		
		String st=reviewApplicationPage.getTextFromfirstLastName();
		System.out.println(st);
	
	}

	
	
	
	
	

}

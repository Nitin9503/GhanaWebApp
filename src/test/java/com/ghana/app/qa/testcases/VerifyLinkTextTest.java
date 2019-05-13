package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.LinkTextsPage;

public class VerifyLinkTextTest extends DriverInit{

	public VerifyLinkTextTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
public void verifyallLinkextsAtHeader() throws IOException, InterruptedException{
	String[] linktextName = {"Home", "Immigration", "Consular Services", "Professionals", "Required Documents"};
	for( int i = 0; i < linktextName.length; i++)
	{
	    String element = linktextName[i];
	    System.out.println( element );    
	    LinkTextsPage Lt= new LinkTextsPage();
	    Lt.verifyAllLinksTexts(element);
	    
	}
	
}}

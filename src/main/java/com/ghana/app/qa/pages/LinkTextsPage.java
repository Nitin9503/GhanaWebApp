package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class LinkTextsPage extends TestBase{

	public LinkTextsPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
		@FindBy (xpath="//a[contains(text(),'Home')]")
		WebElement linkstext;//a[contains(text(),'Home')]
		
		@FindBy (xpath="//h4[contains(text(),'Important Immigration Notice')]")
		WebElement imigrationtext;
		
		
		@FindBy (xpath="//a[contains(text(),'Home')]")
		WebElement linkstext;//a[contains(text(),'Home')]
		//h4[contains(text(),'Introduction to Consular Services')]
		
		@FindBy (xpath="//a[contains(text(),'Home')]")
		WebElement linkstext;
		
		@FindBy (xpath="//a[contains(text(),'Home')]")
		WebElement linkstext;//a[contains(text(),'Home')]
		//h4[contains(text(),'Professionals')]
		
		//h4[contains(text(),'Basic Requirements')]
		
		//(Home, Immigration, Consular Services, Professionals, Required Documents)
		public void verifyAllLinksTexts(String linkName) throws InterruptedException{
			driver.findElement(By.xpath("//a[contains(text(),'"+linkName+"')]")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//a[contains(text(),'Required Documents')]")).click();
		}
	}

	
	


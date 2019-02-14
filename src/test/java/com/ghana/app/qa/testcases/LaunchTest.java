package com.ghana.app.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.Launch;

public class LaunchTest extends TestBase {
	Launch launch;
	String response = "";
	public LaunchTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		launch = new Launch();
	}

	@Test
	public void pageTitleTest() throws IOException {
		String st = launch.validateLoginPageTitle();
		System.out.println(st);
		//assertEquals(st, expected);
		List<WebElement>linksList=driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of full links and images--->"+linksList.size());
		
		List<WebElement>activeLinks = new ArrayList<WebElement>();
		
		for (int i=0; i<linksList.size(); i++){
			
			//System.out.println(linksList.get(i).getAttribute("href"));
			if(linksList.get(i).getAttribute("href")!=null &&(!linksList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linksList.get(i));
				
			}
			
		}
		System.out.println("Active Total no. of links and images==> " +activeLinks.size());
		for(int j=0; j<activeLinks.size();j++){
			HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			try
			 
			 {
			 
			     connection.connect();
			 
			      response = connection.getResponseMessage();         
			 
			     connection.disconnect();
			 
			 }
			 
			 catch(Exception exp)
			 
			 {
			 
			 return exp.getMessage();
			 
			 }  
			connection.setConnectTimeout(30000);
			connection.connect();
		    String response= connection.getResponseMessage();
		    connection.disconnect();
		    System.out.println(activeLinks.get(j).getAttribute("href") +"===>"+response);
		}
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}

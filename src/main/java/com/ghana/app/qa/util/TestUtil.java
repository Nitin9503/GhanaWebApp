package com.ghana.app.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import com.ghana.app.qa.base.TestBase;
import com.google.common.base.Function;

public class TestUtil extends TestBase  {

	public TestUtil() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DesiredCapabilities caps;
	public static Properties prop;
	public static String driverPath;	
	public static String OSName = "";
	
	public static long PAGE_LOAD_TIMEOUT = 120;
	public static long IMPLICIT_WAIT = 120;
	public static String title = "";
	public static String screenshotName = "";
	public static String providedDate = " "; 
	
	// Static variable for Launch activety of browser

	public static String hubURL = "http://192.168.1.39:5568/wd/hub";	
	public static final String USERNAME = "sachin1";
	public static final String ACCESS_KEY = "0576f84d-89b5-4a1e-8eee-f19e4bb26729";
	public static final String SauceLabURL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";	


	// Static methods
	public static void scrollUpByPixel(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 'pixel')");

	}
	public static void toOpenNewTab() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");

	}
	public static void toCloseNewTab() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.close()");

	}
	public static void toSwitchBetweenWindows(int i){
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(i));

		
	}
	
	public static void scrollUpAtEndOFPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	public static void scrollUpHorizontalORVIsibilityOFElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void flashOnElement(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
	
		for (int i = 0; i < 50; i++) {
			changeColor("rgb(139,0,0)", element);
			changeColor(bgcolor ,element);
		}
	}

	public static void changeColor( String color, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor = '"+color+"'", element);
 
	}
	public void typeText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	public static void clickOnElement() throws InterruptedException{
		System.out.println( "applicationID==>" +applicationID);
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//strong[contains(text(),'" +applicationID+ "')]"));
		System.out.println( ele.getText());
		ele.click(); // what ever  the action needed .
	}
	public static String getTextFromApplicationID() throws InterruptedException{
		System.out.println( "applicationID==>" +applicationID);
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//strong[contains(text(),'" +applicationID+ "')]"));
		return ele.getText();

	}
	

	public static void selectValuefromDropDown(WebElement element, int value) {
		Select sel = new Select(element);
		sel.selectByIndex(value);
	}

	public static boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public static void runJavaScript(String command) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(command);
	}
	public static void clickOnElement(WebElement element) {	
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("arguments[0].click()", element);
	}
	public static void uploadfile(WebElement element, String path) {
		element.sendKeys(path);
	}
	public static void waitForElemenToClick(WebElement element, int maxTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public static void waitForElementToVisible(WebElement element, int maxTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	public static void waitForElementToVisibleOnly(WebElement element, int maxTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	
	public static void actionClassMethod(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		
	}
	public static void datePickerMethod(WebElement element) {
		((JavascriptExecutor)driver).executeScript ("document.getElementById(element).removeAttribute('readonly',0);"); // Enables the from date box	
		
	}

	
	public static void passDateInField(String element){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('"+element+"').removeAttribute('readonly',0);");
		
	}
	
	public static void dateAlter(String dateChange){
		String str = new StringBuffer(dateChange).insert(dateChange.length()-6, "/").toString();
		providedDate = new StringBuffer(str).insert(str.length()-4, "/").toString();
	}
	
	public static void fluentWait(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);

			WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
			{
			  public WebElement apply(WebDriver driver) {
			  return driver.findElement(By.id("foo"));
			}
			});
	}
	
}

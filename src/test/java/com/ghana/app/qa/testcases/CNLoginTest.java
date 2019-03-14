package com.ghana.app.qa.testcases;

import java.io.IOException;
import static com.ghana.app.qa.util.TestUtil.OSName;
import static com.ghana.app.qa.util.TestUtil.driverPath;
import org.testng.annotations.Test;
import static com.ghana.app.qa.testdata.ConstantVariable.*;
import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.XlsReader;

public class CNLoginTest extends DriverInit {

	public static XlsReader reader;

	public CNLoginTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void xlsReaderMethod(){
	if (OSName.equalsIgnoreCase("Mac OS X")) {
		reader = new XlsReader(driverPath + "/src/main/java/com/ghana/app/qa/testdata/TorenzoWorkBook.xlsx");
	} else if (OSName.equalsIgnoreCase("Windows 10") || OSName.equalsIgnoreCase("Windows 7")) {
		reader = new XlsReader(
				driverPath + "\\src\\main\\java\\com\\ghana\\app\\qa\\testdata\\TorenzoWorkBook.xlsx");
	}
	}
	
	@Test(priority = 0, description = "This test will verify login functinality with pass invalid creadentials and click on Login button")
	public void loginfunctionaltyTest1() {
		xlsReaderMethod();
		int rowCount = reader.getRowCount("CNLoginPage");
		for (int rowNumb = 2; rowNumb <= rowCount; rowNumb++) {

			if (rowNumb == 2) {
				username = reader.getCellData("CNLoginPage", "UserName", rowNumb);
				password = reader.getCellData("CNLoginPage", "Password", rowNumb);
				break;
			}
		}
		highAndConsulateLoginPage.passUserName(username);
		highAndConsulateLoginPage.passPassword(password);
		highAndConsulateLoginPage.clickOnLoginButton();
	}
	@Test(priority = 1, description = "This test will verify login functinality with pass invalid creadentials and click on Login button")
	public void loginfunctionaltyTest2() {
		xlsReaderMethod();
		int rowCount = reader.getRowCount("CNLoginPage");
		for (int rowNumb = 2; rowNumb <= rowCount; rowNumb++) {

			if (rowNumb == 3) {
				username = reader.getCellData("CNLoginPage", "UserName", rowNumb);
				password = reader.getCellData("CNLoginPage", "Password", rowNumb);
				break;
			} 
		}
		highAndConsulateLoginPage.passUserName(username);
		highAndConsulateLoginPage.passPassword(password);
		highAndConsulateLoginPage.clickOnLoginButton();
	}
	@Test(priority = 2, description = "This test will verify login functinality with pass invalid creadentials and click on Login button")
	public void loginfunctionaltyTest3() {
		xlsReaderMethod();
		int rowCount = reader.getRowCount("CNLoginPage");
		for (int rowNumb = 2; rowNumb <= rowCount; rowNumb++) {

			if (rowNumb == 4) {
				username = reader.getCellData("CNLoginPage", "UserName", rowNumb);
				password = reader.getCellData("CNLoginPage", "Password", rowNumb);
				break;
			} 
		}
		highAndConsulateLoginPage.passUserName(username);
		highAndConsulateLoginPage.passPassword(password);
		highAndConsulateLoginPage.clickOnLoginButton();
	}
	@Test(priority = 3, description = "This test will verify login functinality with pass invalid creadentials and click on Login button")
	public void loginfunctionaltyTest4() {
		xlsReaderMethod();
		int rowCount = reader.getRowCount("CNLoginPage");
		for (int rowNumb = 2; rowNumb <= rowCount; rowNumb++) {

			if (rowNumb == 5) {
				username = reader.getCellData("CNLoginPage", "UserName", rowNumb);
				password = reader.getCellData("CNLoginPage", "Password", rowNumb);
				break;
			} 
		}
		highAndConsulateLoginPage.passUserName(username);
		highAndConsulateLoginPage.passPassword(password);
		highAndConsulateLoginPage.clickOnLoginButton();
	}
	@Test(priority = 4, description = "This test will verify login functinality with pass invalid creadentials and click on Login button")
	public void loginfunctionaltyTest5() {
		xlsReaderMethod();
		int rowCount = reader.getRowCount("CNLoginPage");
		for (int rowNumb = 2; rowNumb <= rowCount; rowNumb++) {

			if (rowNumb == 6) {
				username = reader.getCellData("CNLoginPage", "UserName", rowNumb);
				password = reader.getCellData("CNLoginPage", "Password", rowNumb);
				break;
			} 
		}
		highAndConsulateLoginPage.passUserName(username);
		highAndConsulateLoginPage.passPassword(password);
		highAndConsulateLoginPage.clickOnLoginButton();
	}
	@Test(priority = 5, description = "This test will verify login functinality with pass invalid creadentials and click on Login button")
	public void loginfunctionaltyTest6() {
		xlsReaderMethod();
		int rowCount = reader.getRowCount("CNLoginPage");
		for (int rowNumb = 2; rowNumb <= rowCount; rowNumb++) {

			if (rowNumb == 7) {
				username = reader.getCellData("CNLoginPage", "UserName", rowNumb);
				password = reader.getCellData("CNLoginPage", "Password", rowNumb);
				break;
			} 
		}
		highAndConsulateLoginPage.passUserName(username);
		highAndConsulateLoginPage.passPassword(password);
		highAndConsulateLoginPage.clickOnLoginButton();
	}
	/*
	@Test(priority = 6)
	public void passComment() {
		applicantDashBoardPage.passComment("Verifying your Application");
		applicantDashBoardPage.addCooment();
		applicantDashBoardPage.getTextFromAddedComment();
		softAssertion.assertEquals(applicantDashBoardPage.getTextFromAddedComment(), "Verifying your Application",
				"Latest passed comment is not matched after getting text from comment section");
		softAssertion.assertAll();
		}
	*/
	
}


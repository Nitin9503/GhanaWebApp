package com.ghana.app.qa.pages;

import static com.ghana.app.qa.util.TestUtil.OSName;
import static com.ghana.app.qa.util.TestUtil.driverPath;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.testcases.VisaCategoriesPageTest;
import com.ghana.app.qa.util.XlsReader;


public class SignupXlPageTest extends VisaCategoriesPageTest{

	public static int rowCount;
	public static XlsReader reader;
	public static int rowNum;
	 
	public SignupXlPageTest() throws IOException, InterruptedException {

		super();
		// TODO Auto-generated constructor stub
	}
	public static void xlsReaderMethod() {
		if (OSName.equalsIgnoreCase("Mac OS X")) {

			reader = new XlsReader(driverPath + "/src/main/java/com/ghana/app/qa/testdata/GhanaVisaTestData1.xlsx");

		} else if (OSName.equalsIgnoreCase("Windows")) {
			reader = new XlsReader(
					     driverPath + "\\src\\main\\java\\com\\ghana\\app\\qa\\testdata\\GhanaVisaTestData1.xlsx");
		}
	}
	
	@Test(priority = 6)
	public void selectPassPortType() throws InterruptedException, IOException {
		xlsReaderMethod();
		/*homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();*/
		Thread.sleep(2000);
		/*int rowCount2=reader.getRowCount("SignUp");
		for(int i=0; i<=5; i++ ){*/
		int rowCount=reader.getRowCount("SignUp");
		for(rowNum=2; rowNum<=rowCount; rowNum++)
		 {
			   //Get Data for Signup Page
				    String passportType = reader.getCellData("SignUp", "Passport_Type", rowNum); 
				    System.out.println(passportType);
				    String nationalityName = reader.getCellData("SignUp", "Nationality_Name", rowNum);
			        System.out.println(nationalityName);
			        String PoOfArrival = reader.getCellData("SignUp", "PortOf_Arrival", rowNum);
			        System.out.println(PoOfArrival);
			        String DateBirth = reader.getCellData("SignUp", "Date_Birth", rowNum);
			        System.out.println(DateBirth);
			        String phoneNo = reader.getCellData("SignUp", "phone_No.", rowNum);
			        System.out.println(phoneNo);
			        String emailAddress = reader.getCellData("SignUp", "email_Address", rowNum);
			        System.out.println(emailAddress);
			        
			        signUpXlPage.SelectPassportType(passportType);
			        signUpXlPage.selectNationality(nationalityName);
			        signUpXlPage.selectPortOfArrival(PoOfArrival);
			        signUpXlPage.selectDateOfBirth(DateBirth);
			        signUpXlPage.passEmailIdAndPhoneNo(emailAddress, phoneNo );
			        signUpXlPage.clickOnCheckBoxes();
					signUpXlPage.verifyCheckBoxIsSelected();
					signUpXlPage.continueBtn();
					// signUpXlPage.cancelBtn();
					
					
				//Get Data for Personal Info Page
					 String visafee = reader.getCellData("PersonalInfo", "Visa_fees", rowNum); 
					    System.out.println(visafee);
					    String visaLoc = reader.getCellData("PersonalInfo", "Visa_Location", rowNum);
				        System.out.println(visaLoc);
				        String Fname = reader.getCellData("PersonalInfo", "first_name", rowNum);
				        System.out.println(Fname);
				        String Lname = reader.getCellData("PersonalInfo", "last_name", rowNum);
				        System.out.println(Lname);
				        String Gender = reader.getCellData("PersonalInfo", "gender.", rowNum);
				        System.out.println(Gender);
				        String passptnumber = reader.getCellData("PersonalInfo", "passport_number", rowNum);
				        System.out.println(passptnumber);
				        String passDateIssue = reader.getCellData("PersonalInfo", "passport_date_of_issue", rowNum);
				        System.out.println(passDateIssue);
				        String BirthPlace = reader.getCellData("PersonalInfo", "place_of_birth.", rowNum);
				        System.out.println(BirthPlace);
				        String passDateExpired = reader.getCellData("PersonalInfo", "passport_expiry_date", rowNum);
				        System.out.println(passDateExpired);
				        
				        personalInfoXlPage.SelectvisaFees(visafee);
				        personalInfoXlPage.SelectvisaLocation(visaLoc);
				        personalInfoXlPage.passFirstName(Fname);
				        personalInfoXlPage.passLastName(Lname);
				        personalInfoXlPage.passPassportNumber(passptnumber);
				        personalInfoXlPage.selectPassIssueDate(passDateIssue);
				        personalInfoXlPage.selectPassExpiryDate(passDateExpired);
				        personalInfoXlPage.passPlaceOfBirth(BirthPlace);
						//signUpXlPage.cancelBtn();
				        personalInfoXlPage.clickOnSaveAndContinue();
					
			      
			//Get Data for Address Info Page
			  String formernationality = reader.getCellData("AddressInfo", "former_nationality", rowNum); 
				    System.out.println(formernationality);
				    String addressline1 = reader.getCellData("AddressInfo", "address_line1", rowNum);
			        System.out.println(addressline1);
			        String addressline2 = reader.getCellData("AddressInfo", "address_line2", rowNum);
			        System.out.println(addressline2);
			        String landmark = reader.getCellData("AddressInfo", "landmark", rowNum);
			        System.out.println(landmark);
			        String zipcode = reader.getCellData("AddressInfo", "zip_code.", rowNum);
			        System.out.println(zipcode);
			        String city = reader.getCellData("AddressInfo", "city", rowNum);
			        System.out.println(city);
			        String state = reader.getCellData("AddressInfo", "state", rowNum);
			        System.out.println(state);
			        String country = reader.getCellData("AddressInfo", "country", rowNum);
			        System.out.println(country);
			        String addresstype = reader.getCellData("AddressInfo", "address_type", rowNum);
			        System.out.println(addresstype);
			        
			       addressInfoXlPage.selectFormerNaitonality(formernationality);
			       addressInfoXlPage.PassAddressInfofield(addressline1, addressline2, landmark, zipcode, city, state, country, addresstype);
			       
					//signUpXlPage.cancelBtn();
			       addressInfoXlPage.clickSaveAndContinuebtn();
			        
			       
			       //Get Data for Emergency Contact Page
			       
			       
			       
			       
			       
			       
			       
			       
		
			 }
		
		 }
		@Test(priority=7, description="here vrifying select and unselct checkboxes wheather it is select and unselect or not ")
	 public void verifycheckboxes() throws InterruptedException{
			signUpXlPage.clickOnCheckBoxes();
			signUpXlPage.verifyCheckBoxIsSelected();
		 
	 }
	}



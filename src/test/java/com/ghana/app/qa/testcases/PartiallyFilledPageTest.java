package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import static com.ghana.app.qa.testdata.ConstantVariable.*;
public class PartiallyFilledPageTest extends VisaPaymentPageTest {

	public PartiallyFilledPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=58)
	public void partiallyFilledTest() throws InterruptedException{
		partiallyfilledPage.clickOnpartialFilledTab();
		partiallyfilledPage.passApplicationId();
		partiallyfilledPage.selectDOB(birthDate);
		String capchatext = partiallyfilledPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyfilledPage.passCaptchaText(capchatext);
		partiallyfilledPage.clickOnsubmitbtn();
	}
}

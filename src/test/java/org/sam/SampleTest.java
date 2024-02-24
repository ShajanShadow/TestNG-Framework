package org.sam;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass {
	@Test(enabled = false)
	public void tc4() {
		launchUrl("https://www.inmakeslh.in/");

	}
	@Test(invocationCount = 3)
	public void tc2() {
		launchUrl("https://www.redbus.in/");

	}
	@Test
	public void tc9() {
		launchUrl("https://mail.google.com/");

	}
	@BeforeMethod
	public void startDate() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterMethod
	public void endDate() {
		Date d=new Date();
		System.out.println(d);

	}
	@BeforeClass
	public void launchTheBrowser() {
		launchBrowser();
		windowMaximize();

	}
	@AfterClass
	public void closeTheBrowser() {
		closeEntireBrowser();

	}

}

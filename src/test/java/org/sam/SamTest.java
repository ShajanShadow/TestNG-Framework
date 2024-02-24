package org.sam;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SamTest extends BaseClass {
	
	private void tc1() {
		System.out.println("TC :1"+Thread.currentThread().getId());
		launchUrl("https://en-gb.facebook.com/");
		
	}
	
//	@Test(enabled = false)
//	public void tc4() {
//		launchUrl("https://www.inmakeslh.in/");
//
//	}

	@Test()
	public void tc2() {
		System.out.println("TC :2"+Thread.currentThread().getId());
		launchUrl("https://www.redbus.in/");

	}

	@Test
	public void tc3() {
		System.out.println("TC :9"+Thread.currentThread().getId());
		launchUrl("https://mail.google.com/");

	}

	@BeforeMethod
	public void startDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	public void endDate() {
		Date d = new Date();
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

	



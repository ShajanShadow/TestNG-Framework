package org.sam;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider extends BaseClass {
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

	@org.testng.annotations.DataProvider(name = "Sample Data")
	private Object[][] data() {
		return new Object[][] { { "abc@gmail.com", "21345" }, { "selenium@123.com", "6572456" },
				{ "hope@gmail.com", "78698" }, { "sha@gmail.com", "938478" }

		};

	}

	@Test(dataProvider = "Sample Data")
	public void tc10(String e, String pass) {
		driver.get("https://en-gb.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(e);
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys(pass);

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

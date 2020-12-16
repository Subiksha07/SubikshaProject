
package org.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample extends BaseNew {

	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
		launchbrowser();
	}

	@BeforeMethod
	private void before() {
		System.out.println("Before Method");

	}

	@Test
	private void test() {

		System.out.println("test");
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert s = new SoftAssert();
		s.assertTrue(title.contains("facebook"), "Verify Url");
		WebElement usename = driver.findElement(By.id("email"));
		send(usename, "subi");
		String uname = usename.getAttribute("value");
		s.assertEquals(uname, "subi", "Verify username");
		WebElement pass = driver.findElement(By.id("pass"));
		send(pass, "dfghjkl");
		String password = pass.getAttribute("value");
		s.assertEquals(password, "dfghjkl", "Verify password");
		WebElement login = driver.findElement(By.name("login"));
		btnClick(login);
	}

	@AfterMethod
	private void after() {
		System.out.println("After Method");
	}

	@AfterClass
	private void afterClass() {

		System.out.println("After Class");
	}

}

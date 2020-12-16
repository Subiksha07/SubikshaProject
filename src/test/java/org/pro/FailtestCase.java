package org.pro;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class FailtestCase extends BaseNew {
	
	@BeforeClass
private void beforeClass() {

		launchbrowser();

}
	
	@BeforeMethod
	
	private void beforeMethod() {
		
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	
	private void test1() {
		
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

	@AfterClass
	private void close() {
		// TODO Auto-generated method stub

	}
}

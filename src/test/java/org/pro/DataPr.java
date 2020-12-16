package org.pro;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class DataPr extends BaseNew {
	
	@BeforeClass
	private void beforeClass() {
		launchbrowser();
		launchUrl("http://adactinhotelapp.com/");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test(dataProvider="login", dataProviderClass= DataProv.class)
	private void test(String s1,String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9) throws InterruptedException {
		WebElement user = driver.findElement(By.id("username"));
		send(user, s1);
		WebElement pass = driver.findElement(By.id("password"));
		send(pass, s2);
		WebElement login = driver.findElement(By.id("login"));
		btnClick(login);
		WebElement location = driver.findElement(By.id("location"));
		selectIndex(location, 2);
		WebElement hotel = driver.findElement(By.id("hotels"));
		selectIndex(hotel, 1);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		selectIndex(roomtype, 2);
		WebElement roomno = driver.findElement(By.id("room_nos"));
		selectIndex(roomno, 1);
		WebElement pickdate = driver.findElement(By.id("datepick_in"));
		send(pickdate, s3);
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		send(outdate, s4);
		WebElement adult = driver.findElement(By.id("adult_room"));
		selectIndex(adult, 2);
		WebElement child = driver.findElement(By.id("child_room"));
		selectIndex(child, 1);
		WebElement submit = driver.findElement(By.id("Submit"));
		btnClick(submit);
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		btnClick(radio);
		WebElement continues = driver.findElement(By.id("continue"));
		btnClick(continues);
		WebElement fname = driver.findElement(By.id("first_name"));
		send(fname, s5);
		WebElement lname = driver.findElement(By.id("last_name"));
		send(lname, s6);
		WebElement address = driver.findElement(By.id("address"));
		send(address, s7);
		WebElement cnum = driver.findElement(By.id("cc_num"));
		send(cnum, s8);
		WebElement ctype = driver.findElement(By.id("cc_type"));
		selectIndex(ctype, 2);
		WebElement exmonth = driver.findElement(By.id("cc_exp_month"));
		selectIndex(exmonth, 2);
		WebElement exyear = driver.findElement(By.id("cc_exp_year"));
		selectIndex(exyear, 12);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		send(cvv, s9);
		WebElement booknow = driver.findElement(By.id("book_now"));
		btnClick(booknow);
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.id("order_no"));
		String attribute = order.getAttribute("value");
		System.out.println(attribute);
	}
	
	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterClass
	private void afterClass() {
		closeBrowser();
	}
}

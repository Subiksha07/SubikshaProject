package org.pro;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class ParaMeters extends BaseNew {
	
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
	
	@Parameters({"username", "password"})
	@Test
	private void test1(String s1, String s2) {
		System.out.println("test 1");
		WebElement username = driver.findElement(By.id("username"));
		send(username, s1);
		WebElement password = driver.findElement(By.id("password"));
		send(password, s2);
	}
	
	@Parameters({"datepick_in","datepick_out"})
	@Test
	private void test2(String s1, String s2) {
		System.out.println("test2");
		WebElement location = driver.findElement(By.id("location"));
		selectIndex(location, 2);
		WebElement hotel = driver.findElement(By.id("hotels"));
		selectIndex(hotel, 1);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		selectIndex(roomtype, 2);
		WebElement roomno = driver.findElement(By.id("room_nos"));
		selectIndex(roomno, 1);
		WebElement pickdate = driver.findElement(By.id("datepick_in"));
		send(pickdate, s1);
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		send(outdate, s2);
		WebElement adult = driver.findElement(By.id("adult_room"));
		selectIndex(adult, 2);
		WebElement child = driver.findElement(By.id("child_room"));
		selectIndex(child, 1);
		WebElement submit = driver.findElement(By.id("Submit"));
		btnClick(submit);
	}
	
	@Test
	private void test3() {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		btnClick(radio);
		WebElement continues = driver.findElement(By.id("continue"));
		btnClick(continues);
	}
	@Parameters({"first_name", "last_name", "address", "cnum", "cvv"})
	@Test
	private void test4(String s1, String s2, String s3, String s4) {
		WebElement fname = driver.findElement(By.id("first_name"));
		send(fname, s1);
		WebElement lname = driver.findElement(By.id("last_name"));
		send(lname, s2);
		WebElement address = driver.findElement(By.id("address"));
		send(address, s3);
		WebElement cnum = driver.findElement(By.id("cc_num"));
		send(cnum, s3);
		WebElement ctype = driver.findElement(By.id("cc_type"));
		selectIndex(ctype, 2);
		WebElement exmonth = driver.findElement(By.id("cc_exp_month"));
		selectIndex(exmonth, 2);
		WebElement exyear = driver.findElement(By.id("cc_exp_year"));
		selectIndex(exyear, 12);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		send(cvv, s4);
	}
	
	@Test
	private void test5() throws InterruptedException {
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.id("order_no"));
		btnClick(order);
	}
	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@DataProvider(name="adact")
	public  Object[][] main() {
		Object obj[][]= new Object[][]{
			{"renurenu","renurenu","15/12/20","17/12/20","subi","ravi","dfgjhbswdefg","1234567890123456","123"}
			
			};
		return obj;
	}

	
	
	{}
	@AfterClass
	private void afterClass() {
	closeBrowser();
	}

}

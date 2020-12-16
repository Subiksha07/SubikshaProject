package org.pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewClass {
	
	@Parameters({"browserName"})
	@BeforeClass
	private void beforeClass(String browserName) {
		System.out.println("Before Class");
		if(browserName.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\TestNGProject\\jar\\chromedriver.exe");
//			WebDriver driver=new ChromeDriver();
			System.out.println("chrome");
		}
		else  if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\TestNGProject\\jar\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			System.out.println("ff");
			
		}
		else {
			System.out.println("completed");
		}
}
	
	@Test
	private void test() {
		// TODO Auto-generated method stub

	}
	

}

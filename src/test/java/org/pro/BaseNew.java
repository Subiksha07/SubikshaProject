package org.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseNew {
	
	public static WebDriver driver;
	//public static Actions a = new Actions(driver);

	public static Select s ;
	
	public static WebDriver launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\TestNGProject\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void fill(WebElement ref, String value) {
		ref.sendKeys(value);
	}
	
	public static void btnClick(WebElement ref) {
		ref.click();
	}
	
	public static String readFromExcel(int row, int cell) throws IOException {
		File f= new File("C:\\Users\\admin\\eclipse-workspace\\MavenNewProject1\\excel\\subi.xlsx");
		FileInputStream find = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(find);
		Sheet sh = book.getSheet("Details");
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		String value= "";
		if(type==1) {
			 value = c.getStringCellValue();
		}else {
			if(DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat form = new SimpleDateFormat("dd/mmm/yyyy");
				 value = form.format(d);
			}else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				 value = String.valueOf(l);
			}
		}return value;
	}
		
	public static void writeFromExcel(int row,int cell,String value) throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\MavenNewProject1\\excel\\subi1.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sh = book.createSheet("Details");
		Row r = sh.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);
		FileOutputStream find = new FileOutputStream(f);
		book.write(find);
		
	}
	
	public static void updateExcel(int row, int cell, String value) throws IOException {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\MavenNewProject1\\excel\\subi.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Details");
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		c.setCellValue(value);
		FileOutputStream fout = new FileOutputStream(f);
		book.write(fout);
		System.out.println("completed");
	}
	/*public static void rightClick(WebElement e) {
		 new Select(e);
		a.contextClick(e).perform();
	}
	
	public static void clickDouble(WebElement e) {
		 new Select(e);
		a.doubleClick(e).perform();
		
		}*/
	
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void selectMultiple(WebElement ref) {
		Select s = new Select(ref);
		boolean b = s.isMultiple();
		System.out.println(b);
	}
	
	public static void selectText(WebElement ref, String Value) {
		Select s = new Select(ref);
		s.selectByVisibleText(Value);
	}
	
	public static void selectValue(WebElement ref, String Value) {
		Select s = new Select(ref);
		s.selectByValue(Value);

	}
	
	public static void selectIndex(WebElement ref, int value) {
		Select s = new Select(ref);
		s.selectByIndex(value);
	}
	
	public static void send(WebElement ref, String value) {
		ref.sendKeys(value);
	}


}

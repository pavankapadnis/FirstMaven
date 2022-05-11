package com.FirtsMavenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetReading {
	
	//Integrate Maven Into Eclipse Before Adding Any Dependency In POM.xml File
	//Using Following Command First
	
	//mvn eclipse:eclipse
	
	//Eclipse version = 2020-09(4.17.0)

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/crud-using-php-ajax/index.php");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("F:\\\\ExampleExcel.xls");
		HSSFWorkbook  work = new HSSFWorkbook(file)	;
		HSSFSheet sheet = work.getSheet("Sheet1");
		int rownum = sheet.getLastRowNum();
		System.out.println(rownum);
	
	}

}

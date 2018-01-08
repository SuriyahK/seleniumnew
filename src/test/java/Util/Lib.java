package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;

public class Lib {
	
	public static void sleep(WebDriver driver, int sec) throws InterruptedException {

		Thread.sleep(sec * 1000);


	}
public static String printtl(WebDriver driver ) {
	String a=driver.getTitle();
	
	return a;
	
	
	
}


//Excel practice

public static String readexcdel (WebDriver driver, int rownum, int column ) throws FileNotFoundException {
	//FileInputStream fit = new  FileInputStream("C:\\Users\\anika\\eclipse-workspace\\HwEbay\\dataebay.xlsx");
	//Workbook  wb = new (fit);
	
	
	
	
	return null;
	
}


}
	



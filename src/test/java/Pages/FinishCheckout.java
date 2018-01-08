package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishCheckout {
	public void printtile(WebDriver driver ) {
	
	//webElement gt=driver.findElement(By.xpath("))
		System.out.println("here is title of the page ::::"+ driver.getTitle());
	}
	
	public static void finalchekout (WebDriver driver) {
		
		driver.findElement(By.xpath(".//*[@id='gtChk']")).click();
		
		
		
	}
//		public void printtile(WebDriver driver ) {
//			
//			//webElement gt=driver.findElement(By.xpath("))
//			System.out.println("here is title of the page ::::"+ driver.getTitle());
//		
		
	}
	


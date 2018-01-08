package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Lib;

public class Watchselected extends Lib {
public static void series3 (WebDriver driver) throws InterruptedException {
	
	driver.findElement(By.xpath(".//*[@id='isCartBtn_btn']")).click();
	sleep(driver, 2);

	
	driver.findElement(By.xpath(".//*[@id='ADDON_0']/div/div[2]/div/div[4]/div/button[1]")).click();
	
	sleep(driver, 2);

	
	driver.findElement(By.xpath("//.//*[@id='gh-cart-i']")).click();
	//.//*[@id='gh-cart-i']
	
	
	
	
}

public void printtile(WebDriver driver ) {
	System.out.println("here is title of the page ::::"+ driver.getTitle());
	// TODO Auto-generated method stub
	
}
}

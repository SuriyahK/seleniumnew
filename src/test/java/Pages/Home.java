package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	public static void printtitle1(WebDriver driver) {
		System.out.println("here is my first page title :::"+driver.getTitle());

	
}
	
	
	public static void Searchpage(WebDriver driver ) {
		
		driver.findElement(By.xpath(".//*[@id='gh-ac']")).sendKeys("apple watch series");
		//driver.findElement(By.id("ui-id-163"));
		//ui-id-163
		driver.findElement(By.xpath(".//*[@id='gh-btn']")).click();}
		
		public void printtile(WebDriver driver ) {
			System.out.println("here is title of the page ::::"+ driver.getTitle());
		
		
		
	}

}

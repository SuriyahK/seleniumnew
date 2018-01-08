package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
	
	
	public static void cartpick (WebDriver driver) {

		
		driver.findElement(By.xpath(".//*[@id='rightSection']/div/div/div[1]/h2")).click();
		
		
		
}
	public static void mycart(WebDriver driver) {
		
		WebElement acc=driver.findElement(By.xpath(".//*[@id='rightSection']/div/div/div[1]/span"));
		System.out.println("this is  the number of item  ::::::::" + acc.getText() );
		
		
		
		//.//*[@id='syncTotal']/span[2]
		
}
	
	public static void mycartx(WebDriver driver) {
		
		WebElement accx=driver.findElement(By.xpath(".//*[@id='syncTotal']/span[2]"));
		System.out.println("this is  the Total  ::::::::" + accx.getText() );
		
		driver.findElement(By.xpath(".//*[@id='ptcBtnRight']")).click();
		
		//.//*[@id='ptcBtnRight']
		
		
}
	


}
package Test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.Cart;
import Pages.FinishCheckout;
import Pages.Home;
import Pages.Selectnew;
import Pages.Watchselected;
import Util.Lib;


public class Test extends Lib {
	
	static WebDriver driver;

	@Before
	public void before() throws InterruptedException {
		System.out.println("this is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anika\\eclipse-workspace\\HwAutomate\\chromedriver.exe");

		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(5000);}
	
	
		
		
		
	
	
	@After
	public void after() {
		driver.manage().deleteAllCookies();
		
	}

	@org.junit.Test
	public void Testing () throws InterruptedException {
		System.out.println("testing page");
		
		
		Home hm = new Home();
		
		hm.Searchpage(driver);
		Home hm1 = new Home();
		hm1.printtile(driver);
		sleep(driver, 3);

		Selectnew sel = new Selectnew ();
		sel.selectwatch(driver);
		sleep(driver, 3);

		
		Watchselected ws = new Watchselected();
		ws.series3(driver);
		
		sleep(driver, 3);

		Watchselected wt = new Watchselected();
		wt.printtile(driver);
		
		
		sleep(driver, 2);

		Cart ct = new Cart();
		
		ct.mycart(driver);
		
		Cart ctx = new Cart();
		
		ctx.mycartx(driver);
		sleep(driver, 2);

		FinishCheckout fc = new FinishCheckout();
		fc.finalchekout(driver);
		
		FinishCheckout print = new FinishCheckout();
		print.printtile(driver);
		

}







	


}



////eBay.com
//
//Search box search:”apple watch series”
//From result select “apple watch series 3”
//Then move to new page, from that page select any item
//Then third page will open, get a title of that page and title of that item. Then click on add to cart. Then click on your cart at right top. 
//Then at that page print text: total item plus price. Then click on check out. 
//
//Click on continues as guest. 
//
//At check out page do needful action and end test cases. 
//Each page remember to print title. 

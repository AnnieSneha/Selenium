package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Parallel {
   /*
    * Thread count means no of browser
    * In excel we have to add parallel mode and ThreadCount
    * It is used for cross browser testing
    * Parallel method=methods,and Thread=2
    * Run it in xml
    */
	WebDriver driver;
	WebDriver driver1;
	@Test
	public void chrometest() {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bstackdemo.com/");
		
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void firefoxtest() {
		
	driver1=new FirefoxDriver();
		
        driver1.manage().window().maximize();
		
		driver1.get("https://www.bstackdemo.com/");
		
		System.out.println(driver1.getTitle());
		
	
	}
   @AfterClass
	
	public void teardown() {
		driver.quit();
		driver1.quit();
	}
}

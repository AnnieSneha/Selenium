package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Depend {  //this works on beforetest

	
WebDriver driver;
	
	@BeforeTest
	
	public void setup() {  
		
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	                                       //it reduces code duplication
	driver.get("https://www.ebay.com/");
	
	}
	
@Test(priority = 0)
	
	public void SearchChoco() {
	   driver.findElement(By.cssSelector("[type='text']")).clear();
      
	   driver.findElement(By.cssSelector("[type='text']")).sendKeys("Chocolate");
		
	   driver.findElement(By.cssSelector("#gh-btn")).click();
	}

@Test(dependsOnMethods = "SearchGaming",priority = 2)
public void SearchTest() {
	
	
	//check
	driver.findElement(By.xpath("//span[@class=\"checkbox cbx x-refine__multi-select-checkbox undefined\"][1]")).click();
	//uncheck
	driver.findElement(By.xpath("//span[@class=\"checkbox cbx x-refine__multi-select-checkbox undefined\"][1]")).click();
	//Click on radio button
	driver.findElement(By.cssSelector("[data-value=\"All Listings\"]")).click();
	//Click on radio button
	
	driver.findElement(By.cssSelector("[data-value=\"US Only\"]")).click();
	
	
}
@Test(priority = 50)//-1000 and -2....-1000 is the least number

public void SearchGaming() {
	
	driver.findElement(By.cssSelector("[type='text']")).clear();
    
	driver.findElement(By.cssSelector("[type='text']")).sendKeys("Laptop");
	
	driver.findElement(By.cssSelector("#gh-btn")).click();
}
@AfterTest

public void teardown(){
	
	driver.close();
}
    
}

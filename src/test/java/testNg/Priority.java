package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	WebDriver driver;
	
	@BeforeTest
	
	public void setup() {  
		
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	                                       //it reduces code duplication
	driver.get("https://www.ebay.com/");
	
	
	}
	@Test (priority = 3) //(enabled=false) means skip
	
	 public void Searchiphone() {
		driver.findElement(By.cssSelector("[type='text']")).clear();
		
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("Iphone");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
	@Test(priority = 2)
	
	public void SearchChoco() {
	   driver.findElement(By.cssSelector("[type='text']")).clear();
      
	   driver.findElement(By.cssSelector("[type='text']")).sendKeys("Chocolate");
		
	   driver.findElement(By.cssSelector("#gh-btn")).click();
	}
    
	
	@Test(priority = 0)
	
	public void SearchMouse() {
		driver.findElement(By.cssSelector("[type='text']")).clear();
		
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("Mouse Pad");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
	@Test(priority = 1)//-1000 and -2....-1000 is the least number
	
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

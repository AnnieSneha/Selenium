package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Class and test is similar only when we have multiple classes
//test--group of classes


public class TestingClass {

	WebDriver driver;//we have to make webdriver globally
	@BeforeClass 
	public void setup() {  
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	                                       //it reduces code duplication
	driver.get("https://www.ebay.com/");
	
	
	}
	@Test //(enabled=false) means skip
	
	 public void Searchiphone() {
		driver.findElement(By.cssSelector("[type='text']")).clear();
		
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("Iphone");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
	@Test
	
	public void SearchChoco() {
	   driver.findElement(By.cssSelector("[type='text']")).clear();
      
	   driver.findElement(By.cssSelector("[type='text']")).sendKeys("Chocolate");
		
	   driver.findElement(By.cssSelector("#gh-btn")).click();
	}
    
	
	@Test
	
	public void SearchMouse() {
		driver.findElement(By.cssSelector("[type='text']")).clear();
		
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("Mouse Pad");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
	@Test
	
	public void SearchGaming() {
		driver.findElement(By.cssSelector("[type='text']")).clear();
        
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Laptop");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
	
	@AfterClass
	public void teardown(){
		
		driver.close();
	}
	
}

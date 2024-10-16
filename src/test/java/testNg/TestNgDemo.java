package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {
	  //In before test cases all test cases will be running in the same browser
		
		WebDriver driver;//we have to make webdriver globally
		@BeforeTest //test will be executed and classes
		
		//All the @test will be executed in one instance of the browser
		
		//Before method is SearchTest,
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
		
		
		@AfterTest
		public void teardown(){
			
			driver.close();
		}
		
		
		}
		

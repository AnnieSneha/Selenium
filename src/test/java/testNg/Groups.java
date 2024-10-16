package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups {  //click on Groups and click on testNg and convert to testNg..then xml file
	
	/*
	 * execution is done in xml file
	 * run as testNg suite
	  
	 */

	//execute only few group of test cases
	//we should group our test cases
	//Assigning the group and give name
  WebDriver driver;
	
	@BeforeTest()
	
	public void setup() {  
		
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	                                       
	driver.get("https://www.ebay.com/");
	
	}
	
   @Test(priority = 0,groups = "Smoke")
	
	public void SearchChoco() {
	   driver.findElement(By.cssSelector("[type='text']")).clear();
      
	   driver.findElement(By.cssSelector("[type='text']")).sendKeys("Chocolate");
		
	   driver.findElement(By.cssSelector("#gh-btn")).click();
	}

   
  @Test(priority = 50,groups = "Smoke")

  public void SearchGaming() {
	
	driver.findElement(By.cssSelector("[type='text']")).clear();
    
	driver.findElement(By.cssSelector("[type='text']")).sendKeys("Laptop");
	
	driver.findElement(By.cssSelector("#gh-btn")).click();
	
	//check
		driver.findElement(By.xpath("//span[@class=\"checkbox cbx x-refine__multi-select-checkbox undefined\"][1]")).click();
		//uncheck
		driver.findElement(By.xpath("//span[@class=\"checkbox cbx x-refine__multi-select-checkbox undefined\"][1]")).click();
		
		
   }
  @Test(groups = "Sanity")
  public void SearchMilk() {
	   driver.findElement(By.cssSelector("[type='text']")).clear();
     
	   driver.findElement(By.cssSelector("[type='text']")).sendKeys("Milk");
		
	   driver.findElement(By.cssSelector("#gh-btn")).click();
	}
  
  @Test(groups = "Regression")
  
  public void Bag() {
	   driver.findElement(By.cssSelector("[type='text']")).clear();
     
	   driver.findElement(By.cssSelector("[type='text']")).sendKeys("Bag");
		
	   driver.findElement(By.cssSelector("#gh-btn")).click();
	}
  
  @AfterTest(alwaysRun=true)

  public void teardown(){
	
	driver.close();
}

}

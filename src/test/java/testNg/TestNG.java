package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {  //it is a framework
    //here no main method
	
	WebDriver driver;//we have to make webdriver globally
	@BeforeMethod  //Before series to write pre conditions,that is the code before actual testing
	//after everyone annotation we have to write a method
	
	
	//before method executes before each @test
	//after method -will executes after each @test
	
	//Before method is SearchTest,
	public void setup() {  
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	                                       //it reduces code duplication
	driver.get("https://www.ebay.com/");
	//Search text box,,always css for better performance
	
	}
	@Test
	//SearchTest and Searchiphone is Test method
	public void SearchTest() {
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("mouse pad");
		
		driver.findElement(By.cssSelector("#gh-btn")).click(); 
		//check
		driver.findElement(By.xpath("//span[@class=\"checkbox cbx x-refine__multi-select-checkbox undefined\"][1]")).click();
		//uncheck
		driver.findElement(By.xpath("//span[@class=\"checkbox cbx x-refine__multi-select-checkbox undefined\"][1]")).click();
		//Click on radio button
		driver.findElement(By.cssSelector("[data-value=\"All Listings\"]")).click();
		//Click on radio button
		
		driver.findElement(By.cssSelector("[data-value=\"US Only\"]")).click();
		
		
	}
	
	@Test
	 public void Searchiphone() {
		
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("Iphone");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
	@Test
	public void SearchChoco() {
		
       driver.findElement(By.cssSelector("[type='text']")).sendKeys("Chocolate");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
    
	
	@Test
	
	public void SearchMouse() {
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("Mouse Pad");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
	@Test
	
	public void SearchGaming() {
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("Laptop");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
	
	@AfterMethod 
	public void teardown(){
		driver.close();
	}
	
	
	}
	
/*order of execution
 * BM
 * T!
 * AM
    BM
    t2
    AM*/
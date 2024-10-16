package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertInclass {
	
	WebDriver driver;
	
	
	@BeforeMethod
	
	
	public void setup() {
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	     driver.get("https://automationteststore.com/");
	
	}
	
	@Test
	
	public void contactus() {
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("Annie");
		
		driver.findElement(By.name("email")).sendKeys("annie14@gmail.com");
		
		driver.findElement(By.name("enquiry")).sendKeys("Hello");
		
		driver.findElement(By.cssSelector("[title='Submit']")).click();
		
		
		
		
	}
	
	@AfterMethod() 
	
	public void teardown() {
	     driver.close();
	}
	


}



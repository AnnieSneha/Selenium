package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo2 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test(priority = -1000)
	public void radio() {
		driver.findElement(By.cssSelector("[value='radio1']")).click();
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[value='radio2']"))).click();
		
	}
	
	@Test(priority = 1)
	public void check() {
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		wait=new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkBoxOption2"))).click();
		
		
		
	}
	
    @AfterClass
    public void teardown() {
    	driver.close();
    }
}

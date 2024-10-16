package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException { //throws is for wait command,it can be done automatically while writing the Thread.sleep
		
         WebDriver driver=new ChromeDriver();
         
         //Maximise the browser 
         driver.manage().window().maximize();
         
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         
         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
         
         
         wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ui-autocomplete-input"))).sendKeys("Hi this is annie");
         
         //locator for class
         
         //findElement//one of the method of 13 and used for locators
         
      //   driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Hi this is annie");
	     //By. is for locators                                    sendkeys={type in cypress}
	
	     //By:Class,classname is a static method because
         //findelement -method
        // Thread.sleep(2000);
         
	     //ID locator
         driver.findElement(By.id("autocomplete")).clear(); //clears the previous one ^^ classname
        
         //driver.findElement(By.id("autocomplete")).sendKeys("Hi this is Annie");
         
         
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("autocomplete"))).sendKeys("Hi this is Annie");
         
         //CSS SELECTORS
         //Radio button
         
         wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value='radio1']"))).click();
        //driver.findElement(By.cssSelector("input[value='radio1']")).click();
         driver.findElement(By.cssSelector("input[value='radio2']")).click();
         
         driver.findElement(By.cssSelector("input[value='radio3']")).click();
         
         
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value='option2']"))).click();
  
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value='option1']"))).click();
        
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value='option3']"))).click();
        
        driver.quit();
         
	}

}

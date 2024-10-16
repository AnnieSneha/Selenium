package assignment_day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayLink_Search {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Implicit wait
		
		driver.findElement(By.cssSelector("[placeholder='Search for anything']")).sendKeys("Shoes");//Enter Shoes on search text box area
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
        js.executeScript("window.scrollBy(0,7500)");
        
        WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	    
	    js.executeScript("arguments[0].scrollIntoView()", search);
	    
	    driver.findElement(By.cssSelector("[placeholder='Search for anything']")).clear();
	    
	    driver.close();
    

	}

}

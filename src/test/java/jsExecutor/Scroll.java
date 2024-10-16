package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
          
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//invoke js executor
		//I want to call js executor
		//driver will have the object of the chrome driver
		
		//jse is an interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		//Execute js script commands using JSE,using executescript
		js.executeScript("document.getElementById('autocomplete').value='hello,Annie'");
		 //console
		
	    js.executeScript("document.getElementById('checkBoxOption1').click();");
	    
	    js.executeScript("document.getElementById('checkBoxOption3').click();");
	    
	    js.executeScript("document.getElementById('checkBoxOption1').click();");
	    
	    
	    //Scroll action using JSE
	    
	    js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0,-800)");
	    
	    
	    //Scroll into view of  a particular element.
	    
	    
	    WebElement hover = driver.findElement(By.id("mousehover"));
	    
	    js.executeScript("arguments[0].scrollIntoView()", hover);//syntax
	   
	    Thread.sleep(2000);
        
	    driver.quit();
	}

}

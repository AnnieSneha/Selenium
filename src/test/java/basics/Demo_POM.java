package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_POM {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.findElement(By.xpath("//*[.='Shopping Categories']")).click();
		
       Actions act=new Actions(driver);
		
		//Step 2:locator for webelement where I want to mouse over
		Thread.sleep(2000);
		WebElement watches_link = driver.findElement(By.linkText("Apparel & Accessories"));
		
		
		//Build and perform are mandatory methods in actions class implementation
		
     	act.moveToElement(watches_link).build().perform();
     	
     	Thread.sleep(2000);
		
		driver.findElement(By.linkText("Dress Material Combos")).click();
		
		
		
		

	}

}

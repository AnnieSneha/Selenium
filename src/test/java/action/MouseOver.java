package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstop.com/");
		
	    //Step 1 : Create object of Action class
				
		Actions act=new Actions(driver);
		
		//Step 2:locator for webelement where I want to mouse over
		Thread.sleep(2000);
		WebElement watches_link = driver.findElement(By.linkText("KIDS"));
		
		Thread.sleep(2000);
		//Build and perform are mandatory methods in actions class implementation
		
     	act.moveToElement(watches_link).build().perform();

	}

}

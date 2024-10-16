package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Step 1:Create object of Actions Class
		Actions act=new Actions(driver);	
		//Step 2:Locator for webelement
        WebElement doubleclick = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	    //Step 3:Using doubleCLick
	    act.doubleClick(doubleclick).build().perform();

	}

}

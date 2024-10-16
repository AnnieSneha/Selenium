package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Step 1:Create object of Actions Class
		Actions act=new Actions(driver);	
		
		//write locator for rightclick web element
	    WebElement rightclick = driver.findElement(By.xpath("//span[.='right click me']"));
	    
	    //Use Contextclick() for right click action
	    act.contextClick(rightclick).build().perform();
	    

	}

}


//
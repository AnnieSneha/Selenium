package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Using shift keys
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
		
	    //I want to press the enter annie in email and then release the key
		
		Actions actions=new Actions(driver);
		//keyDown=press the keyboard ,keuUp=release the keyboard
		//keys=>enum
		actions.keyDown(email,org.openqa.selenium.Keys.SHIFT).sendKeys("anniesneha").keyUp(email,org.openqa.selenium.Keys.SHIFT).build().perform();
		
            //keyDown(email,Keys.SHIFT)
		
		
		
		//I want use backspace to delete all the
		String passs="annie123";//entering password
		password.sendKeys(passs);
		//Pressing backspace from keyboard 8 times in a loop
		for(int i=0;i<passs.length();i++) {
			
		
		actions.keyDown(password,org.openqa.selenium.Keys.BACK_SPACE).keyUp(password, org.openqa.selenium.Keys.BACK_SPACE).build().perform();
		}
		
	}

}
//
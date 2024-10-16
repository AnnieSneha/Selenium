package assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Inclass2 {

	public static void main(String[] args) {
		try {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();

			Actions actions1=new Actions(driver);
			
			WebElement search = driver.findElement(By.cssSelector("[placeholder='Search for anything']"));
			
			
			actions1.sendKeys(search,"iphone").keyDown(search, Keys.ENTER).keyUp(search,Keys.ENTER).build().perform();

		}catch (Exception e) {
			
		}

	}
	}


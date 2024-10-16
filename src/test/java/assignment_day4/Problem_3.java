package assignment_day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Problem_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.linkText("Elemental Selenium")).click();//Clicks on link
		
        String parentid=driver.getWindowHandle();//this will fetch the parent window handle
	    
	    Set<String> allids=driver.getWindowHandles();//this will fetch all the ids present in the browser
	    
	    String expectedtitle="Elemental Selenium";
	    
	    for (String id : allids) {   
	    	
			  driver.switchTo().window(id);
			  
			  if(driver.getTitle().equals(expectedtitle)){
				  
				  break;
			  }
			}
	    
		driver.findElement(By.id("email")).sendKeys("annie14@gmail.com");
		
		WebElement dropdown = driver.findElement(By.id("options"));
		
		Select s=new Select(dropdown);
		
		s.selectByValue("python");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();

		driver.switchTo().window(parentid);//switches back to the main page
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("tomsmith");
		
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}

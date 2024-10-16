package switchTo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://v1.training-support.net/selenium/iframes");
        
		//to work with iframe
		//we have to firstt switch the control from main page to frame
		
		WebElement frame1 = driver.findElement(By.xpath("(//iframe)[1]"));
		
         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(12));
         
         //this explicit wait will check check for the frame available and will wait for the frame too be available
		 
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe)[1]")));
		
		
		
		
		//driver.switchTo().frame(frame1);//now control is switched to the frame
		
		driver.findElement(By.id("actionButton")).click();
		
		//driver.switchTo().frame(frame1).findElement(By.id("actionButton")).click();
		
		//Switch back the control from frame to the main frame
		
		driver.switchTo().defaultContent();
		
		String text=driver.findElement(By.xpath("//div[.='Interact with the elements in the following iframes!']")).getText();
		
		System.out.println(text);
		
		// wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		WebElement frame2 = driver.findElement(By.cssSelector("[src='/selenium/frame2']"));
		
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("[src='/selenium/frame2']")));
		
		//driver.switchTo().frame(frame2);//either by name or indexing(frame(1)) and thats how we switch back
		
		driver.findElement(By.id("actionButton")).click();
		
	}

}

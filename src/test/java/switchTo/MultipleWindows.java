package switchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    Thread.sleep(2000); 
	    
	    driver.findElement(By.id("openwindow")).click();
	    Thread.sleep(2000); 
         String parentid=driver.getWindowHandle();
	    
	    Set<String> allids=driver.getWindowHandles(); 
	    
	    String expectedtitle="QAClick Academy - A Testing Academy to Learn, Earn and Shine";
	    
	    for (String id : allids) {    
		  driver.switchTo().window(id);
		  
		  if(driver.getTitle().equals(expectedtitle)){
			  break;
		  }
		}
	    
	    driver.findElement(By.linkText("Access all our Courses")).click();
	    driver.close();
	    Thread.sleep(2000);
	    driver.switchTo().window(parentid);
	    driver.close();
	   

	}

}

package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutilpleTabEasy {

	public static void main(String[] args) throws InterruptedException {
		// This approach does not open a new tab,but instead works only on one tab
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    Thread.sleep(2000);
		     WebElement opentab = driver.findElement(By.id("opentab"));
		     
		     String url=opentab.getAttribute("href");//href contains the new tab link
		     
		     driver.navigate().to(url);;
		     
		     driver.findElement(By.linkText("Access all our Courses")).click();
			    
		     driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");//navigates to the home page
		     driver.close();
	}

}

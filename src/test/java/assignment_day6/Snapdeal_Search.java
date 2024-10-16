package assignment_day6;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal_Search {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById(\"inputValEnter\").value='Tshirt'"); 
		
		String search = "document.getElementsByClassName('searchformButton')[0].click();";
		
		((JavascriptExecutor) driver).executeScript(search);

	    driver.close();

	}

}

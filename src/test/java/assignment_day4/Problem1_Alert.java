package assignment_day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem1_Alert {

	public static void main(String[] args) throws InterruptedException {
		    
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("alertBox")).click();
			
			Alert ele = driver.switchTo().alert();
			
			String alerttext=ele.getText();
			
			System.out.println(alerttext);
			
			ele.accept();

	}

}

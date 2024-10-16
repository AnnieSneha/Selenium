package switchTo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		try {
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("alertbtn")).click();
		
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(12));
		 
		 wait.until(ExpectedConditions.alertIsPresent());
		
		
		//Thread.sleep(2000);
		Alert ele = driver.switchTo().alert();//this will switch the control from webpage to alert
		//Thread.sleep(2000);
		
		String alerttext=ele.getText();
		//Thread.sleep(2000);
		System.out.println(alerttext);
		
		ele.accept();//it will click on OK
		
		
		//Click on confirm popup 
		driver.findElement(By.id("confirmbtn")).click();
		

		wait.until(ExpectedConditions.alertIsPresent());
		
		//to store the text of alert/confirm
		
		String alertmsg=driver.switchTo().alert().getText();
		
		System.out.println(alertmsg);
		
		//driver.switchTo().alert().accept();//this will click on OK
		//this or that
		driver.switchTo().alert().dismiss();//this will click on CANCEL
		Thread.sleep(2000);
		driver.close();//close the browser
		}catch (Exception e) {
		
		}
	}

}

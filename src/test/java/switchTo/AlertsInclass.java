package switchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInclass {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
	    driver.findElement(By.id("name")).sendKeys("Annie");
	    
	    driver.findElement(By.id("confirmbtn")).click();
	    
	    Alert ele = driver.switchTo().alert();//this will switch the control from webpage to alert
		//Thread.sleep(2000);
		
		String alerttext=ele.getText();
		//Thread.sleep(2000);
		
		ele.accept();//it will click on OK
		if(alerttext.contains("Annie")) {
			System.out.println(alerttext);
			}
		driver.close();
		
		
	}

}

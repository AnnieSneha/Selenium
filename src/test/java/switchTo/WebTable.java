package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub  
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    Thread.sleep(2000);
			String text = driver.findElement(By.xpath("(//table)[2]/tbody/tr[4]/td[2]")).getText();
			 
			if(text.equals("Receptionist")) {
				System.out.println("Clicked on Receptionist Successfully");
			}
		    

	}

}

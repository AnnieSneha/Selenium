package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
        driver.findElement(By.cssSelector("[id='datepicker1']")).click();
        Thread.sleep(2000);
//        WebElement actualmonth = driver.findElement(By.cssSelector(".ui-datepicker-month"));
//        WebElement actualyear = driver.findElement(By.cssSelector(".ui-datepicker-year"));
      
	}

}

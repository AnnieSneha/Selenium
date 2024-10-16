package assignment_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.automationtesting.in/Datepicker.html");
			
	        driver.findElement(By.cssSelector("[id='datepicker1']")).click();
	        
	        Thread.sleep(2000);
	        
	        WebElement actualmonth = driver.findElement(By.cssSelector(".ui-datepicker-month"));
	        
	        WebElement actualyear = driver.findElement(By.cssSelector(".ui-datepicker-year"));
	        
	        String month=actualmonth.getText();
	        
	        String year=actualyear.getText();
	        
	        while (!(month.equals("March")&&year.equals("2025"))) {
	        	
	        	driver.findElement(By.cssSelector("[data-handler='next']")).click();
	        	
	        	month=driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
	        	
	        	year=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
		}
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//td[@data-month='2']/a[.='12']")).click();
	}

	}


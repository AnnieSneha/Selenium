package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	   //this or driver.findElement(By.cssSelector(".hasDatepicker")).sendKeys("12/12/2024",Keys.ENTER);
        
        //2nd approach
		driver.findElement(By.cssSelector(".hasDatepicker")).click();
		Thread.sleep(2000);
		//to select the decmeber and year 2024
		WebElement actualmonth = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		WebElement actualyear = driver.findElement(By.cssSelector(".ui-datepicker-year"));
		
		String month=actualmonth.getText();
		String year=actualyear.getText();
		//it will continue executing until the condition if failed
		
		while (!(month.equals("June")&&year.equals("2025"))) { //this line is important "!"
			driver.findElement(By.cssSelector("[title='Next']")).click();
			
			month=driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();//here it updates the next month,as the next button is pressed
			
			year=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
		}
		
		driver.findElement(By.xpath("//td[@data-month='5']/a[.='21']")).click();
		
	}

}

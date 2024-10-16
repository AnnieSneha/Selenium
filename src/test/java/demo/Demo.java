package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));//implicit wait
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.titleIs("Practice Page"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("radioButton"))).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("checkBoxOption1"))).click();
		
		driver.close();
		
	}

}

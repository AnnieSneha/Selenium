package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		
         WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		//Implicit wait-will wait for 5 seconds before throwing execution
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//always write at the start of the script,and only once we have to mention it only once,coz its global
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");//enter username
//		
//		driver.findElement(By.name("password")).sendKeys("admin123");//enter password
//		
//		driver.findElement(By.cssSelector("[type='submit']")).click();//click on login button
		
		//Explicit wait
		
		//Step 1: Create object of WebdriverWait Class.
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));//its only for certain element but not for everything
		
		//used the conditional wait using ExpectedConditions e is interface and c is class in EC
		
		wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		
		//if  the expected condition fails ,then it will wait for mentioned time and throw -TimeOutExpection
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[name='username']"))).sendKeys("Admin");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("admin123");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type='submit']"))).click();
		
		

		


	}

}

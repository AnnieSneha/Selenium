package evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//url of the application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Login into the application
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");//enter username
		
		driver.findElement(By.name("password")).sendKeys("admin123");//enter password
		
		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}

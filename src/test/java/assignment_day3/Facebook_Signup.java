package assignment_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Signup {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/signup");
			
			driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Annie");
			
			driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("Sneha");
			
			driver.findElement(By.cssSelector("[aria-label='Mobile number or email address']")).sendKeys("anniesneha14@gmail.com");
			
			driver.findElement(By.cssSelector("[name='reg_email_confirmation__']")).sendKeys("anniesneha14@gmail.com");

			driver.findElement(By.cssSelector("#password_step_input")).sendKeys("anniesneha14");
			
			WebElement day = driver.findElement(By.cssSelector("[aria-label='Day']"));
			
			Select s=new Select(day);
			
			s.selectByVisibleText("14");
			
            WebElement month = driver.findElement(By.cssSelector("#month"));
			
			Select s1=new Select(month);
			
			s1.selectByValue("11");
			
            WebElement year = driver.findElement(By.cssSelector("#year"));
			
			Select s2=new Select(year);
			
			s2.selectByVisibleText("2000");
			
			driver.findElement(By.xpath("//label[.='Female']")).click();
			
			driver.findElement(By.cssSelector("[name='websubmit']")).click();
			


			
	}

}

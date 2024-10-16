package assignment_day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Problem2_Iframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		//frame 1
		WebElement frame1 = driver.findElement(By.id("frm1"));
		
		driver.switchTo().frame(frame1);
		
		WebElement dropdown = driver.findElement(By.id("course"));
		
		Select s=new Select(dropdown);
		
		s.selectByValue("python");
		
		driver.switchTo().defaultContent(); //switches to the main page
		//frame2
		WebElement frame2 = driver.findElement(By.id("frm2"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.name("fName")).sendKeys("Annie");
		
		driver.findElement(By.name("lName")).sendKeys("Sneha");
		
		driver.findElement(By.id("femalerb")).click();
		
		driver.findElement(By.id("chinesechbx")).click();

        driver.findElement(By.name("email")).sendKeys("anniesneha14@gmail.com");
        
        driver.findElement(By.name("password")).sendKeys("snehaannie");
        
        driver.findElement(By.id("registerbtn")).click();
        
    	driver.switchTo().defaultContent();

	}

}


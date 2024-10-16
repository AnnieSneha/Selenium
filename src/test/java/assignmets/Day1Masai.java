package assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Masai {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//Maximize the browser 
        driver.manage().window().maximize();
        driver.get("https://www.masaischool.com/");
        
        //Sign Up
        driver.findElement(By.xpath("//button[.='sign up'][1]")).click();
        driver.findElement(By.name("name")).sendKeys("Sona");
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("annie.sneha14@gmail.com");
        driver.findElement(By.name("phone_number")).sendKeys("9901816387");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        driver.findElement(By.cssSelector("[aria-label='Please enter OTP character 1']")).sendKeys("2");
        driver.findElement(By.cssSelector("[aria-label='Please enter OTP character 2']")).sendKeys("4");
        driver.findElement(By.cssSelector("[aria-label='Please enter OTP character 3']")).sendKeys("5");
        driver.findElement(By.cssSelector("[aria-label='Please enter OTP character 4']")).sendKeys("6");
        driver.findElement(By.cssSelector("[aria-label='Please enter OTP character 5']")).sendKeys("7");
        driver.findElement(By.cssSelector("[aria-label='Please enter OTP character 6']")).sendKeys("8");
        driver.findElement(By.cssSelector("[for='otpVerify']")).click();
        
        //courses
        driver.findElement(By.xpath("//button[text()='Courses']")).click();
        driver.findElement(By.cssSelector("img[alt='Software Development']")).click();
        Thread.sleep(3000);
        driver.navigate().back();  
        
        //Events
        driver.findElement(By.xpath("//a[@href='/events' and @class='relative']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Webinars']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Masterclasses']")).click();
        Thread.sleep(1000);
        driver.navigate().back();  
        
        //Sucess Stories  
        driver.findElement(By.xpath("//a[@href='/success-stories' and @class='relative']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[text()='Pratham Sharma']")).click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[href='/teams']")).click();
	}

}

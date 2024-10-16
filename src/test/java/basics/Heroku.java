package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        
        //Maximize the browser 
        driver.manage().window().maximize();
        
        driver.get("https://the-internet.herokuapp.com/login");
        //Locator for name
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}

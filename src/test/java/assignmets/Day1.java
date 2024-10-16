package assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Maximize the browser 
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        //ID of a particular Webelement
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.cssSelector("a[href='/logout']")).click();
        //name of a particular Webelement
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("[type='submit']")).click();
	}

}

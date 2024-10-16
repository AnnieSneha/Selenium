package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Annie");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Sneha");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("anniesneha14@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("6362785636");
		driver.findElement(By.xpath("//*[@value=\"submit\"]")).click();
	}

}

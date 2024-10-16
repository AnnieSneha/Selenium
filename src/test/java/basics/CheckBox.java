package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Loactor for multiple checkobox using findelements all at once
		List<WebElement> checks = driver.findElements(By.cssSelector("[type='checkbox']"));
		//iterate over all elements using foreach loop then clicking on it
		for (WebElement ch : checks) {
			
			ch.click();
			
		}
		//UNCHECK
		List<WebElement> checkss = driver.findElements(By.cssSelector("[type='checkbox']"));
		//iterate over all elements using foreach loop then clicking on it
		for (WebElement ch : checkss) {
			
			ch.click();
	}
		
		
}
}

package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Step 1:type keyword
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ja");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Japan']")).click();
		
		//or
//		List<WebElement> options = driver.findElements(By.className("ui-menu-item-wrapper"));
//		
//		for (WebElement option : options) {
		
//			if(option.getText().contains("Japan")) {
		
//				System.out.println(option.getText());
		
//				option.click();
//			}
//		}
		
	}

}

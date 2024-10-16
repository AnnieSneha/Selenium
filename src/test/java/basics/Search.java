package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		//Search text box,,always css for better performance
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("mouse pad");
		driver.findElement(By.cssSelector("#gh-btn")).click(); 
		//check
		driver.findElement(By.xpath("//span[@class=\"checkbox cbx x-refine__multi-select-checkbox undefined\"][1]")).click();
		//uncheck
		driver.findElement(By.xpath("//span[@class=\"checkbox cbx x-refine__multi-select-checkbox undefined\"][1]")).click();
		//Click on radio button
		driver.findElement(By.cssSelector("[data-value=\"All Listings\"]")).click();
		//Click on radio button
		driver.findElement(By.cssSelector("[data-value=\"US Only\"]")).click();

	}

}

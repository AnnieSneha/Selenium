package assignment_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		Actions act=new Actions(driver);
		//Electronics
		WebElement electroncis= driver.findElement(By.linkText("Electronics"));
		//Fashion
		WebElement fashion= driver.findElement(By.linkText("Fashion"));
		//Motors
		WebElement motors= driver.findElement(By.linkText("Motors"));
		//Collectibles and Art
		WebElement art= driver.findElement(By.linkText("Collectibles and Art"));
		//Sports
		WebElement sports= driver.findElement(By.linkText("Sports"));
		//Health & Beauty
		WebElement beauty= driver.findElement(By.linkText("Health & Beauty"));
		//Industrial equipment
		WebElement industry= driver.findElement(By.linkText("Industrial equipment"));
		//Home & Garden
		WebElement home= driver.findElement(By.linkText("Home & Garden"));
		//Deals
		WebElement deals= driver.findElement(By.linkText("Deals"));
		//Sell
		WebElement sell= driver.findElement(By.linkText("Sell"));
		act.moveToElement(electroncis).build().perform();
		
		Thread.sleep(2000);
		
		act.moveToElement(fashion).build().perform();
		
		Thread.sleep(2000);
		
        act.moveToElement(motors).build().perform();
		
		Thread.sleep(2000);
		
        act.moveToElement(art).build().perform();
		
		Thread.sleep(2000);
		
		act.moveToElement(sports).build().perform();
			
		Thread.sleep(2000);
		
		act.moveToElement(beauty).build().perform();
		
		Thread.sleep(2000);
		
		act.moveToElement(industry).build().perform();
		
		Thread.sleep(2000);
		
		act.moveToElement(home).build().perform();
		
		Thread.sleep(2000);
		
		act.moveToElement(deals).build().perform();
		
		Thread.sleep(2000);
		
        act.moveToElement(sell).build().perform();
		
		Thread.sleep(2000);
		
		
		}


}

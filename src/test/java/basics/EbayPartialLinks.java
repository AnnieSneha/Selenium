package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayPartialLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.partialLinkText("Daily")).click(); //Daily Deals..only give daily and see
		driver.findElement(By.partialLinkText("Electron")).click();
		
	}

}

package assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
        
		driver.findElement(By.cssSelector("[placeholder='Search for anything']")).sendKeys("nike");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[aria-label='nike shoes']")).click();
		driver.findElement(By.cssSelector("[class='gh-sb ']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//option[.=' Entertainment Memorabilia']")).click();
		
		
		
		
		
	}

}

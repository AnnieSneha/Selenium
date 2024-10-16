package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.get("https://v1.training-support.net/selenium/nested-iframes");
        //Switches to the parent frame
        WebElement frame1 = driver.findElement(By.cssSelector("[src='/selenium/nested-iframe1']"));
		
		driver.switchTo().frame(frame1);//parent
		//Switches to the first child frame
        WebElement frame2 = driver.findElement(By.cssSelector("[src='/selenium/frame1']"));
		
		driver.switchTo().frame(frame2);//first child
		
		driver.findElement(By.id("actionButton")).click();
		
		driver.switchTo().defaultContent();//main frame
		
		driver.switchTo().frame(frame1);//parent
		//Switches to the second child frame
        WebElement frame3 = driver.findElement(By.cssSelector("[src='/selenium/frame2']"));
		
		driver.switchTo().frame(frame3);//second child
		
		driver.findElement(By.id("actionButton")).click();

	}

}

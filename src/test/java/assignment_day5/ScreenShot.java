package assignment_day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {

		
		public static void capture(WebDriver driver,int n) throws IOException {
			
	    TakesScreenshot ts=(TakesScreenshot)driver; 
			
	    File image = ts.getScreenshotAs(OutputType.FILE);
	    
		File img =new File("C:\\Users\\annie\\OneDrive\\Documents\\screeshot\\practice" + n + ".png");
		
		FileUtils.copyFile(image, img);
		}

		public static void main(String[] args) throws IOException {
			
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		
		Actions actions=new Actions(driver);
		
		WebElement ball = driver.findElement(By.cssSelector("[id='draggable']"));

		WebElement drop1 = driver.findElement(By.cssSelector("[id='droppable']"));
		
		WebElement drop = driver.findElement(By.cssSelector("[id='dropzone2']"));
		
		capture(driver,1);
		
		actions.dragAndDrop(ball, drop1).build().perform();
		
		capture(driver,2);
		
		actions.dragAndDrop(ball, drop).build().perform();
		
		capture(driver, 3);
		
		

	}

}

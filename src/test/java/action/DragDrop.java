package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		
		Actions actions=new Actions(driver);
		//locator for source
		WebElement ball = driver.findElement(By.cssSelector("[id='draggable']"));
        //locator for target
		WebElement drop1 = driver.findElement(By.cssSelector("[id='droppable']"));
		WebElement drop = driver.findElement(By.cssSelector("[id='dropzone2']"));
		actions.dragAndDrop(ball, drop1).build().perform();
		actions.dragAndDrop(ball, drop).build().perform();
	
		
		
		
	}

}

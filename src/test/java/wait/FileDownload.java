package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
	      
      WebDriver driver=new ChromeDriver();
     
      driver.get("https://demo.automationtesting.in/FileDownload.html");
      Thread.sleep(2000);
     
      
      driver.findElement(By.cssSelector("[id='textbox']")).sendKeys("heelo");
      
      driver.findElement(By.id("createTxt")).click();
      
      driver.findElement(By.cssSelector("[id='link-to-download']")).click();
      
          
      
      driver.findElement(By.id("pdfbox")).sendKeys("heellllo");
      
      driver.findElement(By.id("createPdf")).click();
      
      driver.findElement(By.id("pdf-link-to-download")).click();
      //driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
	}

}

package switchTo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		//To handle upload,we have to use sendKeys()//path of the file
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\annie\\OneDrive\\Documents\\Desktop");
		driver.findElement(By.className("field_check")).click();
		
		driver.findElement(By.name("send")).click();
		
		String text = driver.findElement(By.xpath("//h3[@id='res']")).getText();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(12));
        
        //this explicit wait will wait for text to be present in an element
		 
		 wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h3[@id='res']")),text));		
		
		
		if (text.contains("successfully uploaded")) {
			System.out.println("My file is successfully uploaded");
		}

	}

}

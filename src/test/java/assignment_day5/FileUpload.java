package assignment_day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		driver.findElement(By.cssSelector("[type='file']")).sendKeys("C:\\Users\\annie\\OneDrive\\Documents\\Desktop\\Annie.pdf");
		
		driver.findElement(By.cssSelector("[title='Upload selected files']")).click();//Clicking on Upload button

	}

}

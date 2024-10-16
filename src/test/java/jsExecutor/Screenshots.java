package jsExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshots {
	
	//its my own user defined method
	
	public static void capture(WebDriver driver,int n) throws IOException {
		
        TakesScreenshot ts=(TakesScreenshot)driver; //calling takescrenshot and casting it to the driver
		
		File image = ts.getScreenshotAs(OutputType.FILE);//Step 2:using getS() to take screeshot
		
		//go to maven repository and search for Apache commons-iO,and copy the dependency and paste it in the pom file
	
		//Step3:we have to create a new file in our local machine
	
		
		File img =new File("C:\\Users\\annie\\OneDrive\\Documents\\screeshot\\practice" + n + ".png");//practice.png I should give here,so it will a craete a folder in the screeshot
		
		FileUtils.copyFile(image, img);
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
//		//Step1: Invoke Take Screenshot and then cast into the driver,and the method is getScreenshot and mention the output (FILE)
//		
//		TakesScreenshot ts=(TakesScreenshot)driver; //calling takescrenshot and casting it to the driver
//		
//		File image = ts.getScreenshotAs(OutputType.FILE);//Step 2:using getS() to take screeshot
//		
//		//go to maven repository and search for Apache commons-iO,and copy the dependency and paste it in the pom file
//	
//		//Step3:we have to create a new file in our local machine
//	
//		
//		File img =new File("C:\\Users\\annie\\OneDrive\\Documents\\screeshot\\practice.png");//practice.png I should give here,so it will a craete a folder in the screeshot
		
		
		capture(driver,1);
		
		driver.findElement(By.partialLinkText("ResumeAssistance")).click();

        Thread.sleep(2000);
		capture(driver,2);
		
		driver.navigate().back();
		
		capture(driver, 3);
	}

}


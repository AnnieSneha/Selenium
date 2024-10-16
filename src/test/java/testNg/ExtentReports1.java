package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


/*Create an object
 * startTest=tells the report to generate the report
 */


public class ExtentReports1 {

	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	public void reportconfig() {
		
		// Step 1 : create object of ExtentReports class and starting the test.
		
		 report = new ExtentReports("C:\\Users\\annie\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Masai_june\\report.html");
		
		 test = report.startTest("Ebay_Search Testing");
		
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		 driver = new ChromeDriver();
		
		 test.log(LogStatus.PASS, "Chrome browser is opened");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ebay.com/");
		 test.log(LogStatus.PASS, "Url entered");
	}
	
	// Test case - smoke
	@Test(priority = 1,groups = "smoke")
	public void SearchTest() {
	
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Gaming laptop");
		
		driver.findElement(By.cssSelector("[value='Search']")).click();
		
		if(driver.getCurrentUrl().contains("gaming")) {
			
		
		 test.log(LogStatus.PASS, "Searched for Gaming laptop");
		}else {
			test.log(LogStatus.FAIL, "Search Failed");
		} 
	
}
	
	@Test(priority = 1,groups = "smoke")
	public void SearchTest2() {
	
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("laptop");
		
		driver.findElement(By.cssSelector("[value='Search']")).click();
		
		 test.log(LogStatus.PASS, "Searched for laptop");
	}
	
	
	
	
	
	
	@Test(priority = 0,groups = "Sanity")
	public void Searchiphone() {
		
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("iphone");
		
		driver.findElement(By.cssSelector("[value='Search']")).click();
		
		 test.log(LogStatus.PASS, "Searched for iphone");
			
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		
		driver.close();
		 test.log(LogStatus.PASS, "Browser closed");
		
	}
	
	@AfterClass
	public void flush() {
		// FLushing the reports and Ending the test
		report.flush();
		report.endTest(test); // Telling the report to stop the reporting.
		
	}
	
	
}




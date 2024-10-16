package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	/* It is a  TestNG feature
	 * I want to test my test with multiple sets of data
	 * I want to execute each test data in a new browser
	 * 
	 * store the values in 2D array
	 * 	we need give data to username and password,so we need to declare the datatype
	 * 
	 * we need to name the dataprovider to link with the test
	 */
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		 
		
	}
	
	@Test(dataProvider="data")
	public void Heruko(String username,String password) {
		
		driver.findElement(By.name("username")).sendKeys(username);
       
		driver.findElement(By.name("password")).sendKeys(password);
        
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	//Data provider through 2D
	
	@DataProvider(name="data")
	
	public Object[][] data() {
		
		return new Object[][] {
		
			new Object[] {"tom","super"},
			new Object[] {"smith", "secret"},
			new Object[] {"tomsmith","SUperSecretPassword"},
			new Object[] {"","SuperSecretPassword!"},
			new Object[] {"tomsmith",""},
			new Object[] {"tomsmith","SuperSecretPassword!"}
		};
	}
	
	
	@AfterClass
	public void teardown() {
		
		driver.close();
	}
	
	
	
}

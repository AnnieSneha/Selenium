package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

      WebDriver driver;
@BeforeMethod
public void setup() {
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");

// Assert the title - using Hard Assert.
     String expectedtitle="Practice Page";
     String actualtitle=driver.getTitle();// fetch title in execution. 
     Assert.assertEquals(actualtitle, expectedtitle); // assert the title.
//Assert the URL
     Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/AutomationPractice/");
//Asserting whether a string is present in the URL or not.

    String url=driver.getCurrentUrl();
    boolean status=url.contains("AutomationPractice");
    Assert.assertTrue(status);

}

@Test
public void test1(){//for  clickable
	WebElement check1 = driver.findElement(By.id("checkBoxOption1"));
	Assert.assertTrue(check1.isDisplayed());//asserting whether the chechkbox is displayed in the URL
	check1.click();
	System.out.println("before click" + check1.isDisplayed());
	Assert.assertTrue(check1.isSelected());//Assert whether the a chechkbox is selected or not
    WebElement radio1 = driver.findElement(By.className("radioButton"));
    Assert.assertTrue(radio1.isDisplayed());
    radio1.click();
    Assert.assertTrue(radio1.isSelected());
    
    
    //Asserting a particular text inside a URL
    
    driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();

    String actualemail=driver.findElement(By.cssSelector(".top-left")).getText();//it becomes string 
    
    Assert.assertEquals(actualemail, "contact@rahulshettyacademy.com");

}
@Test

public void test2() { //Soft Assertion we have to create an object
	driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
	
	SoftAssert sa=new SoftAssert();

	sa.assertEquals(driver.getTitle(), "Rs Academy");
	
	
	driver.findElement(By.linkText("JOIN NOW")).click();


//to display the assertion error message we have to use a method called assertall()
	
	sa.assertAll();//this is used for displaying in the asssert
	

}

@AfterMethod(alwaysRun = true) 
public void teardown() {
driver.close();
}
}

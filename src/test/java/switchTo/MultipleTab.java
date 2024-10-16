package switchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("opentab")).click();//this will open a new tab

        //GWH always be unique and no duplicates	
	    
	    //We have to switch the control from parent tab to the child tab
	    
	    String parentid=driver.getWindowHandle();//this will fetch the parent window handle
	    
	    Set<String> allids=driver.getWindowHandles(); //this will fetch all the ids present in the browser
	    
	    String expectedtitle="QAClick Academy - A Testing Academy to Learn, Earn and Shine";
	    
	    for (String id : allids) {   //works for more tab
		  driver.switchTo().window(id);//this will remain in the same
		  
		  if(driver.getTitle().equals(expectedtitle)){
			  
			  break;//this will break from the loop
		  }
		}
	    
	    driver.findElement(By.linkText("Access all our Courses")).click();
	    
	    driver.switchTo().window(parentid);//switches back to the main page
	    
	    //
	    driver.findElement(By.id("autocomplete")).sendKeys("Yes!!!Success");
	    
 }
	    

}

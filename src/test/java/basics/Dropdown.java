package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
		//Step !: Find the locator for the dropdown
		 
		  WebElement dropdown = driver.findElement(By.cssSelector("#dropdown-class-example"));
		//webelement1(s)
		//Step 2:Create Select class object
		
		Select s=new Select(dropdown);
		
		//Step 3: use method from select class:select by index
		
		//indexing always starts from )
	     s.selectByIndex(2);//0,1,2,3
	     
	     
	     //Selecting by visible text
	     
	    s.selectByVisibleText("Option3");
	    
	    
	    //Selecting by Value
	    
	    s.selectByValue("option1");
	     
	}

}

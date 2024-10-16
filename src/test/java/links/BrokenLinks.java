package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		//handling broken links
		//after getting the links,we will the broken links
		//broken link is also a dead link ....404,502,page not found
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//to fetch the links we need to used findelements
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//Fetch URLs from each link and then check for broken link conditions
		
		//getAttribute will fetch the particular link
		
		
		for (WebElement link : links) {
			
			//System.out.println("Total Number ");
			String url=link.getAttribute("href");
			
			//title of webpage contains some error texts like,-Error,402,502
			
			//it will open a new instance of the browser and enter url in the browsers
			//and then I will check whether these links are working or not
			try {
			if(url!=null) {
			driver=new FirefoxDriver();
			
			driver.get(url);
			
			String title=driver.getTitle();
		    
		    
			    if(title.equalsIgnoreCase("not found")||title.contains("402")||title.contains("502")||title.contains("Error")|title.isEmpty()) {
				
				System.out.println("The link is a BROKEN LINK" +url);
			    }else {
			    	System.out.println("Valid link" +url);
			    }
			
			
		    }
		    }
			catch (Exception e) {
				// TODO: handle exception
			}
		    	
			driver.close();	
		    }//end of for loop
		

	

	driver.quit();
	}
}


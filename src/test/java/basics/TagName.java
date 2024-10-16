package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		//I want to fetch all the links present in this webpage
		//Approach: we are using findelements() to fetch multiple elements
		
		List<WebElement> Ebay_links = driver.findElements(By.tagName("a"));
		
		//all the links will be stored in EbayLinks
		                                                 //.xpath("//a")
		//List<WebElement is the return type of findElements
		
		//a is the anchor tag...so link are always starts with anchor tag "a"
		//list is a data structure that is used to store multiple webelements
		//no need to type List<WebElement>
		
		
		//iterate all the links using foreach
		for (WebElement link : Ebay_links) {
			//iterate over an array,and change accordingly
			String links_name=link.getText();
			//displays all the text in console
			System.out.println(links_name);
		}
	}

}

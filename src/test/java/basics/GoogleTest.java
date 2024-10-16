package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//we are casting Chromedriver object with web driver interface		//WebDriver driver=new FirefoxDriver();
		                 //syntax of object new creation   means to open new browser
		driver.get("https://www.google.com/");  //driver is a variable,we can anything for that''get is one of the 13 method
		

	}

}

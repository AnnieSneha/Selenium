package assignment_day5;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		FileInputStream file=new FileInputStream("C:\\Users\\annie\\OneDrive\\Documents\\testdata\\data.xlsx");
		
		Workbook book=WorkbookFactory.create(file);
		
        String username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		book.close();
		
		

	}

}

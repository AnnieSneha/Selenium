package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//we have to copy and paste the 2 dependencies  and create excel sheet in the folder and enter the data
         
		// I want to read an external file
		
		FileInputStream file=new FileInputStream("C:\\Users\\annie\\OneDrive\\Documents\\testdata\\data.xlsx");
        
		//file has the path of excel file
		//Step 2:use ApachePOI libraries to connect with excel -WorkcookFactory--it is a excel file
		
		
		Workbook book=WorkbookFactory.create(file);
		
		//this will create a new instance of workbook
		 
		
		///creating a wrb instance and storing it in a variable called book
		
		
		//through sheetname I have to give the row and col no,it always starts from 0,to access the username and password
		
		
		//we will fetch the values and store it in username and password
		
		String username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.name("email")).sendKeys(username);
		
		driver.findElement(By.name("pass")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		
		book.close();
		
		
		
		
	
	}

}

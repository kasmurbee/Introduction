package PIPtask;

import
org.openqa.selenium.By;
import
org.openqa.selenium.WebDriver;
import
org.openqa.selenium.WebElement;
import
org.openqa.selenium.chrome.ChromeDriver;
import
org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import
java.io.FileOutputStream;
import
java.io.IOException;
import java.util.List;

public class Validation {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\10691538\\OneDrive - LTIMindtree\\Documents 2\\chromedriver.exe");
	
		// Set the path to your ChromeDriver executable
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the web application
		driver.get("https://demoblaze.com/");
			
		// Locate and extract data using Selenium
		List<WebElement> products = driver.findElements(By.className(
				"card-title"));
		try
		( Workbook workbook = new	XSSFWorkbook ()) {
		Sheet sheet = workbook.createSheet("Products");
		// Write headers
		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("Product Name");
		// Write data to Excel
		int rowNum = 1	;
		for
		(WebElement product : products) {
		String productName = product.getText();
		Row row = sheet.createRow(rowNum++); 
		row.createCell(0).setCellValue(productName); 
		}
		// Write the workbook to a file
		try
		(
		FileOutputStream fileOut = new FileOutputStream ("demoblaze_products.xlsx")) { workbook.write(fileOut); 
	     } 
		System.out.println("Data has been successfully written to demoblaze_products.xlsx"); 
		
		}
		catch
		(IOException e) { e.printStackTrace(); }
		// Close the WebDriver
		driver.quit();
		
	}
	
}
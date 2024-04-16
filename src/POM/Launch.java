package POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launch {
	
	
	WebDriver driver;
	Baseclass KN;
	
	
	@BeforeTest
	void launch() {
		driver.get("https://www.demoblaze.com/index.html");
		
	}
	@Test
	void signin() {
	driver.findElement(By.id("signin2")).click();

    }
	@AfterTest
	void close() {
		driver.quit();
		
		
	}
	
}


package org.apache.poi.xssf.usermodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\10691538\\OneDrive - LTIMindtree\\Documents 2\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.id("inputUsername")).sendKeys("rahul");
         driver.findElement(By.name("inputPassword")).sendKeys("hello123");
         driver.findElement(By.className("signInBtn")).click();         
       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       
       driver.findElement(By.linkText("Forgot your password?")).sendKeys("John");
       
       driver.close();         
	}

}

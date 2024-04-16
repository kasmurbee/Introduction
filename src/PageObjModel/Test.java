package PageObjModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\10691538\\OneDrive - LTIMindtree\\Documents 2\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         
         LandingPage landingpage= new LandingPage(driver);
         landingpage.goTo();
         landingpage.LoginAplication("standard_user","secret_sauce");
         Product product=new Product(driver);
         product.Test();
           
     //  System.out.println(driver.findElement(By.cssSelector("product_label")).getText()); 
     //  driver.close();         

	}

}

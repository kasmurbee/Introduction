package PageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
                                        

		WebDriver driver;
		

		public LandingPage (WebDriver driver) {   //Constructor
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		// WebElement user = driver.findElement(By.id("locked_out_user"));
		
		@FindBy(id="user-name")
		WebElement Username;
		
		@FindBy(name="password") 
		WebElement passwordEle;
		
		@FindBy(className="btn_action")
		WebElement Login;
		
		
		public  void LoginAplication(String sername, String Userpassword){
			Username.sendKeys(sername);
			passwordEle.sendKeys(Userpassword);
			Login.click();
		}
			
			public void goTo() {
				
				  driver.get("https://www.saucedemo.com/v1/");
				
			}			
			
		}
		
		
		
		
		
		
		
	



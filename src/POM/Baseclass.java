package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Baseclass {

	WebDriver driver; 

	Baseclass(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		
}
	
	//Locators
	
	@FindBy(id="signin2")
	WebElement Signbtn;
	
	
	public void Sign() {
		Signbtn.click();
	}
	
	
}
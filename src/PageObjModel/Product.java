package PageObjModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {

	WebDriver driver;
	

	public Product(WebDriver driver) {   //Constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(className="button.btn_primary btn_inventory")
	WebElement Button;
	
	

   public void Test() {
	   
	   
	   Button.click();
	   
	   
   }

}
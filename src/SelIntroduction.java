import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking the Browser
		//Chrome-ChromeDriver->Methods close get
		//Firefox-FirefoxDriver->methods close get
		//Safari- SafariDriver-> methods close get
		//webDriver close get
		
		//chromedriver.exe -> ChromeBrowser
		//step to invoke the browser
		//Salenium manager automatically taking care step 18
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\10691538\\OneDrive - LTIMindtree\\Documents 2\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		//FireFox driver
		//geckodriver-->
		
	//	WebDriver driver2=new FirefoxDriver();
	//	System.setProperty("webdriver.gecko.driver","C:\\Users\\10691538\\OneDrive - LTIMindtree\\Documents 2\\geckodriver.exe");
	  
		//MicrosoftEdge browser
		//msedgedriver-->
		
	//	WebDriver driver= new EdgeDriver();
	//	System.setProperty("webdriver.edge.driver","C:\\Users\\10691538\\OneDrive - LTIMindtree\\Documents 2\\msedgedriver.exe");
	
		driver1.get("https://www.amazon.in/");
	    System.out.println(driver1.getTitle());
	    System.out.println(driver1.getCurrentUrl());
	    driver1.close();
	   
	}

}

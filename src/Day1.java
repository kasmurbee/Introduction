import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\10691538\\OneDrive - LTIMindtree\\Documents 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");

	}

}

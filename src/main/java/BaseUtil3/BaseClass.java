package BaseUtil3;
//In your existing framework use getProperties() and setProperties() method to locate the chromedriver. You can use all type of locators to find web element and test for each. For css, try to use at least 3 way to create unique web element. Use isDisplayed() and isEnabled() method to test. You can also choose more than one url to see those actions (better). Please push it to GitHub
//60 points

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import nikepage.HomePage;

public class BaseClass {
	public WebDriver driver;
	
	 public HomePage homePage; 

	@BeforeMethod
	public void setup() {
		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\abu shaim\\eclipse-workspace\\com.nike\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/driver/chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "./drive/geckodriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.nike.com/");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
        homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearup() {
		driver.quit();
	}
}

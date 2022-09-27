package BaseUtil3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import nikepage.HomePage;

public class BaseClass {
	WebDriver driver;
	
	 public HomePage homePage; 

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abu shaim\\eclipse-workspace\\com.nike\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.nike.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearup() {
		driver.quit();
	}
}

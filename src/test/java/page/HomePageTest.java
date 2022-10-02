package page;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseUtil3.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = false)

	public void logoTest() {
		homePage.logoDisplayed();
	}

	@Test(enabled = false)
	public void userIdfieldTest() {
		homePage.enterUserIdField();
	}

	@Test(enabled = false)
	public void nextbuttonTest() throws InterruptedException {
		homePage.nextButtonClicked();
	}

	@Test(enabled = false)
	public void newFeaturedTest() throws InterruptedException {
		homePage.newfeatured();
	}

	@Test(enabled = false)
	public void searchButtonTest() throws InterruptedException {
		homePage.searchButton();
	}

	// new
	@Test(enabled = false)
	public void userIdFeildClickTest() {
		driver.findElement(By.xpath("(//span[text()='Sign In'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).click();
	}

	@Test(enabled = false)
	public void searchButtonTest1() {
		driver.findElement(By.xpath("//div[@class='pre-l-vs-box ta-sm-l']")).click();
	}

	@Test(enabled = false)
	public void newfeaturedTest1() {
		driver.findElement(By.xpath("//button[@aria-label='New & Featured']")).click();
	}

	@Test(enabled = false)
	public void searchInput() {
		driver.get("https://locator.chase.com/");
		driver.findElement(By.className("search-input chaseanalytics-track-element")).click();

	}

	@Test(enabled = false)
	public void signIn() {
		driver.get("https://www.capitalone.com/");
		driver.findElement(By.id("noAcctSubmit")).click();
	}

	@Test(enabled = false)
	public void logotest1() {
		driver.get("https://www.nike.com/");
		driver.findElement(By.className("pre-logo-svg")).click();
	}

	@Test(enabled = false)
	public void privacyRightTest() {
		driver.get("http//:www.costco.com/");
		driver.findElement(By.partialLinkText("Yor Privacy Ri")).click();

	}

	@Test(enabled = false)
	public void userNameTest() {
		driver.get("http://www.capitalone.com/");
		driver.findElement(By.name("ods-input-0")).click();

	}

	@Test(enabled = false)
	public void allCategories() {
		driver.get("https://www.bjs.com/");
		driver.findElement(By.linkText("All Categories")).click();
	}

	@Test(enabled = false)
	public void shopTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.cssSelector("navigation-dropdown")).click();
	}

	@Test(enabled = false)
	public void cartTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.cssSelector("cart-d")).click();
	}

	@Test(enabled = false)
	public void getHelpTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.cssSelector("Get Help")).click();
	}

	@Test(enabled = false)
	public void logoTest3() {
		driver.get("https://www.adidas.com/");
		boolean elementDisplayed = driver.findElement(By.xpath("//a[@data-auto-id='logo']")).isDisplayed();

	}

	@Test(enabled = false)
	public void menButtonTest() {
		driver.get("https://www.adidas.com/");
		boolean elementEnabled = driver.findElement(By.xpath("//a[@manual_cm_sp='header-_-men']")).isEnabled();
	}

	@Test(enabled = false)
	public void signInButtonTest() {
		boolean signInisSelected = driver.findElement(By.cssSelector("(//span[@id='hf_title_signin_membership'])[1]"))
				.isSelected();
		System.out.println("is the signIn Button IsSelected" + signInisSelected);
	}

	@Test(enabled = false)
	public void use_of_getTitle() {
		System.out.println("The title of the page is" + driver.getTitle());

	}

	@Test(enabled = false)
	public void use_of_getText() {
		driver.get("https://www.costco.com/");
		WebElement nur = driver.findElement(By.xpath("//a[text()='Grocery']\r\n" + ""));
		System.out.println("The text for the web Element" + nur.getText());
	}

	@Test(enabled = false)
	public void use_of_getCureentUrl_method() throws InterruptedException {
		driver.get("https://www.costco.com/");
		driver.findElement(By.xpath("(//img[@class='bc-logo logo-us'])[2]")).click();
		Thread.sleep(20);
		System.out.println(driver.getCurrentUrl());

	}

	@Test(enabled = false)
	public void use_of_getAttribute_method() {
		String value = driver.findElement(By.className("pre-logo-svg")).getAttribute("class");
		String value2 = driver.findElement(By.xpath("//a[@aria-label='Women']")).getAttribute("aria_label");
		System.out.println("The value of the class attribute is" + value);
		System.out.println("The value of the class attribute is" + value2);

	}

	@Test(enabled = false)
	public void use_of_sendKeys_mathod() throws InterruptedException {
		Thread.sleep(10);
		driver.get("http;/www.capitalone.com/");
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='ods-input-0']")).sendKeys("Abushaimqa");
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@name='ods-input-1']")).sendKeys("abushaim29");
		Thread.sleep(10);
	}

	@Test(enabled = false)
	public void use_of_sendKeys_mathod_then_click_submit_and_then_clear() throws InterruptedException {
		Thread.sleep(10000);
		driver.get("http://www.bestBuy.com/");
		Thread.sleep(10000);
		driver.findElement(By.className("search-input")).sendKeys("Iphone", Keys.ENTER);
		Thread.sleep(10000);
		driver.findElement(By.className("search-input")).clear();
		Thread.sleep(5000);
		driver.findElement(By.className("search-input")).sendKeys("camera", Keys.RETURN);
		Thread.sleep(5000);
		driver.findElement(By.className("search-input")).clear();

	}

	@Test(enabled = false)
	public void use_of_navigate_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("https://www.costco.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

	@Test(enabled = true)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		Dimension dimension = new Dimension(900, 500);
		driver.manage().window().setSize(dimension);
		driver.get("https://www.geico.com/");
		Thread.sleep(5000);
		System.out.println("This size of the screen is " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		System.out.println("This size of the screen is " + driver.manage().window().getSize());
		Thread.sleep(5000);
		System.out.println("This size of the screen is " + driver.manage().window().getSize());
	}
}
	
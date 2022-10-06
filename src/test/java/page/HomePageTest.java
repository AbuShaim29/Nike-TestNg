package page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.awt.Desktop.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

	@Test(enabled = false)
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

	// new
	@Test(enabled = false)
	public void dropdown_selectByIndex_Method() throws InterruptedException {
		driver.navigate().to("https://www.aliexpress.us/");
		driver.findElement(By.className("btn-close")).click();
		WebElement dropElement = driver.findElement(By.id("search-dropdown-box"));
		Select select = new Select(dropElement);
		select.selectByIndex(3);
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void dropdown_selectByVisisbleText_Method() throws InterruptedException {
		driver.navigate().to("https://www.aliexpress.us/");
		driver.findElement(By.className("btn-close")).click();
		// driver.findElement(By.name("_sacat"));
		WebElement dropElement = driver.findElement(By.id("search-dropdown-box"));
		Select select2 = new Select(dropElement);
		select2.selectByVisibleText("Shoes");
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void dropdown_selectByValue_Method() throws InterruptedException {
		// driver.get("http://www.ebay.com/");
		driver.navigate().to("https://www.aliexpress.us/");
		driver.findElement(By.className("btn-close")).click();
		// driver.findElement(By.name("_sacat"));
		WebElement dropElement = driver.findElement(By.name("search-dropdown-box"));
		Select select3 = new Select(dropElement);
		select3.selectByValue("58058");
		Thread.sleep(5000);
	}

	@SuppressWarnings("deprecation")
	@Test(enabled = false)
	public void setScriptTimeoutForWindow() {
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		driver.get("http://www.ebay.com/");
	}

	@Test(enabled = false)
	public void mouseHobarActionOnAboutUs() throws InterruptedException {
		Actions action = new Actions(driver);
		driver.get("https://www.mountsinai.org/");
		WebElement aboutUs = driver
				.findElement(By.xpath("//a[normalize-space(text())='About Us' and @class='hidden-xs dropdown']"));
		Thread.sleep(5000);
		action.moveToElement(aboutUs).build().perform();
		Thread.sleep(5000);
	}

	@Test(enabled = true)
	public void mouseHoberActionOnMens() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement mens = driver.findElement(By.xpath(
				"//button[@class='nav-btn p0-sm pre-desktop-menu-link headline-5 prl3-lg pt4-sm d-sm-b no-outline']"));
		Thread.sleep(3000);
		actions.moveToElement(mens).build().perform();
		Thread.sleep(3000);
		System.out.println("\nThe text of this web element is:" + mens.getText());
	}

	@Test(enabled = false)
	public void logoTest4() {
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		driver.get("https://www.mountsinai.org/");
		boolean flag = logo.isDisplayed();
		// System.out.println("is the logo Displayed? Ans:"+flag);
		Assert.assertTrue(true, "Application logo is not Displayed......");

	}

	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion() {
		// driver.getTitle();
		String expected = "Men&#x27;s Shoes, Clothing &amp; Accessories. Nike.com";
		String actual = driver.getTitle();
		System.out.println("Home Page Title is:" + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match......");
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url from  is:" + currentURL);
	}

	@Test(enabled = false)
	public void use_of_getTitle_method_with_soft_assertion() {
		String expected = "Men&#x27;s Shoes, Clothing &amp; Accessories. Nike.com";
		String actual = driver.getTitle();
		System.out.println("Home page  Title is:" + actual);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expected, "Home Page Title doesn't match....");
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url from is:" + currentURL);
	}

}

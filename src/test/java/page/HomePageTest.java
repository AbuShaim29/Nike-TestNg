 package page;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseUtil3.BaseClass;

public class HomePageTest extends BaseClass{
	@Test(enabled = false)
	
public void logoTest() {
	homePage.logoDisplayed();
	}
	@Test(enabled = false)
	public void userIdfieldTest() {
		homePage.enterUserIdField();
	}
	@Test(enabled = false)
	public void nextbuttonTest() throws InterruptedException{
		homePage.nextButtonClicked();
	}
	@Test(enabled = false)
	public void newFeaturedTest() throws InterruptedException{
		homePage.newfeatured();
	}
	@Test(enabled = false)
	public void searchButtonTest() throws InterruptedException{
		homePage.searchButton();
	}
	//new
	@Test(enabled = true)
	public void userIdFeildClickTest() {
		driver.findElement(By.xpath("(//span[text()='Sign In'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).click();
	}
	@Test(enabled = true)
	public void searchButtonTest1() {
		driver.findElement(By.xpath("//div[@class='pre-l-vs-box ta-sm-l']")).click();
	}
	@Test
	public void newfeaturedTest1() {
		driver.findElement(By.xpath("//button[@aria-label='New & Featured']")).click();
	}
	@Test
	public void searchInput() {
		driver.get("https://locator.chase.com/");
		driver.findElement(By.className("search-input chaseanalytics-track-element")).click();
		
	}
	@Test
	public void signIn() {
		driver.get("https://www.capitalone.com/");
		driver.findElement(By.id("noAcctSubmit")).click();
	}
	@Test
	public void logotest1() {
		driver.get("https://www.nike.com/");
		driver.findElement(By.className("pre-logo-svg")).click();
	}
	@Test
	public void privacyRightTest() {
		driver.get("http//:www.costco.com/");
		driver.findElement(By.partialLinkText("Yor Privacy Ri")).click();
		
	}@Test
	public void userNameTest() {
		driver.get("http://www.capitalone.com/");
		driver.findElement(By.name("ods-input-0")).click();
		
	}@Test
	public void allCategories() {
		driver.get("https://www.bjs.com/");
		driver.findElement(By.linkText("All Categories")).click();
	}
	@Test
	public void shopTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.cssSelector("navigation-dropdown")).click();
	}
	@Test
	public void cartTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.cssSelector("cart-d")).click();
	}
@Test
public void getHelpTest() {
	driver.get("https://www.costco.com/");
	driver.findElement(By.cssSelector("Get Help")).click();
}
@Test
public void logoTest3() {
	driver.get("https://www.adidas.com/");
	boolean elementDisplayed = driver.findElement(By.xpath("//a[@data-auto-id='logo']")).isDisplayed();
	
}
@Test
public void menButtonTest() {
	driver.get("https://www.adidas.com/");
	boolean elementEnabled = driver.findElement(By.xpath("//a[@manual_cm_sp='header-_-men']")).isEnabled();
}

}

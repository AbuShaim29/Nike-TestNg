package nikepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className  = "pre-logo-svg")
	WebElement logo;

	@FindBy(xpath = "//input[@id='username']")
	WebElement userId;

	@FindBy(className  = "css-14l6ovh btn-primary-dark  btn-lg")
	WebElement nextbutton;

	@FindBy(xpath = "//button[@aria-label='New & Featured']")
	WebElement newfeatured;
	
@FindBy(how = How.XPATH,using = "//div[@class='pre-l-vs-box ta-sm-l']")
WebElement searchButton;
	
	
	
	public boolean logoDisplayed() {
		Boolean img =logo.isDisplayed();
		System.out.println("The logo is displayed" + img);
		return img;

	}

	public void enterUserIdField() {
		nextbutton.click();
	}

	public void nextButtonClicked() throws InterruptedException {
		Thread.sleep(3000);
		nextbutton.click();
		Thread.sleep(3000);

	}

	public void newfeatured() throws InterruptedException {
		newfeatured.click();
		Thread.sleep(3000);
	}
    public void searchButton () throws InterruptedException{
	Thread.sleep(3000);
	searchButton.click();
	Thread.sleep(3000);
		
	}
}

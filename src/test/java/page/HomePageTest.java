package page;

import org.testng.annotations.Test;

import BaseUtil3.BaseClass;

public class HomePageTest extends BaseClass{
	@Test(enabled = true)
	
public void logoTest() {
	homePage.logoDisplayed();
	}
	@Test(enabled = true)
	public void userIdfieldTest() {
		homePage.enterUserIdField();
	}
	@Test(enabled = true)
	public void nextbuttonTest() throws InterruptedException{
		homePage.nextButtonClicked();
	}
	@Test(enabled = true)
	public void newFeaturedTest() throws InterruptedException{
		homePage.newfeatured();
	}
	@Test(enabled = true)
	public void searchButtonTest() throws InterruptedException{
		homePage.searchButton();
	}
	
}

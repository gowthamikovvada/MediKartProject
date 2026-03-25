package package1.MediKartProject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TC_4Searching_WishList_Cart extends BaseClass{
	@Test(retryAnalyzer=RetryLogic.class)
	public void search() throws InterruptedException {
		Reporter.log("Browser Luanched successfully");
		HomePage homepage= new HomePage(driver);
		homepage.searchingTheProduct();
		Reporter.log("Nebulizer product was searched successfully");
		
		SearchResultPage searchresultpage=new SearchResultPage(driver);
		searchresultpage.clickingTheFirstProduct();
		Reporter.log("Clicking on first result is successful");
		searchresultpage.wishListIconsClick();
		Reporter.log("Wishlist click is successful");
		searchresultpage.wishListButtonClick();
		Reporter.log("Wishlist button click is successful and moved to wishlist page");
		
		WishListPage wishlistpage= new WishListPage(driver);
		wishlistpage.hoverOveronProductToShowAddToCart();
		wishlistpage.addingTheProductToCart();
		Reporter.log("Cart adding is successful");
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Cart | Medikart HealthCare - India’s trustworthy online store for healthcare products");
		
		Reporter.log("TestCase4 passed with assertion");
		
		
	}
	
	

}

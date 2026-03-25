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
public class TC_5Searching_WishList_Cart_QuantityAddDelete_Proceed extends BaseClass{
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
		Thread.sleep(2000);
		searchresultpage.wishListButtonClick();
		Reporter.log("Wishlist button click is successful and moved to wishlist page");
		
		WishListPage wishlistpage= new WishListPage(driver);
		wishlistpage.hoverOveronProductToShowAddToCart();
		wishlistpage.addingTheProductToCart();
		Reporter.log("Cart adding is successful");
		
		CartPage cartpage= new CartPage(driver);
		cartpage.addingTheQuantityInTheCart();
		Reporter.log("Quantity increase is successful");
		Thread.sleep(2000);
		cartpage.deletingTheQuantityInTheCart();
		Reporter.log("Quantity decrease is successful");
		Thread.sleep(2000);
		cartpage.hoverOveronChatBotMessageToShowCrossIcon();
		cartpage.deletingTheChatBot();
		Thread.sleep(2000);
		cartpage.proceedToCheckOutButtonClick();
		Reporter.log("Proceed To checkout button click is successful");
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Checkout | Medikart HealthCare - India’s trustworthy online store for healthcare products");
		
		Reporter.log("TestCase5 passed with assertion");
		
	}
	
	

}

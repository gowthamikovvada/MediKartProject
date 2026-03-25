package package1.MediKartProject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TC_3Searching_WishList extends BaseClass{
	@Test(retryAnalyzer=RetryLogic.class)
	
	public void search() throws InterruptedException {
		SoftAssert s1=new SoftAssert();
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
		
		Thread.sleep(3000);
		s1.assertEquals(driver.getTitle(),"Wishlist | Medikart HealthCare - India’s trustworthy online store for healthcare products");
		Reporter.log("TestCase with Assertion is pass");
		
		
		
	}
	
	

}

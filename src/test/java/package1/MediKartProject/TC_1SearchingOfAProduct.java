package package1.MediKartProject;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TC_1SearchingOfAProduct extends BaseClass{
	@Test(retryAnalyzer=RetryLogic.class)
	public void search() {
		Reporter.log("Browser Luanched successfully");
		HomePage homepage= new HomePage(driver);
		homepage.searchingTheProduct();
		Reporter.log("Nebulizer product was searched successfully");
		
		
		Assert.assertEquals(driver.getTitle(), "You searched for Nebulizers | Medikart HealthCare - India’s trustworthy online store for healthcare products");
		Reporter.log("TestCase with Assertion passed");
	}
	
	

}

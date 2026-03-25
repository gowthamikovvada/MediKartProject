package package1.MediKartProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//div[@class='wd-product-wrapper product-wrapper']")
	private List<WebElement> searchResults;
	@FindBy(xpath="//div[@class='wd-buttons wd-pos-r-t']")
	private List<WebElement> wishListIcon;
	
	
	@FindBy(xpath="//div[@class='wd-header-wishlist wd-tools-element wd-style-icon wd-design-7 whb-itc82qyu9f3s0tscappq']")
	private WebElement wishListButton;
	
	
	
	
	public void clickingTheFirstProduct() {
		wait.until(ExpectedConditions.visibilityOfAllElements(searchResults));
		Actions a1=new Actions(driver);
		a1.moveToElement(searchResults.get(0)).perform();
		
	}
	public void wishListIconsClick() {
		wait.until(ExpectedConditions.visibilityOfAllElements(wishListIcon));
		for(int i=0;i<3;i++) {
			wishListIcon.get(i).click();
		}
	
	}
	
	public void wishListButtonClick() {
		wait.until(ExpectedConditions.elementToBeClickable(wishListButton));
		wishListButton.click();
	}
	
	
		public SearchResultPage(WebDriver driver) 
		{
			this.driver = driver;
	        PageFactory.initElements(driver, this);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		}
	
}


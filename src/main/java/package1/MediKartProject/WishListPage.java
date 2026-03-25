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

public class WishListPage {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//div[@class='wd-product-wrapper product-wrapper']")
WebElement hoverOverForAddToCart;
	
	@FindBy(xpath="//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart add-to-cart-loop']")
	private WebElement addToCartButton;
	
	
	public void hoverOveronProductToShowAddToCart() {
		wait.until(ExpectedConditions.visibilityOf(hoverOverForAddToCart));
		Actions a1=new Actions(driver);
		a1.moveToElement(hoverOverForAddToCart).perform();
	}
	
	public void addingTheProductToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
	addToCartButton.click();
	}
	
	
	
	
	
	
	
		public WishListPage(WebDriver driver) 
		{
			this.driver = driver;
	        PageFactory.initElements(driver, this);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		}
	
}

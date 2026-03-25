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

public class CartPage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//div[@class='quantity']/input[@aria-label='Increase quantity']")
	private WebElement quantityIncreaseButton;
	
	@FindBy(xpath="//div[@class='quantity']/input[@aria-label='Decrease quantity']")
	private WebElement quantityDecreaseButton;
	
	@FindBy(css="#engtCalloutText")
	private WebElement hoverOverOnchatBotMessage;
	
	
	@FindBy(xpath="//div[@class='engt-closed-callout-btn']")
	private WebElement chatBotCrossButton;
	
	
	
	
	@FindBy(xpath="//div[@class='wc-proceed-to-checkout']")
	private WebElement proceedButton;
	
	
	
	public void addingTheQuantityInTheCart() {
		wait.until(ExpectedConditions.elementToBeClickable(quantityIncreaseButton));
		quantityIncreaseButton.click();
	}
	public void deletingTheQuantityInTheCart() {
		wait.until(ExpectedConditions.elementToBeClickable(quantityDecreaseButton));
		quantityDecreaseButton.click();
	}
	
	public void hoverOveronChatBotMessageToShowCrossIcon() {
		wait.until(ExpectedConditions.visibilityOf(hoverOverOnchatBotMessage));
		Actions a1=new Actions(driver);
		a1.moveToElement(hoverOverOnchatBotMessage).perform();
	}
	public void deletingTheChatBot() {
		wait.until(ExpectedConditions.elementToBeClickable(chatBotCrossButton));
		chatBotCrossButton.click();
	}
	public void proceedToCheckOutButtonClick() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedButton));
		proceedButton.click();
	}
	
		public CartPage(WebDriver driver) 
		{
			this.driver = driver;
	        PageFactory.initElements(driver, this);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		}
	
}

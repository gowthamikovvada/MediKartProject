package package1.MediKartProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@aria-label='Search']")
	private WebElement searchBar;
	
	
	
	
	public void searchingTheProduct() {
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@aria-label='Search']"))));
		searchBar.sendKeys("Nebulizers"+Keys.ENTER);
	}
	/*public void searchResultsCount() {
		wait.until(ExpectedConditions.visibilityOfAllElements(searchResultsCheck));
		searchResultsCheck.size();
	}*/
		public HomePage(WebDriver driver) 
		{
			this.driver = driver;
	        PageFactory.initElements(driver, this);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		}
	
}

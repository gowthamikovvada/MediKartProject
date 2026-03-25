package utility;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
public class BaseClass extends ListenersLogic {
	@Parameters("Browsers")
	@BeforeMethod
	public void browserLaunch(String nameOfBrowser) {
		if(nameOfBrowser.equals("Chrome")) {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("start-maximized");
			//option.addArguments("headless");
			driver=new ChromeDriver(option);		
		}
		if(nameOfBrowser.equals("Firefox")) {
			FirefoxOptions option=new FirefoxOptions();
			option.addArguments("start-maximized");
		//	option.addArguments("headless");
			driver=new FirefoxDriver(option);		
		}
		if(nameOfBrowser.equals("Edge")) {
			EdgeOptions option=new EdgeOptions();
			option.addArguments("start-maximized");
			//option.addArguments("headless");
			driver=new EdgeDriver(option);		
		}	
		driver.get("https://medikart.co.in/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
	}	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();		
	}
}


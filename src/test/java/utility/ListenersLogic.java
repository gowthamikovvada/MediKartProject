package utility;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenersLogic implements ITestListener{
public	static WebDriver driver;

public String  getTimeStamp() {
Date d1=new Date();
long d11=d1.getTime();
Date d2=new Date(d11);
String format1=d2.toString();
String date=format1.substring(8, 10);
String month=format1.substring(4, 7);
String year=format1.substring(format1.length()-4);
String hour=format1.substring(11, 13);
String minute=format1.substring(14, 16);
String second=format1.substring(17, 19);
String format2=date+" ".concat(month)+" ".concat(year)+" ".concat(hour+"_").concat(minute+"_").concat(second);
return format2;
}
static String pathOfScreenShot(String status) {
	String path="C:\\Users\\prabh\\eclipse-workspace\\MediKartProject\\test-output\\Screenshot\\"+status+"\\";
	return path;
	
}


	@Override
	public void onTestSuccess(ITestResult result) {
		
		 TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path1=pathOfScreenShot("Pass");
		File destination=new File(path1+result.getName()+getTimeStamp()+".png");		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		 TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path1=pathOfScreenShot("Fail");
		File destination=new File(path1+result.getName()+getTimeStamp()+".png");		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	}



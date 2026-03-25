package utility;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class RetryLogic implements IRetryAnalyzer {
	int initialCount=0;
	int retryCount=2;
	public boolean retry(ITestResult result) {
		if(initialCount<retryCount) {
			initialCount++;
			return true;
	}
		return false;
	}
}

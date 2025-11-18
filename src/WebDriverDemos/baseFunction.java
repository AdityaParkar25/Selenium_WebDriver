package WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class baseFunction {
	
	public static WebDriver driver = null;

	public static void launchBrowser(String browserName) {
		
		if (browserName.equals("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();

	}
	
	public static void launchURL(String appURL) {
		driver.get(appURL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // defines the maximum time the WebDriver will wait for a web page to load completely. If the page does not load within the specified time, a TimeoutException is thrown
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // instructs Selenium to wait for a certain amount of time when trying to find an element before throwing a NoSuchElementException
	}
	
	public static void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void quitDriver() {
		driver.quit();
	}

}

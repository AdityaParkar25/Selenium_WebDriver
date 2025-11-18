// 5. Write a WebDriver script to capture a screenshot of a webpage and save it to a specific location

package SA_Assignments;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String demoURL = driver.getCurrentUrl(); // will get the url
		System.out.println("The accessed URL is : " + demoURL);

		Thread.sleep(2000);
		
		TakesScreenshot takeSS = (TakesScreenshot)driver;
		File sourceFile = takeSS.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\Screenshot\\WebpageScreenshot.png");
		sourceFile.renameTo(targetFile);  // copy sourceFile to targetFile

		driver.close();

	}

}



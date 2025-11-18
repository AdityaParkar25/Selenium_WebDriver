package SA_Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleCheck {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		
		driver1.get("https://automationexercise.com/");
		driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String demoURL = driver1.getCurrentUrl();  // will get the url
		System.out.println("The accessed URL is : " + demoURL);
		
		Thread.sleep(5000);
		
		//driver1.close();

	}

}

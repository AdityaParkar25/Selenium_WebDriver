// 1. Write a WebDriver script to navigate to a website and click on a specific link.

package SA_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLink {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement link = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a"));
		Thread.sleep(3000);
		
		link.click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}

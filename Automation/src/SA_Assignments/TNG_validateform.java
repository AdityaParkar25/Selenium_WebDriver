// 4. Implement a test case using WebDriver to validate the functionality of a registration form.

package SA_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TNG_validateform {
	
	@Test
	public void validateform() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Entering details in the form
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Light");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Yagami");
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("lightyagami@anime.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("8511123999");
		driver.findElement(By.id("subjectsInput")).sendKeys("English");
		Thread.sleep(2000);
		
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clickSubmit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		js.executeScript("arguments[0].scrollIntoView(true)", clickSubmit);
		Thread.sleep(2000);
		clickSubmit.click();
	}

}



package WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_15_ReadByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links " + allLinks.size());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println("text of all links " + allLinks.get(i).getText());
		}
		
		driver.close();

	}

}

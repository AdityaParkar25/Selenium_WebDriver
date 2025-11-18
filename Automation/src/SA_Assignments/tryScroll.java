package SA_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import WebDriverDemos.baseFunction;

public class tryScroll extends baseFunction {

	public static void main(String[] args) {

		launchBrowser("chrome");
		launchURL("https://omayo.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 5. scroll to specific element by using scrollintoview

		WebElement scrollElement = driver.findElement(By.xpath("//*[text()='Check this']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollElement);
		sleep();
		scrollElement.click();

	}

}

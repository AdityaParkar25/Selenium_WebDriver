package WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_18_handleMultipleCheckboxCommonAttributes extends baseFunction {

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		launchURL("https://omayo.blogspot.com/");
		
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[name='accessories']"));
		System.out.println("No. of checkboxes: "+ checkBoxes.size());
		
		checkBoxes.get(3).click();
		sleep();
		
		driver.close();
		
		// Sir Assignment:- try above scenario using xpath
	}

}

package WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SA19_handleDropdwonWithSelectClass extends baseFunction {

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		launchURL("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement countryDD = driver.findElement(By.id("country"));
		Select countryDropDown = new Select(countryDD);
		
		// all operations can be performed via countryDowndown only.
		
		System.out.println("getting firstSelectDropDownValue: " + countryDropDown.getFirstSelectedOption().getText());
		
		System.out.println("getting text based on index: "+ countryDropDown.getOptions().get(0).getText());
		System.out.println("getting text based on index: "+ countryDropDown.getOptions().get(10).getText());
		System.out.println("getting text based on index: "+ countryDropDown.getOptions().get(20).getText());
		
		List<WebElement> allDDOptions = countryDropDown.getOptions();
		System.out.println("Total no. of option size in DD: "+ allDDOptions.size());
		
		for (WebElement DDOptions: allDDOptions) {
			System.out.println("Text: "+ DDOptions.getText());
		}
		
		
		// selecting the value by using visible text
		countryDropDown.selectByVisibleText("Canada");  // Canada
		
		sleep();
		
		countryDropDown.selectByValue("83");  // Ghana
		
		sleep();
		
		countryDropDown.selectByIndex(0);  // India
		
		sleep();
		
		
		driver.close();
		

	}

}

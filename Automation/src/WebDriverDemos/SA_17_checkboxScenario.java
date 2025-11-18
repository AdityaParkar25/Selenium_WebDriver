package WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_17_checkboxScenario extends baseFunction {

	public static void main(String[] args) {

		launchBrowser("chrome");
		launchURL("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement checkBox = driver.findElement(By.cssSelector("input[name^='chk_altemail']"));

		System.out.println("Before click on CheckBox -");

		System.out.println("checking visibility of CheckBox: " + checkBox.isDisplayed());
		System.out.println("checking state of CheckBox: " + checkBox.isSelected());         // false
		System.out.println("checking enability of CheckBox: " + checkBox.isEnabled());

		if(!checkBox.isSelected()) {
			checkBox.click();
		}

		System.out.println("-------------------- After click on CheckBox- -------------------------");

		System.out.println("checking visibility of CheckBox: " + checkBox.isDisplayed());
		System.out.println("checking state of CheckBox: " + checkBox.isSelected());           // true
		System.out.println("checking enability of CheckBox: " + checkBox.isEnabled());

		checkBox.click(); // de-select the checkbox

		System.out.println("------------------- After click on Checkbox- ---------------------------");
		System.out.println("checking default State of checkbox " + checkBox.isSelected());      // false

		sleep();

		driver.close();

	}

}

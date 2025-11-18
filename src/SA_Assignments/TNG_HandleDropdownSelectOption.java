// 3. Write a WebDriver script to handle a dropdown and select an option based on specific criteria.

package SA_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TNG_HandleDropdownSelectOption {

	@Test
	public void DropDown() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement countryDD = driver.findElement(By.id("country"));
		Select countryDropDown = new Select(countryDD);

		System.out.println("Visible Default DropDown Option: " + countryDropDown.getFirstSelectedOption().getText());
		System.out.println("-------------------selecting options in dropdown-------------------");

		// selecting the option in dropdown
		countryDropDown.selectByVisibleText("Canada"); // Canada
		System.out.println("The selected option is : " + countryDropDown.getFirstSelectedOption().getText());

		Thread.sleep(5000);

		countryDropDown.selectByValue("9"); // Argentina
		System.out.println("The selected option is : " + countryDropDown.getFirstSelectedOption().getText());

		Thread.sleep(5000);

		countryDropDown.selectByIndex(104); // Japan
		System.out.println("The selected option is : " + countryDropDown.getFirstSelectedOption().getText());

		Thread.sleep(5000);

		driver.close();

	}

}



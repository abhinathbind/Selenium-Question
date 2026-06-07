package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		// isDisplayed()
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Logo Displayed: " + logo.isDisplayed());

		// isEnabled()
		WebElement firstName = driver.findElement( By.id("FirstName"));
		System.out.println("First Name Enabled: " + firstName.isEnabled());

		// isSelected() - Radio Buttons
		WebElement male = driver.findElement(By.id("gender-male"));
		WebElement female = driver.findElement(By.id("gender-female"));

		System.out.println("\nBefore Selection");
		System.out.println("Male: " + male.isSelected());
		System.out.println("Female: " + female.isSelected());

		male.click();

		System.out.println("\nAfter Selecting Male");
		System.out.println("Male: " + male.isSelected());
		System.out.println("Female: " + female.isSelected());

		female.click();

		System.out.println("\nAfter Selecting Female");
		System.out.println("Male: " + male.isSelected());
		System.out.println("Female: " + female.isSelected());

		// Newsletter Checkbox
		WebElement newsletter = driver.findElement( By.id("Newsletter"));
		System.out.println("\nNewsletter Selected: " + newsletter.isSelected());

		driver.quit();
	}

}

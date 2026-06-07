package Day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaDay6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// Opens the URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Returns page title
		System.out.println("Title: " + driver.getTitle());

		// Returns current URL
		System.out.println("Current URL: " + driver.getCurrentUrl());

		// Returns page source
		// System.out.println(driver.getPageSource());

		// Returns single window ID
		String windowId = driver.getWindowHandle();
		System.out.println("Window ID: " + windowId);

		// Example for multiple window IDs
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("All Window IDs: " + windowIds);

		driver.quit();
	}

}

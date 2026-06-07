package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver() ;

		driver.get("https:// demo.opencart.com/");

		driver.manage().window().maximize();

		// X path with single attribute
		driver.findElement(By.xpath("//input[@placeholder = 'search']")) .sendKeys("T-shirt");

		//X path with multiple attribute
		driver.findElement(By.xpath("//input[@name = 'Search'] [@placeholder = 'Search']")) .sendKeys("T-Shirts");

		// x path with ' and' 'or' operator
		driver.findElement(By.xpath("input//[@name = 'Search' and @placeholder = 'Search] ")) .sendKeys("T-Shirts");
		driver.findElement(By.xpath("input//[@name = 'Search' or @palceholder = 'Search']")) .sendKeys("T- Shirts");

		// x path with text() - inner text
		driver.findElement(By.xpath("//*[taxt( )= 'macBook']")) .click();

		boolean displayStatus = driver.findElement(By.xpath("//h3[text() = 'Featured']")).isDisplayed();
		System.out.println(displayStatus);

		String value = driver.findElement(By.xpath("//h3[text() = 'Featured']")) .getText();
		System.out.println(value);

		// x path with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys("T-Shirts");

		// x path with Start- With()
		driver.findElement(By.xpath("//input[start-with(@placeholder, 'Sea')]")).sendKeys("T shirt");

		// Chianed x path
		boolean status = driver.findElement(By.xpath("//div[@id = 'log']/a/img")) .isDisplayed();

		System.out.println(status);

	}

}

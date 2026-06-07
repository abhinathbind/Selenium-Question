package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.noncommerce.com/");
		driver.manage().window().maximize();

		// tag id
		driver.findElement(By.cssSelector("input#small- Searchterms")).sendKeys("T-Shirt");
		driver.findElement(By.cssSelector("#small-Searchterms")).sendKeys("T-Shrit");

		// tag class
		driver.findElement(By.cssSelector("input.Search-box-text")).sendKeys("T-Shrit");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shrit");

		// tag attribute
		driver.findElement(By.cssSelector("input[placeholder = 'search Store']")) .sendKeys("T-Shirt");
		driver.findElement(By.cssSelector("[placeholder = 'search Store']")) .sendKeys("T-Shirt");

		// tag class attribute
		driver.findElement(By.cssSelector("input.Search-box-text[name = 'q']")) .sendKeys("T-Shrit");
		driver.findElement(By.cssSelector(".Search-bos-text[name = 'q']")) .sendKeys("T-Shirt");
	}

}

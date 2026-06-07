package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();

		// name
		driver.findElement(By.name("search")).sendKeys("ma");

		// id
		boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayStatus );

		// link text && partial text
		driver.findElement(By.linkText("Tablets")).click() ;

		driver.findElement(By.partialLinkText("Table")) .click();

		//class name
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item")) ;

		System.out.println("total name of header links :"+ headerLinks.size());

		// tag name
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("total number of links:"+ link.size());

	}

}

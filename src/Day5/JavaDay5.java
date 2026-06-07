package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaDay5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();

		// Self - Selects the current node
		String text = driver.findElement(By.xpath("//a[contains(text(),'L&T')]/self::a")) .getText();
		System.out.println("Self : " + text);

		// Parent - Selects the parent of current node
		text = driver.findElement( By.xpath("//a[contains(text(),'L&T')]/parent::td")) .getText();
		System.out.println("Parent : " + text);

		// Child - Selects all child nodes
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements : " + childs.size());

		// Ancestor - Selects all ancestors
		text = driver.findElement(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr")).getText();
		System.out.println("Ancestor : " + text);

		// Descendant - Selects all descendants
		List<WebElement> descendants =
		driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant nodes : " + descendants.size());

		// Following - Selects all nodes after current node
		List<WebElement> followingNodes =
		driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes : "+ followingNodes.size());

		// Preceding - Selects all nodes before current node
		List<WebElement> precedingNodes = driver.findElements(
		By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of preceding nodes : "+ precedingNodes.size());

		// Following-Sibling
		List<WebElement> followingSiblings =
		driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings : "+ followingSiblings.size());

		// Preceding-Sibling
		List<WebElement> precedingSiblings = driver.findElements(
		By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding siblings : " + precedingSiblings.size());

		driver.quit();
	}

}

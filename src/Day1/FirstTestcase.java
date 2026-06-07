package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestcase {

	public static void FirstTestcase(String[] args) {

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo:opencart.com");

		String act_title = driver.getTitle();
		{
			if(act_title.equals("Yourstore")) {
				System.out.println("Test Passed");
			}else
			{
				System.out.println("Test Failed");
			}
		}
		//driver.close();
		//driver.quit();
	}

}

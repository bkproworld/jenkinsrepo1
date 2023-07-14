package Practicemvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTest {

	@Test
	public void test1() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		System.out.println("Practice for jenkins");
		System.out.println("new program added");
		System.out.println("new other program is added");
	}
}

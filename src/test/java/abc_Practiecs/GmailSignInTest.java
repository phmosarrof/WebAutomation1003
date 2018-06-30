package abc_Practiecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignInTest {

	public GmailSignInTest() {
		
	}

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // You can use anyother web browser.
		driver.get("https://www.google.com");
		driver.findElement(By.id("gb_70")).click();
		
		// assert.assertEquals(true, driver.getPageSource.contains("Google"));
		Thread.sleep(12000);
		
		Thread.sleep(20000);
		driver.close();
	}

}

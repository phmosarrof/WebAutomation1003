package abc_Practiecs;

import org.openqa.selenium.WebDriver;

public class GmailSignInTest {

	public GmailSignInTest() {
		
	}

	public static void main(String[] args) throws Throwable {
		System.setProperties("webdriver.chrome.driver","driver.chromedriver.exe");
		WebDriver driver = new FirefoxDriver(); // You can use anyother web browser.
		Driver.get(https://www.google.com/chrome/);
		// assert.assertEquals(true, driver.getPageSource.contains("Google"));
		Thread.sleep(2000);
		driver.close();
	}

}

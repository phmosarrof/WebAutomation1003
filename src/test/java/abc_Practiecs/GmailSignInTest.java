package abc_Practiecs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignInTest {
	private static final WebElement signout = null;

	public GmailSignInTest() {
	}
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 	// You can use any other web browser.

		driver.get("https://www.google.com");
		driver.findElement(By.id("gb_70")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/ServiceLogin?");

		driver.findElement(By.id("identifierId")).sendKeys("phmosharaf@gmail.com");
		driver.findElement(By.id("identifierNext")).click();

		driver.findElement(By.xpath("//input[@aria-label='Enter your password' and @name='password']")).sendKeys("password656");

		Thread.sleep(200);

		driver.findElement(By.id("passwordNext")).click();

		WebElement logout=driver.findElement(By.cssSelector("span.gb_4.gbii"));
		logout.click();

		driver.findElement(By.id("gb_71")).click();
		signout.click();

		// assert.assertEquals(true, driver.getPageSource.contains("Google"));

		Thread.sleep(1200);

		Thread.sleep(2000);

		driver.close();
	}

}

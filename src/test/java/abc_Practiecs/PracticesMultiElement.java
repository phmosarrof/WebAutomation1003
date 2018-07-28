package abc_Practiecs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticesMultiElement {

	public PracticesMultiElement() {

	}
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:/Users/Mosarrof Hossain/Utilities//chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		// Launch the ToolsQA WebSite
		
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
		
		driver.manage().window().maximize();

		// Type Name in the FirstName text box    
		
		driver.findElement(By.name("firstname")).sendKeys("Mosarrof"); 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		//Type LastName in the LastName text box
		
		driver.findElement(By.name("lastname")).sendKeys("Hossain");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		// Click on the Submit button
		driver.findElement(By.id("submit")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on "Partial Link Text" link
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link Test Pass");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Convert element in to a string 
		String sClass = driver.findElements(By.tagName("button")).toString();
		System.out.println(sClass);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Click on "Link Text" link
		driver.findElement(By.linkText("Link Test")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Link Test Pass");

		Thread.sleep(2000);
		driver.close();
	}
}



package Test;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class License_apikeys_Test {
	WebDriver driver;
	
	@Test 
	public void license_apikeys () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Aumation_V1\\driver\\chromedriver.exe");

		// Creating an object of ChromeDriver
		driver = new ChromeDriver();
		driver.get("https://admin-stage.insmeal.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("jaswalsaurabhjnv@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Byjus.123");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[@aria-label='loginButton']"));
		ele.click();
		
		Thread.sleep(25000);
		driver.findElement(By.xpath("(//div[.='License Apikeys'])[2]")).click();
		
		Thread.sleep(25000);
		driver.findElement(By.xpath("//input[@aria-label = 'Search']")).sendKeys("Apna Restaurant");
		Thread.sleep(25000);
		driver.findElement(By.xpath("//div[@data-testid = 'PENDING_api_key_CBT0571-ZN14RZ7-H7HWNG9-7X0TK6G' ]")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//li[@data-testid = 'confirm_approved_apikeyCBT0571-ZN14RZ7-H7HWNG9-7X0TK6G' ]")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//div[@data-testid = 'APPROVED_api_key_CBT0571-ZN14RZ7-H7HWNG9-7X0TK6G']")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//li[@data-testid = 'confirm_declined_apikeyCBT0571-ZN14RZ7-H7HWNG9-7X0TK6G' ]")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//div[@data-testid = 'DECLINED_api_key_CBT0571-ZN14RZ7-H7HWNG9-7X0TK6G' ]")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//li[@data-testid = 'confirm_pending_apikeyCBT0571-ZN14RZ7-H7HWNG9-7X0TK6G' ]")).click();
		
		
		
	}

}

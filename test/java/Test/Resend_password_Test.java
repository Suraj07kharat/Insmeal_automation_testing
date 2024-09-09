package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Resend_password_Test {
	
	WebDriver driver;
	
	@Test
	public void Resend_password () throws InterruptedException {
		{
	}
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
			driver.findElement(By.xpath("(//div[.='Resend Password'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder = 'Enter email']")).sendKeys("jyfane@clip.lat");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class = 'style_button__zoyIa']")).click();
	}

}

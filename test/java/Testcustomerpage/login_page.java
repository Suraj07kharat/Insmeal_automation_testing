package Testcustomerpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login_page {
		WebDriver driver;

		@Test
		public void launchChrome() throws InterruptedException {

 		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Aumation_V1\\driver\\chromedriver.exe");

			// Creating an object of ChromeDriver
			driver = new ChromeDriver();
			driver.get("https://stage.insmeal.com");
			Thread.sleep(5000);
			driver.manage().window().maximize();

			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@class = 'col-md-12']")).click();
			Thread.sleep(10000);
		    driver.findElement(By.xpath("//input[@class = 'PhoneInputInput']")).sendKeys("+17073958726");
		    Thread.sleep(10000);
		    driver.findElement(By.xpath("//button[@class = 'styles_authOtpBtn__aHleW']")).click();
		
		}
}
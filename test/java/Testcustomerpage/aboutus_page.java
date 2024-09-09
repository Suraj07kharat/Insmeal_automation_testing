package Testcustomerpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class aboutus_page {
		WebDriver driver;

		@Test
		public void launchChrome() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\Aumation_V1\\driver\\chromedriver.exe");

			// Creating an object of ChromeDriver
			driver = new ChromeDriver();
			driver.get("https://stage.insmeal.com/suraj");
			Thread.sleep(5000);
			driver.manage().window().maximize();

			driver.findElement(By.xpath("")).click();
			Thread.sleep(10000);

		}
}
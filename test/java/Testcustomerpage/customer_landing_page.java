package Testcustomerpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class customer_landing_page {
		WebDriver driver;

		@Test
		public void launchChrome() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\Aumation_V1\\driver\\chromedriver.exe");

			// Creating an object of ChromeDriver
			driver = new ChromeDriver();
			driver.get("https://stage.insmeal.com");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//input[@placeholder='Search Location']")).sendKeys("Los Angeles, CA, USA");
     	
			//Thread.sleep(20000);
			//driver.findElement(By.xpath("//button[@class = 'styles_searchbtn__35EPE']")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//h5[@class = 'styles_bannerLinkText__cCrbK']")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//input[@name = 'restaurantName']")).sendKeys("Veg Special");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@name = 'personName']")).sendKeys("Sahu");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("Ontario");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Waterloo");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@name = 'contantNo']")).sendKeys("+17073958726");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("sukharat@legitbytes.co");
			//Thread.sleep(10000);
			//driver.findElement(By.xpath("//button[@class = 'MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root jss8 css-1fu7jd5-MuiButtonBase-root-MuiButton-root']")).click();
			
			
			

}
}
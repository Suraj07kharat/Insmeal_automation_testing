package TestCorpStage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_coupon2page {
	WebDriver driver;

	@Test
	public void launchChrome() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Aumation_V1\\driver\\chromedriver.exe");

		// Creating an object of ChromeDriver
		driver = new ChromeDriver();
		driver.get("https://stageadmin.insmeal.com/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("goxofomy@teleg.eu");
		driver.findElement(By.name("password")).sendKeys("Byjus.123");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label='loginButton']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//p[text () = ' Locked ']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@placeholder  = 'Write Slug Name Here']")).sendKeys("flash");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[ text ()  = 'Submit']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//span[text () = 'Coupons']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text () = 'Add New Coupon']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@ placeholder = 'Enter coupon name']")).sendKeys("10%OFF");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@ placeholder = 'Enter coupon code']")).sendKeys("COUP10");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@ placeholder = 'Enter description']")).sendKeys("DIWALI FESTIVAL");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@ aria-labelledby = 'demo-simple-select-outlined-label demo-simple-select-outlined'][1]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//li[@ data-value = 'DOLLAR']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("// div[@ class ='MuiFormControl-root styles_fields__CxlIl']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//li[@ data-value = 'SPECIAL_EVENT']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[ text()  = 'Next']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("// input[@ name ='discount_value']")).sendKeys("5.30");
		Thread.sleep(20000);
		driver.findElement(By.xpath("// input[@ name ='min_order_value']")).sendKeys("20.30");
		Thread.sleep(20000);
		driver.findElement(By.xpath("// input[@ name ='day']")).sendKeys("50");
		Thread.sleep(20000);
		driver.findElement(By.xpath("// input[@ name ='week']")).sendKeys("500");
		Thread.sleep(20000);
		driver.findElement(By.xpath("// input[@ name ='month']")).sendKeys("1000");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@ name = 'valid_from']")).sendKeys("21/08/2024 - 12:49 am ");
		Thread.sleep(20000);
//		driver.findElement(By.xpath("")).click();
//		Thread.sleep(20000);
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("// input[@ name ='recurrence']")).click();
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("// input[@ name ='recurrence_value']")).sendKeys("5");
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("// span[text () ='Customer Visibility']")).click();
//		Thread.sleep(20000);
		//driver.findElement(By.xpath("//span[ text()  = 'Save']")).click();
		
		
	}

}

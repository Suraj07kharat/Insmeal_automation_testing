package TestCorpStage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_employee_page {
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
		driver.findElement(By.xpath("//span[text () = 'Employees']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text () = 'Add Employee']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@name  = 'email_id']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@name  = 'name']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@role  = 'combobox']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text () = 'MAN']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text () = 'ADD Employee']")).click();
	}

}

package TestCorpStage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_menupage {
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
//		driver.findElement(By.xpath("//p[text () = ' Locked ']")).click();
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("//input[@placeholder  = 'Write Slug Name Here']")).sendKeys("flash");
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("//span[ text ()  = 'Submit']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//span[text() = 'Menu']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text() = 'Categories']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@title  = 'Add Category']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@aria-label  = 'categoryName']")).sendKeys("Monaco");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@name  = 'secondlang_name']")).sendKeys("Sanco");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@name  = 'description']")).sendKeys("Marco");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@name  = 'secondlang_description']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[ text () = 'Use Restaurant Timing']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@aria-controls  = 'panel3bh-content']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//p[ text () = 'Ice cream sandwich']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@data-testid = 'AddCategory']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[ text () = 'Addon Group']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@title= 'Add Addon Groups']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@aria-label= 'addonName']")).sendKeys("Morya");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@aria-label= 'addonItemName']")).sendKeys("WERF");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@aria-label= 'addonType']")).click();
		//Thread.sleep(15000);
		//driver.findElement(By.xpath("//li[text ()= 'Multiple']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@ aria-label = 'addonItem']")).sendKeys("NJKM");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@ aria-label = 'addonPrice']")).sendKeys("2.30");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@aria-label = 'addonItem2lang']")).sendKeys("GHI");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[ text () = 'Save Addon']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[ text () = 'Menu Items']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@ placeholder = 'Search....']")).sendKeys("Paneer toofani");
		
	}
}

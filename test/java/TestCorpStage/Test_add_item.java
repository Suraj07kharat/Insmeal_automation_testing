package TestCorpStage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_add_item {

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
		driver.findElement(By.xpath("//span[text() = 'Add Item']")).click();
//		Thread.sleep(15000);
//		String path = "C://Users//HP//OneDrive//Documents//chilli";
//		driver.findElement(By.xpath("//button[@ data-testid= 'uploadImage']")).sendKeys(path);
//		Thread.sleep(15000);
//		driver.findElement(By.xpath("//span[ text () = 'upload']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@aria-label = 'itemName']")).sendKeys("Paneer toofani");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@aria-label = 'secondlang_name']")).sendKeys("Tufani");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//textarea[@aria-label = 'itemDesc']")).sendKeys("Very spaicy");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//textarea[@aria-label = 'secondlang_itemDesc']")).sendKeys("spicy");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@name = 'instruction']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@aria-controls = 'panel1bh-content']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@aria-label = 'itemPrice']")).sendKeys("5.50");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@aria-controls = 'panel2bh-content']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//p [text() ='Ice cream sandwich1']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@aria-controls = 'panel3bh-content']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//p [text() ='Ice cream sandwich']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@aria-controls = 'panel4bh-content']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@name = 'multi_price_name']")).sendKeys("Soyo");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text () = '+ new multipriced item']")).click ();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@data-testid = 'multiItemName']")).sendKeys("Royo");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@data-testid = 'multiItemPrice']")).sendKeys("2.30");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@aria-controls = 'panel5bh-content']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@aria-label = 'markingItemName']")).sendKeys("GYUH");
//		Thread.sleep(15000);
//		driver.findElement(By.xpath("")).sendKeys("Royo");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text () = 'Change']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@ aria-label= 'addonItem']")).sendKeys("Royo");
//		Thread.sleep(15000);
//		driver.findElement(By.xpath("//button[@data-testid = 'newAddonItem']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@aria-label = 'itemName']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("")).click();
		
}
}

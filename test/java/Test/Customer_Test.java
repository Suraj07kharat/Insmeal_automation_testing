package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Customer_Test {
	WebDriver driver;
	@Test
	public void Customer() throws InterruptedException {
		
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
		driver.findElement(By.xpath("(//div[.='Customers'])[2]")).click();
		
		Thread.sleep(25000);
		WebElement searchbar = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		searchbar.click();
		searchbar.sendKeys("daniel");
		Thread.sleep(5000);
     	driver.findElement(By.xpath("//span[text()='details']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//button[@data-testid = 'block_btn']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//button[@data-testid = 'block_user_btn']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@data-testid = 'unblock_btn']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//button[@data-testid = 'block_cancel_user_btn']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//button[@data-testid = 'unblock_btn']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//button[@data-testid = 'block_user_btn']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//span[text()='Order History']")).click();
    
     	Thread.sleep(55000);
     	driver.findElement(By.xpath("(//div[.='Customers'])[2]")).click();
		Thread.sleep(25000);
		WebElement search_bar = driver.findElement(By.cssSelector("input[placeholder='search....']"));
	    search_bar.sendKeys("7073958726");
	    Thread.sleep(10000);
     	driver.findElement(By.xpath("//span[text()='details']")).click();
     	Thread.sleep(30000);
     	driver.findElement(By.xpath("//button[@data-testid = 'block_btn']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//button[@data-testid = 'block_user_btn']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@data-testid = 'unblock_btn']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//button[@data-testid = 'block_cancel_user_btn']")).click();
        Thread.sleep(10000);
     	driver.findElement(By.xpath("//button[@data-testid = 'unblock_btn']")).click();
     	Thread.sleep(10000);
     	driver.findElement(By.xpath("//button[@data-testid = 'block_user_btn']")).click();
     	Thread.sleep(10000);
        driver.findElement(By.xpath("//span[text()='Order History']")).click();
     	Thread.sleep(10000);
	
		

	}

}

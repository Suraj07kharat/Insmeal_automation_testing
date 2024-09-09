package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_Request_Test {
	
 WebDriver driver;
	@Test
	public void New_requests() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\eclipse-workspace\\Aumation_V1\\driver\\chromedriver.exe");

	// Creating an object of ChromeDriver
	driver = new ChromeDriver();
	driver.get("https://admin-stage.insmeal.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys("jaswalsaurabhjnv@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Byjus.123");
	Thread.sleep(20000);
	WebElement ele = driver.findElement(By.xpath("//button[@aria-label='loginButton']"));
	ele.click();
	
	Thread.sleep(20000);
	driver.findElement(By.xpath("(//div[.='New Requests'])[2]")).click();
	
	Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@ aria-label= 'Search']")).sendKeys("MARATHA");
	Thread.sleep(20000);

//	WebElement text = driver.findElement(By.xpath("//td[@data-testid = 'MuiDataTableBodyCell-5-0']//div//div"));
//	String actultext = text.getText();
//	System.out.println(actultext);
//	
//	if (actultext.equalsIgnoreCase("Active")) {
//		driver.findElement(By.xpath("//div[@data-testid = 'Accepted_req_a25521b2-3012-4f3b-a1d2-9bfd2c854cdb']")).click();
//		driver.findElement(By.xpath("//li[@data-testid = 'confirm_pending_req_a25521b2-3012-4f3b-a1d2-9bfd2c854cdb']")).click();
//	}
//	else {
//		Thread.sleep(2500);
//		driver.findElement(By.xpath("//div[@data-testid = 'Pending_req_a25521b2-3012-4f3b-a1d2-9bfd2c854cdb']")).click();
//	Thread.sleep(2500);
//		driver.findElement(By.xpath("//li[@data-testid = 'confirm_declined_req_a25521b2-3012-4f3b-a1d2-9bfd2c854cdb']")).click();
//		Thread.sleep(2500);
//	}
//	if (actultext.equalsIgnoreCase("Active")) {
//		driver.findElement(By.xpath("//div[@data-testid = 'Declined_req_a25521b2-3012-4f3b-a1d2-9bfd2c854cdb']")).click();
//		driver.findElement(By.xpath("//li[@data-testid = 'confirm_accepted_req_a25521b2-3012-4f3b-a1d2-9bfd2c854cdb']")).click();
//}
	Thread.sleep(20000);
	driver.findElement(By.xpath("//button[@data-testid = 'add_rest_a25521b2-3012-4f3b-a1d2-9bfd2c854cdb']")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@name = 'slug']")).sendKeys("jaswal345");
	Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@aria-label = 'service_type_pickup']")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@aria-label = 'service_type_delivery']")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@aria-label = 'feature_cash']")).click();
	Thread.sleep(20000);
	//driver.findElement(By.xpath("feature_card")).click();
	//Thread.sleep(20000);
	driver.findElement(By.xpath("//button[@data-testid = 'add_rest_btn']")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("new_req_a25521b2-3012-4f3b-a1d2-9bfd2c854cdb")).click();


}
}
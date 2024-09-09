package TestCorpStage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Corpstageliveorder {
	WebDriver driver;

	@Test
	public void launchChrome() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Aumation_V1\\driver\\chromedriver.exe");

		// Creating an object of ChromeDriver
		driver = new ChromeDriver();
		driver.get("https://stageadmin.insmeal.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("saurabh.jaswal@cyberoisystems.com");
		driver.findElement(By.name("password")).sendKeys("Byjus.123");
		Thread.sleep(20000);
		WebElement ele = driver.findElement(By.xpath("//button[@aria-label='loginButton']"));
		ele.click();
	    Thread.sleep(20000);
		

	List<WebElement> ele2 = driver.findElements(By.xpath("//span[@class='MuiTypography-root MuiFormControlLabel-label MuiTypography-body1']"));
	Thread.sleep(30000);

	for (int i = 0; i < ele2.size(); i++) {
		
		String ele3 = ele2.get(i).getText();
		System.out.println(ele3);
		Thread.sleep(10000);
		if (ele3.equalsIgnoreCase("Suraj Heritage")) {
			System.out.println("Suraj Heritage");
			ele2.get(i).click();
			break;
		}
	}
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[@ data-testid ='loginBtn']")).click();
	Thread.sleep(30000);
	driver.findElement(By.xpath("//div[@class = 'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-3 MuiGrid-grid-md-1']//p[text() = 'Yesterday']")).click();
	Thread.sleep(15000);
	driver.findElement(By.xpath("//div[@class = 'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-3 MuiGrid-grid-md-1']//p[text() = 'Week']")).click();
	Thread.sleep(15000);
	driver.findElement(By.xpath("//div[@class = 'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-3 MuiGrid-grid-md-1']//p[text() = 'Month']")).click();
}

}

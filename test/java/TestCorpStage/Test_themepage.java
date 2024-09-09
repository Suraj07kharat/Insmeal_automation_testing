package TestCorpStage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_themepage {
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
	driver.findElement(By.xpath("//span[text() = 'Theme']")).click();
	Thread.sleep(15000);
//	driver.findElement(By.xpath("//div[@class='jss2826']//button")).click();
//    Thread.sleep(10000);
//	String path="C://Users//HP//OneDrive//Pictures//Screenshots//ice cream sandwich.png";
//	driver.findElement(By.xpath("//div[@class='jss2807']//input")).sendKeys(path);
    driver.findElement(By.xpath("//input[@placeholder = 'Tag Line']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@name= 'carousel_transition_interval']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@value= 'Restaurant History']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@value= 'Our Special Dishes']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@value= 'Amazing Location']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@name= 'online_order_text']")).sendKeys("Express order");
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@name= 'online_order_link']")).sendKeys("https://tempmailo.com/#google_vignette");
    Thread.sleep(15000);
    driver.findElement(By.xpath("//span[text () ='Add New Link']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@name ='name']")).sendKeys("Null");
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@name ='link']")).sendKeys("https://googlechromelabs.github.io/chrome-for-testing/");
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@class = 'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']//span[text () ='Save']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@class= 'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-1']//button[1]")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@class = 'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']//span[text () ='Save']")).click();
//    Thread.sleep(15000);
//
//	List<WebElement> ele2 = driver.findElements(By.xpath("//div[@class = 'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']"));
//	Thread.sleep(30000);
//
//	for (int i = 0; i < ele2.size(); i++) {
//		
//		String ele3 = ele2.get(i).getText();
//		System.out.println(ele3);
//		Thread.sleep(10000);
//		if (ele3.equalsIgnoreCase("Show Navbar")) {
//			System.out.println("Show Navbar");
//			ele2.get(i).click();
//			break;
//}
//	}
//	Thread.sleep(15000);
//	driver.findElement(By.xpath("//div[@id= 'mui-component-select-mobile_category_view']")).click();
//    Thread.sleep(15000);
//    driver.findElement(By.xpath("//div[text() = ' Collapsed ']")).click();
//    Thread.sleep(15000);
//    driver.findElement(By.xpath("//div[@class = 'MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']")).click();
//    Thread.sleep(15000);
//    driver.findElement(By.xpath("//li[text() = ' Expanded ']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@data-testid= 'pay_with_cash_btn_text']")).sendKeys("Pay with card");
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-1']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'right']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-1']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'center']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-1']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'left']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-1']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'default']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-2']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'right']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-2']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'center']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-2']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'left']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-2']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'default']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//label[@class= 'MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1offpuc']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//label[@class= 'MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1offpuc']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@name= 'footer']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@aria-label = 'Switch demo']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@aria-label = 'Switch demo']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@aria-label = 'Switch demo']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@data-testid= 'menu_file_name']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-3']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'Horizontal']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls= 'mui-3']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value= 'Vertical']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-4']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = ' x-large']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-5']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = 'fantasy']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-6']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = ' x-large']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-7']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = 'fantasy']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-8']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = ' x-large']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-9']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = 'fantasy']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-10']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = ' x-large']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-11']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = 'fantasy']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-12']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = ' x-large']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-13']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = 'fantasy']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-14']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = ' x-large']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//div[@aria-controls = 'mui-13']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//li[@data-value = 'fantasy']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@value = '#AF0000']")).click();
    Thread.sleep(15000);
    driver.findElement(By.xpath("//input[@value = '#424242']")).click();
//    Thread.sleep(15000);
//    driver.findElement(By.xpath("//span[text() = 'Save']")).click();
//    Thread.sleep(15000);
//    driver.findElement(By.xpath("//span[text() = 'Cancel']")).click();
 //   Thread.sleep(15000);
  //  driver.findElement(By.xpath("//span[text() = 'Save']")).click();
    //   Thread.sleep(15000);
//  driver.findElement(By.xpath("//span[text() = 'Continue']")).click();
    
    
}
}

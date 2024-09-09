package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Restaurant_Test {
	WebDriver driver;

	@Test
	public void launchChrome() throws InterruptedException {

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
		driver.findElement(By.xpath("//input[@ aria-label= 'Search']")).sendKeys("Sahara");
		Thread.sleep(2500);
		
//		driver.findElement(By.xpath("//div[@data-testid = 'active_rest_107']")).click();
//		Thread.sleep(2500);
		
		WebElement text = driver.findElement(By.xpath("(//td[@data-testid=\"MuiDataTableBodyCell-6-0\"]//div//div//span)[1]"));
		String actultext = text.getText();
		System.out.println(actultext);
		if (actultext.equalsIgnoreCase("Active")) {
			driver.findElement(By.xpath("//div[@data-testid = 'active_rest_107']")).click();
			driver.findElement(By.xpath("//li[@data-testid = 'confirm_inactive_rest_107']")).click();

		} else {
			Thread.sleep(2500);
			driver.findElement(By.xpath("//div[@data-testid = 'inactive_rest_107']")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath("//li[@data-testid = 'confirm_active_rest_107']")).click();
			Thread.sleep(2500);
		}
		
	
		
		WebElement search_bar = driver.findElement(By.cssSelector("input[placeholder='search....']"));
		Thread.sleep(25000);
		search_bar.sendKeys("suraj heritage");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@class='suggestionDiv']//a")).click();
		Thread.sleep(25000);
		WebElement namefield = driver.findElement(By.xpath("//input[@name = 'restaurant_name']"));
		namefield.click();
		
		//Thread.sleep(25000);
		//driver.findElement(By.xpath("//input[@name = 'restaurant_name' ]")).click();
		Thread.sleep(10000);
		WebElement namefield1 = driver.findElement(By.xpath("//input[@name = 'email_id' ]"));
		namefield1.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name = 'email_id' ]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name = 'slug']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@data-testid = 'check_slug_availability_btn']")).click();
    	Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name = 'phone_number']"));
 	Thread.sleep(2500);
	driver.findElement(By.xpath("//input[@name = 'alternate_contact_number']")).sendKeys("/123");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//p[text() = ' Visible ']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		Thread.sleep(2500);
	driver.findElement(By.xpath("//input[@name= 'kitchenhub_store_id']")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("//input[@name= 'street']")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("//input[@name= 'postal_code']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name= 'city']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name= 'state']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name= 'country']")).click();
		Thread.sleep(2500);
	
	 String path = "C://Users//HP//OneDrive//Pictures//Documents//Lightshot//FileUpload.json";
	driver.findElement(By.xpath("//input[@aria-label='import_menu_input']")).sendKeys(path);
	
	Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-testid = 'import_menu_btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-testid = 'block_cancel_user_btn']")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//button[@data-testid = 'export_menu_btn']")).click();
		Thread.sleep(5000);
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		driver.findElement(By.xpath("//button[@style = 'margin-top: 10px;']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id= 'user']")).sendKeys("vofaven936@fanneat.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@data-testid = 'add_user_button']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@style = 'margin-top: 10px;']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id= 'user']")).sendKeys("vofaven936@fanneat.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@data-testid = 'cancel_add_user_button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-testid = 'add_api_key_btn']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@placeholder = 'API key name']")).sendKeys("Bahubali");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@ id = 'confirm_add_api_key_btn']")).click();
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//button[@data-testid= 'delete_api_key_ZJRSMMC-K2SMPZK-HP44SFH-FCZ9NY6']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@data-testid = 'add_api_key_btn']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@placeholder = 'API key name']")).sendKeys("AWDr");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@ data-testid= 'cancel_add_api_key_btn']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@data-testid= 'add_gateway_btn']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name= 'user_name']")).sendKeys("bijetoca@teleg.eu");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("dfhd");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name= 'customer_code']")).sendKeys("teleg.eu");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[@aria-label= 'processor_name_input']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//li[@data-value= 'TSYS - Production']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@data-testid = 'cancel_gateway_add_btn' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid= 'add_gateway_btn']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name= 'user_name']")).sendKeys("bijetoca@teleg.eu");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("125dfhdgbgfgg");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name= 'customer_code']")).sendKeys("teleg.eu");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[@aria-label= 'processor_name_input']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//li[@data-value= 'TSYS - Production']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@data-testid = 'add_gateway_info_btn']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@aria-label= 'card_discover' ]")).click();
		Thread.sleep(25000);
		//driver.findElement(By.xpath("//button[@data-testid = 'save_rest_detail_btn']")).click();
		//Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@aria-label ='OrderTab']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@aria-label ='Search']")).sendKeys("8962");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@aria-label = 'licenseKeyTab']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@aria-label = 'Search']")).sendKeys("Suraj key on 14");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@data-testid ='access_rest_dash_btn']")).click();
		
		
		
		
		
		
		



		

		


	}
}

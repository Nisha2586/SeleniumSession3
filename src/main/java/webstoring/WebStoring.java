package webstoring;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebStoring {
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void variables() {
				
		WebElement USERNAME_ELEMENT=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_ELEMENT=driver.findElement(By.id("password"));
		WebElement SIGNIN_ELEMENT=driver.findElement(By.xpath("//button[@name='login']"));
		By USERNAME_LOCATOR=(By.xpath("//input[@id='username']"));
		By PASSWORD_LOCATOR=(By.id("password"));
		By SIGNIN_LOCATOR=(By.xpath("//button[@name='login']"));
		
		
		USERNAME_ELEMENT.sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_LOCATOR).sendKeys("abc123");
	    SIGNIN_ELEMENT.click();
		
		driver.findElement(By.xpath("//span[@class='nav-label'][text()='Bank & Cash']")).click();
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Savings Account");
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("New Savings Account");
		driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("12332");
		driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("12344580908");
		driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("The Manager");
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("543-233-4564");
		driver.findElement(By.xpath("//button[@type='submit'][@class='btn btn-primary']")).click();
	}
	
	

}

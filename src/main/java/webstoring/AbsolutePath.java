package webstoring;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePath {
	WebDriver driver;
@Before
	public void Initiation() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@Test
public void Absolute() {
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[1]/div[1]/input[@id='username']")).sendKeys("demo@techfios.com");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div[2]/input[@id='password']")).sendKeys("abc123");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div[3]/button[@class='btn btn-success block full-width']")).click();
	// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div[3]/button[text()='Sign in']")).click();
	// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div[3]/button[contains(text(),'Sign in')]")).click();
}

}

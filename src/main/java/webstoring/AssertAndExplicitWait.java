package webstoring;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssertAndExplicitWait {
WebDriver driver;
@Before
public void initialization() {
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.techfios.com/billing/?ng=login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void Explicit() {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	boolean header;
	try {
		//driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
		driver.findElement(By.xpath("//span[text()='Products & Services']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Products']")).click();
		header = true;
	}catch(Exception e) {//No Such Exception
		header=false;
	   e.printStackTrace();
	}
	
	//WebDriverWait wait =new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2")));
	
	Assert.assertTrue("wrong page", header);

}
}

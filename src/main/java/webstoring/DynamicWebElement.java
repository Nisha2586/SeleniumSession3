package webstoring;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebElement {
	WebDriver driver;
	@Before
	public void Initialization() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://edition.cnn.com/?refresh=1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void DynamicElement() {//it is combo of Absolute and Relelative
		
		driver.findElement(By.xpath("//ul[@class='cn cn-list-large-vertical cn--idx-0 cn-container_3646EB44-FCF4-DA78-65C8-07ED52819671\"]/descendant::*/div[1]/div[2]/div[3][@class=\"cd__description']")).click();
		
		
	}

}

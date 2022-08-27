package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShop_TestCase {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"))).build().perform();
		act.click(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).build().perform();
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

}

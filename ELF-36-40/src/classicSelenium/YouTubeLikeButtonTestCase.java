package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTubeLikeButtonTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("doraemon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='video-title']")).click();
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(Keys.ESCAPE);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(@aria-label,'like this video along')])[1]")).click();
		driver.close();
		
	}
}

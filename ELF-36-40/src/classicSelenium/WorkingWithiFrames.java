package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithiFrames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/User/Downloads/iframe.html");
		
		WebElement frame=driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[text()='VIDEO']")).click();
	}

}

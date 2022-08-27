package classicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		String windowHandle=driver.getWindowHandle();
		//System.out.println(windowHandle);
		
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> windowHandles= driver.getWindowHandles();
		for(String print: windowHandles) {
			driver.switchTo().window(print);
			Thread.sleep(2000);
			if(driver.getTitle().contains("Facebook")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Send Message']")).click();
				Thread.sleep(2000);
				driver.close();
			}
	
		}
		//driver.switchTo().window("");
		//driver.findElement(By.xpath("//span[text()='Send Message']")).click();

	}

}

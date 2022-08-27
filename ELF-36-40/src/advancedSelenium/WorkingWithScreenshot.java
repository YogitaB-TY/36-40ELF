
package advancedSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenshot {
	
	static WebDriver driver;
	
	public static void pageScreenshot() {
		
		LocalDateTime date=LocalDateTime.now();
		
		String systemDateTime=date.toString().replaceAll(":", "-");
		System.out.println(systemDateTime);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenshots/"+systemDateTime+".png");
		
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		 WebElement element= driver.findElement(By.xpath("//input[@type='submit']"));
		elementScreenshot(element);
		pageScreenshot();
	}
	
	public static void elementScreenshot(WebElement element) {
		
		File temp= element.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/Imagescreenshot1.png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	

}

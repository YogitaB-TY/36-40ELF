package advancedSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithScroll {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement indiranagar=driver.findElement(By.xpath("//h5[text()='Indiranagar']"));
		
		js.executeScript("arguments[0].scrollIntoView(false);", indiranagar);
	}

}

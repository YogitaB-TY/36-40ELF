package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		
		WebElement search= driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	    search.sendKeys("watches ");
	    Thread.sleep(2000);
	    WebElement watches=driver.findElement(By.xpath("//li[text()='Watches For Men']"));
	    watches.click();
	}

}

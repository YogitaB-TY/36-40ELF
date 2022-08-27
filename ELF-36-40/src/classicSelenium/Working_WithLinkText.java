package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_WithLinkText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Documents/Selenium/HTML-Pages/SampleHTMLPage.html");
		
		WebElement fbLink= driver.findElement(By.linkText("Facebook"));
		fbLink.click();
		
		driver.navigate().back();
		
		WebElement amazonLink=driver.findElement(By.partialLinkText("Ama"));
		amazonLink.click();
	}

}

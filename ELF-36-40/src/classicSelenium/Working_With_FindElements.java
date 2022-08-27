package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Documents/Selenium/HTML-Pages/SampleHTMLPage.html");

		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			System.out.println(link.getText());
		}


	}
}

package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_CSSselector {
	
	public static void main(String[] args) {
		String cssValue="input[type='password']";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Documents/Selenium/HTML-Pages/SampleHTMLPage.html");
		
		WebElement pwdTF=driver.findElement(By.cssSelector(cssValue));
		pwdTF.sendKeys("Password");
		
		System.out.println("\"Hello\"");
	}

}

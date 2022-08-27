package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_WithThreads {
	
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver"; //which browser to launch
		String value="C:\\Users\\User\\eclipse-workspace\\ELF-36-40SeleniumTraining\\drivers\\chromedriver.exe";
		//the path to the browser driver
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); //upcasting to restrict methods of browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement createAccount=driver.findElement(By.linkText("Create New Account"));
		createAccount.click();
		
		Thread.sleep(5000);
		
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("Catherine");
	}

}

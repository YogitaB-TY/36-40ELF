package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Training {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Documents/Selenium/HTML-Pages/SampleHTMLPage.html");
		WebElement usernameTF= driver.findElement(By.id("username"));
		usernameTF.sendKeys("elf");
		
		WebElement passwordTF=driver.findElement(By.className("password"));
		passwordTF.sendKeys("password");
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.tagName("a"));
		link.click();
	}

}

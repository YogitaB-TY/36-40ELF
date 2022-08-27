package classicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithSynchronization {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver,20);
		/*
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * driver.findElement(By.id("alertbtn")).click();
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * 
		 * Alert alert=driver.switchTo().alert(); alert.accept();
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement createAccountButton= driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createAccountButton.click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		
		driver.findElement(By.name("firstme")).sendKeys("Suvarna Prasad");
		
		
	}

}

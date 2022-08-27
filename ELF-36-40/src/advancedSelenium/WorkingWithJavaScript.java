package advancedSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithJavaScript {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//WebElement disabledTF=driver.findElement(By.xpath("//input[@class='form-control']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='It is recieving';", disabledTF);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement hiddenTF=driver.findElement(By.xpath("//input[@aria-label='Gender (optional)']"));
		js.executeScript("arguments[0].value='Text value';", hiddenTF);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
		
		
	}

}

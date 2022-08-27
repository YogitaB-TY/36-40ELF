package classicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferenceBWCloseAndQuit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Downloads/MultipleWindow.html");
		
		WebElement button=driver.findElement(By.cssSelector("input[type='button']"));
		button.click();
		Thread.sleep(2000);
		
		Set<String> windowHandles= driver.getWindowHandles();
		System.out.println(windowHandles.size());
		//button.click();
		driver.quit();
	}

}

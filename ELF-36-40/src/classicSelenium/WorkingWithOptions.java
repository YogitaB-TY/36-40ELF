package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Documents/TestYantra/ELF/ELF-34/demo.html");
		
		WebElement carDropDown= driver.findElement(By.id("standard_cars"));
		
		Select select =new Select(carDropDown);
		List<WebElement> options= select.getOptions();
		for(int i=0;i<options.size();i++) {
			//select.selectByIndex(i);
			options.get(i).click();
			Thread.sleep(2000);
			
		}

	}

}

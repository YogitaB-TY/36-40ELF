package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_MultipleDropDown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Documents/Selenium/HTML-Pages/MultipleDropdown.html");
		
		WebElement dropDown= driver.findElement(By.name("menu"));
		Select select=new Select(dropDown);
		if(select.isMultiple()) {
			System.out.println("It is a multi select drop down");
		}else {
			System.out.println("Is a single select dropdown");
		}
		
		select.selectByIndex(0);
		select.selectByIndex(4);
		
	}

}

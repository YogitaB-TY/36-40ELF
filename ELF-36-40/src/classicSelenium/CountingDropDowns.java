package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountingDropDowns {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		/*
		 * driver.findElement(By.partialLinkText("BOOKS")).click();
		 * 
		 * List<WebElement> dropdowns= driver.findElements(By.tagName("select"));
		 * 
		 * System.out.println(dropdowns.size());
		 */
		WebElement scroll=driver.findElement(By.xpath("(//i[@class='dropdown icon'])[1]"));
		scroll.sendKeys(Keys.PAGE_DOWN);
		scroll.sendKeys(Keys.PAGE_DOWN);
		WebElement drop= driver.findElement(By.name("skills"));
		Select select=new Select(drop);
		select.selectByIndex(4);
		select.selectByIndex(5);
	}
	

}

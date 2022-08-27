package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWith_SortByDropDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		WebElement sortByDropdown=driver.findElement(By.id("products-orderby"));
		Select select=new Select(sortByDropdown);
		
		List<WebElement> options= select.getOptions();
		for(int i=0;i<options.size();i++) {
			WebElement Dropdown=driver.findElement(By.id("products-orderby"));
			Select sel=new Select(Dropdown);
			sel.selectByIndex(i);
		}
		WebElement ByDropdown=driver.findElement(By.id("products-orderby"));
		Select select1=new Select(ByDropdown);
		select1.selectByVisibleText("Position");
	}

}

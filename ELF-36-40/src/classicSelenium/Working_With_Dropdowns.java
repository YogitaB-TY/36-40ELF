package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Dropdowns {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		/* driver.findElement(By.xpath("//option[text()='List']")).click(); */
		
		
		WebElement SortByDD= driver.findElement(By.id("products-orderby"));
		Select sel=new Select(SortByDD);
		sel.selectByVisibleText("Name: Z to A");
		Boolean flag=sel.isMultiple();
		System.out.println(flag);
		sel.deselectByVisibleText("Name: Z to A");
		
		
		
	}

}

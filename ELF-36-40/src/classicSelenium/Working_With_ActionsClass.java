package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_ActionsClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		WebElement womensLink=driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(womensLink).click(womensLink).build().perform();
		
		
		
	}

}

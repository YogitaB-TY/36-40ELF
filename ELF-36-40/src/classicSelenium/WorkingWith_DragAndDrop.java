package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWith_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		
		WebElement italy=driver.findElement(By.xpath("//div[text()='Italy']"));
		Actions act=new Actions(driver);
		//act.dragAndDrop(rome, italy).build().perform();
		act.clickAndHold(rome).build().perform();
		Thread.sleep(2000);
		act.release(italy).build().perform();
		}

}

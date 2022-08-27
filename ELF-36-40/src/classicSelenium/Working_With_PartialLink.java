package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_PartialLink {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		for(int i=1;i<=4;i++) {
			driver.findElement(By.xpath("//input[@id='pollanswers-"+i+"']")).click();
			System.out.println("The index is "+i+" ");
		}
		
		WebElement cartLink=driver.findElement(By.linkText("Shopping cart"));
		cartLink.click();
		
	}

}

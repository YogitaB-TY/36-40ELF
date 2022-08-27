package testNgTraining;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase01 {

	@Test (priority = 3)
	public void demo() { //2
		
		System.out.println("Hello TestNg");
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	}
	
	@Test (priority = 1)
	public void suvarnaPrasad() throws InterruptedException {  //5
		System.out.println("Hi my son");
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
	
	@Test (priority = 2)
	public void gautam() {    //3
		System.out.println("How are you");
	}
	
	@Test (priority = 5)
	public void aparna() {  //1
		System.out.println("Hi aparna");
	}
	
	@Test(priority = 4)
	public void kgf() {   //4
		System.out.println("Rocky bhai");
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

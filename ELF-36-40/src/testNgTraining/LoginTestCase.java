package testNgTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCase {
	
	@Test(dataProvider = "login")
	public void testcase1(String userName, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	@DataProvider(name = "login",parallel = true)
	public Object[][] testData() {
		Object[][] data=new Object[3][2];
		data[0][0]="Suvarna Prasad";
		data[0][1]="Surendra Nath";
		data[1][0]="Gautam";
		data[1][1]="Naidu";
		data[2][0]="Rakesh";
		data[2][1]="Lavz";
		return data;
	}

}

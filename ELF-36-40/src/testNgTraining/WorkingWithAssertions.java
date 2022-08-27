package testNgTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithAssertions {
	
	@Test
	public void TestCase() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		String title=driver.getTitle();
		
		/*
		 * SoftAssert ast=new SoftAssert(); ast.assertEquals(title, "DemoShop",
		 * "Correct page is loaded");
		 * 
		 * driver.findElement(By.partialLinkText("BOOKS")).click(); ast.assertAll();
		 */
		
		Assert.assertEquals(title, "DemoShop", "Correct page is loaded");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		driver.close();
		
	}

}

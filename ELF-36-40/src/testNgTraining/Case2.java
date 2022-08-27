package testNgTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Case2 extends BaseTest{
	
	@Test
	public void TestCase2() {
		
		driver.get("C:/Users/User/Downloads/iframe.html");

		WebElement frame=driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='VIDEO']")).click();
	}

}

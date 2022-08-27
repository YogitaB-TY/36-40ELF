package testNgTraining;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Case4 extends BaseTest{
	@Test
	public void TestCase4() throws InterruptedException {
		driver.get("http://demowebshop.tricentis.com/");

		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);

		driver.findElement(By.linkText("Facebook")).click();
		Set<String> windowHandles= driver.getWindowHandles();
		for(String print: windowHandles) {
			driver.switchTo().window(print);
			Thread.sleep(2000);
			if(driver.getTitle().contains("Facebook")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Send Message']")).click();
				Thread.sleep(2000);
				driver.close();
			}

		}
		//driver.switchTo().window("");
		//driver.findElement(By.xpath("//span[text()='Send Message']")).click();

	}

}

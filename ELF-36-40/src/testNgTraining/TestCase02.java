package testNgTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase02 {
	
	@Test //(invocationCount = 4,threadPoolSize = 2)
	public void lucifer() { 
		
		System.out.println("Lucifer");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		//to restrict your driver methods to webdriver type
		//driver.close();
		
	}
	
	/*
	 * @Test () public void walkingDead() { System.out.println("Walking dead"); }
	 * 
	 * @Test (dependsOnMethods = "lucifer") public void familyMan() {
	 * System.out.println("Family man");
	 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 * ChromeDriver driver=new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://demowebshop.tricentis.com/");
	 * 
	 * }
	 * 
	 * @Test public void breakingBad() { System.out.println("Breaking bad"); }
	 * 
	 * @Test public void moneyHeist() { System.out.println("Money Heist"); }
	 */

}

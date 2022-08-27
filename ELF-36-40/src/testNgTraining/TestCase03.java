package testNgTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase03 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		System.out.println();
	} 
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		System.out.println();
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		System.out.println();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		System.out.println();
	}
	
	@Test (groups = "smoke")
	public void twoStates() { 
		
		System.out.println("Two states");
		System.out.println();
	}
	
	@Test (groups = "smoke")
	public void theFaultInOurStars() {  
		System.out.println("The fault in out stars");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println();
	}
	
	
	@Test
	public void alchemist() {    
		System.out.println("Alchemist");
		System.out.println();
	}
	
	@Test(groups = "regression")
	public void oliverTwist() {  
		System.out.println("Oliver twist");
		System.out.println();
	}
	
	@Test(groups = {"regression","smoke"})
	public void harryPotter() {   
		System.out.println("Harry potter");
		System.out.println();
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		System.out.println();
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		System.out.println();
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		System.out.println();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		System.out.println();
	}

}

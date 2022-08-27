package classicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		//System- class in java used to handle any kind of actions you want to perform
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\ELF-36-40SeleniumTraining\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.close();
		
		/* driver.get("http://demowebshop.tricentis.com/"); */
		
	}

} 

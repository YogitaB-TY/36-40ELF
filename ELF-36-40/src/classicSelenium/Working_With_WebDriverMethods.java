package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_WebDriverMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Downloading")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}

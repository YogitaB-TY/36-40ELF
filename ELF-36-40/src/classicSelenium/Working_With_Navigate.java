package classicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.navigate().refresh();
		driver.get("https://www.selenium.dev/downloads/");
		driver.navigate().back();
		driver.navigate().forward();
		
		String URL= driver.getCurrentUrl();
		if(URL.contains("downloads")) {
			System.out.println("PASS");
		}
		System.out.println(URL);
	}

}

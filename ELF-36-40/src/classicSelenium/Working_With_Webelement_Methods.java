package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Webelement_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		
		String classValue=registerLink.getAttribute("class");
		System.out.println("Class attribute value= "+classValue);
		
		String linkColor=registerLink.getCssValue("color"); 
		System.out.println("Color of the link : "+linkColor);
		
		String tag=registerLink.getTagName();
		System.out.println("Tagname of the element: "+tag);
		
		String Text=registerLink.getText();
		System.out.println("Text of the element is :"+Text);
		
		if(registerLink.isEnabled()) {
			System.out.println("PASS: Link is enabled");
		}
		
		registerLink.submit();
		
		WebElement searchTF=driver.findElement(By.id("small-searchterms"));
		searchTF.sendKeys("suvarna prasad . s");
		Thread.sleep(3000);
		searchTF.clear();
		searchTF.sendKeys("gautam");
		
		WebElement searchB=driver.findElement(By.xpath("//input[@value='Search']"));
		searchB.submit();
		
	}

}

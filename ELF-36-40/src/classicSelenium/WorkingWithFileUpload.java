package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingWithFileUpload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
	
		WebElement fileUploadButton= driver.findElement(By.xpath("//input[@type='file']"));
		fileUploadButton.sendKeys("C:\\Users\\User\\Documents\\TestYantra\\ELF\\resumes\\Harsha KB req\\Manjappa .pdf");
	}

}

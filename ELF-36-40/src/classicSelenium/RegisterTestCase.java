package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstname="hermoine";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement regLink= driver.findElement(By.className("ico-register"));
		regLink.click();
		
		WebElement femaleRadio=driver.findElement(By.id("gender-female"));
		
		femaleRadio.click();
		
		WebElement firstName=driver.findElement(By.name("FirstName"));
		firstName.sendKeys(firstname);
		
		WebElement lastName=driver.findElement(By.name("LastName"));
		lastName.sendKeys("Granger");
		
		WebElement email=driver.findElement(By.name("Email"));
		email.sendKeys("hermoinegranger@hogwarts.com");
		
		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("RonWeasley");
		
		WebElement confirmPassword=driver.findElement(By.name("ConfirmPassword"));
		confirmPassword.sendKeys("RonWeasley");
		
		WebElement registerButton=driver.findElement(By.name("register-button"));
		registerButton.click();

	}

}

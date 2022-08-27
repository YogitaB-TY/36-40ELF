package testNgTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Case1 extends BaseTest{
	
	@Test
	public void TestCase1() {

		driver.get("https://smallpdf.com/pdf-to-word");
	
		WebElement fileUploadButton= driver.findElement(By.xpath("//input[@type='file']"));
		fileUploadButton.sendKeys("C:\\Users\\User\\Documents\\TestYantra\\ELF\\resumes\\Harsha KB req\\Manjappa .pdf");
	}

}

package testNgTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Case3 extends BaseTest{

	@Test
	public void TestCase3()  {
		driver.get("C:/Users/User/Documents/TestYantra/ELF/ELF-34/demo.html");

		WebElement carDropDown= driver.findElement(By.id("standard_cars"));

		Select select =new Select(carDropDown);
		List<WebElement> options= select.getOptions();
		for(int i=0;i<options.size();i++) {
			//select.selectByIndex(i);
			options.get(i).click();
			//Thread.sleep(2000);

		}

	}

}

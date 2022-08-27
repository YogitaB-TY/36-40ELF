package testNgTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithMultipleRead extends BaseTest {
	
	@Test(dataProvider = "Login")
	public void testCase(String username, String password) throws InterruptedException {
		System.out.println(username);
		System.out.println(password);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("User is navigated to the home page", true);
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("User is navigated to login page");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		
		WebElement logoutLink=driver.findElement(By.linkText("Log out"));
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(logoutLink.isDisplayed(), true, "User is successfully logged in");
		ast.assertEquals("Hello", "Hey");
		ast.assertAll();
		logoutLink.click();
		
	}
	
	@DataProvider(name="Login")
	public Object[][] testData() throws EncryptedDocumentException, IOException {
		
		File file=new File("./testData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Login");
		
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(1).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[row_count-1][col_count];
		
		for(int i=0;i<row_count-1;i++) {
			for(int j=0;j<col_count;j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;		
	}

}

package testNgTraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDatadrivenTesting {
	
	@Test(dataProvider = "login")
	public void loginTestCase(String userName, String Password) {
		
		System.out.println(userName);
		System.out.println(Password);
	}
	
	@DataProvider(name="login")
	public Object[][] testData() {
		
		Object[][] data=new Object[3][2];
		data[0][0]="Suvarna Prasad";
		data[0][1]="Surendra Nath";
		data[1][0]="Gautam";
		data[1][1]="Naidu";
		data[2][0]="Rakesh";
		data[2][1]="Lavz";
		return data;
	}

}

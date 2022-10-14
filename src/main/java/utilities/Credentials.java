package utilities;

import org.testng.annotations.DataProvider;

public class Credentials {
	
	@DataProvider(name="Altoro")
	public String[][] altoroData() {
		
		String[][] data = {{"demo_user","demo_user"},
						   {"admin","admin"}};
		
		return data;
	}

	
	@DataProvider(name ="comments")
	public String[][] verifyComment() {
		String[][] data = {{"test123@gamil.com","test","test comment"}};
		return data;
	}
}

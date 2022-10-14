package altoromutual;

import org.junit.Ignore;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.AltoroMutualPage;
import utilities.Selenium_BaseClass;

public class AltoroMutual extends Selenium_BaseClass{
	String actualDep;
	AltoroMutualPage alt ;
	
	@BeforeClass
	public void browserLaunch() {
		
		browserLaunch("chrome");
		enterUrl("http://testfire.net/index.jsp");
		
	}
	
	@BeforeMethod
	public void initializaeElements() {
	 alt = new AltoroMutualPage(driver);
	}
	
	@Test(dataProvider = "Altoro",dataProviderClass = utilities.Credentials.class,priority = 0)
	public void login(String userName ,String passWord) {
		click(alt.getSignIn());
		entertext(alt.getUserName(), userName);
		entertext(alt.getPassword(), passWord);
		click(alt.getLogin());
		
		String expected = "Welcome";
		
		String actual = getText(alt.getVadidateLogin());
		System.out.println(actual);
		boolean contains = actual.contains(expected);
		
		if(userName.equals("admin")) {
			Assert.assertEquals(true, contains);
		}
		else {
			Assert.assertEquals(false, contains);
		}
	}
	
	@Test(priority = 1)
	public void accountCheck() {
		
		singleDropDownByIndex(alt.getViewAccount(), 1);
		click(alt.getGo());
		String endingAmt = getText(alt.getAmtEnding());
		System.out.println(endingAmt);
		String availAmt = getText(alt.getAmtAvail());
		System.out.println(availAmt);
		Assert.assertEquals(endingAmt, availAmt);
		
	}
	
	@Test(priority = 2)
	public void transferFunds() {
		click(alt.getTransferFunds());
		singleDropDownByIndex(alt.getToAccount(), 1);
		entertext(alt.getTransferAmount(),"9876");
		actualDep = alt.getTransferAmount().getAttribute("value");
		System.out.println(actualDep);
		click(alt.getTransfer());
		
		String expected = "successfully transferred";
		String actual = getText(alt.getTransferMsg());
		System.out.println(actual);
		boolean status = actual.contains(expected);
		
		Assert.assertEquals(true, status);
	}

	@Test(priority = 3)
	public void transactionDetails() {
		click(alt.getViewTransaction());
		String expected = getText(alt.getDeposit());
		boolean result = expected.contains(actualDep);
		System.out.println(result);
		Assert.assertEquals(true, result);
		
	}
	
	@Test(dataProvider ="comments",dataProviderClass = utilities.Credentials.class,priority = 4)
	public void signOff(String email,String subject,String comment) {
		
		click(alt.getContactUs());
		click(alt.getOnlineForm());
		entertext(alt.getEmailAddress(),email);
		entertext(alt.getSubject(), subject);
		entertext(alt.getComments(), comment);
		click(alt.getSubmit());
		
		String expected = "Thank You";
		try {
		Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String actual = getText(alt.getGreeting());
		Assert.assertEquals(actual, expected);
		
		click(alt.getSignOff());
	}
	
	@AfterClass
	public void tearDown() {
		quit();
	}
}

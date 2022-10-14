package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AltoroMutualPage {


	public AltoroMutualPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='LoginLink']") private WebElement signIn;
	@FindBy(xpath = "//*[@name='uid']") private WebElement userName;
	@FindBy(xpath = "//*[@name='passw']")private WebElement password;
	@FindBy(xpath = "//*[@name='btnSubmit']")private WebElement login;
	@FindBy(xpath = "//*[@class='fl']/p")private WebElement vadidateLogin;

	@FindBy(xpath = "//*[@name='listAccounts']")private WebElement viewAccount;
	@FindBy(xpath = "//*[@id='btnGetAccount']")private WebElement go;
	@FindBy(xpath = "(//*[@cellspacing='0'])[4]/tbody/tr[3]/td[2]")private WebElement amtEnding;
	@FindBy(xpath = "(//*[@cellspacing='0'])[4]/tbody/tr[4]/td[2]")private WebElement amtAvail;
	@FindBy(xpath = "(//*[@cellspacing='0'])[4]/tbody/tr[6]/td")private WebElement transferMsg;
	@FindBy(xpath = "//*[@id='MenuHyperLink3']")
	private WebElement transferFunds;
	@FindBy(xpath = "//*[@name='fromAccount']")
	private WebElement fromAccount;
	@FindBy(xpath = "//*[@name='toAccount']")
	private WebElement toAccount;
	@FindBy(xpath = "//*[@name='transferAmount']")
	private WebElement transferAmount;
	@FindBy(xpath = "//*[@id='transfer']")
	private WebElement transfer;

	@FindBy(xpath = "//*[@id='MenuHyperLink2']") private WebElement viewTransaction;
	@FindBy(xpath = "//*[@id='HyperLink3']") private WebElement contactUs;
	@FindBy(linkText = "online form")private WebElement onlineForm;
	@FindBy(name="email_addr") private WebElement emailAddress;
	@FindBy(name="subject") private WebElement subject;
	@FindBy(name="comments") private WebElement comments;
	@FindBy(name="submit") private WebElement submit;
	@FindBy(css = "div.fl>h1")private WebElement greeting;
	@FindBy(xpath = "//*[@id='Form1']/table[2]/tbody/tr[2]/td[5]")private WebElement deposit;
	@FindBy(id="LoginLink") private WebElement signOff;
	

	public WebElement getSignIn() {
		return signIn;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getVadidateLogin() {
		return vadidateLogin;
	}

	public WebElement getViewAccount() {
		return viewAccount;
	}
	public WebElement getGo() {
		return go;
	}
	public WebElement getAmtEnding() {
		return amtEnding;
	}
	public WebElement getAmtAvail() {
		return amtAvail;
	}
	public WebElement getTransferFunds() {
		return transferFunds;
	}
	public WebElement getFromAccount() {
		return fromAccount;
	}
	public WebElement getToAccount() {
		return toAccount;
	}
	public WebElement getTransferAmount() {
		return transferAmount;
	}
	public WebElement getTransfer() {
		return transfer;
	}

	public WebElement getTransferMsg() {
		return transferMsg;
	}

	public WebElement getViewTransaction() {
		return viewTransaction;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getOnlineForm() {
		return onlineForm;
	}
	
	public WebElement getEmailAddress() {
		return emailAddress;
	}
	public WebElement getSubject() {
		return subject;
	}
	public WebElement getComments() {
		return comments;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getGreeting() {
		return greeting;
	}
	public WebElement getSignOff() {
		return signOff;
		
	}
	public WebElement getDeposit() {
		return deposit;
	}
	


}

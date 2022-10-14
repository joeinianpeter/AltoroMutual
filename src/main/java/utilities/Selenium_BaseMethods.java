package utilities;

import java.awt.AWTException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;

public interface Selenium_BaseMethods {

	/**
	 * Enter the browserName that will Launch the specified browser you to give
	 * @exception NullPointerException if the driver is not call it throws this
	 * @param browesName
	 * @
	 */
	public void browserLaunch(String browserName);

	/**
	 * it will load the URL based on you give
	 * @param url
	 */
	public void enterUrl(String url);


	/**
	 * it will get the Current page's title
	 * @return it will returns the String Value
	 */
	public String getTitle();

	/**
	 * it will get the Current page's URL
	 * @return it will returns the String Value
	 */
	public String getCurrentUrl();


	/**
	 * it will get the current pageSource(HTML)code
	 * @return it will returns the current page's html code in String Based
	 */
	public String getPageSource();

	/**
	 * it is used for getting the current window's alphanumeric value
	 * @return it will returns the alphaNumeric value for Current Window
	 */
	public String getWindowHandle();

	/**
	 * it is used for getting the allWindows alphaNumeric(ID) Value
	 * @return it will returns the all Opened Windows alphaNumeric Value
	 */
	public Set<String> getWindowHandles();


	/**
	 * it is used for closing the particular window or Tab.
	 * Recommended for only using this method while closing the Particular Tab or Window
	 */
	public void close();

	/**
	 * it is used for quitting the Browser and also Internally.
	 * Recommended for using this method at End of the Every Test Script
	 */
	public void quit();

	/**
	 * it is used for doing the Browser's performed operations like(to,back,forward,refresh)
	 * @param moveMent  it will switch the operation based on you give
	 */
	public void Navigation(String moveMent,String url);

	/**
	 * It is used to find a Single WebElment
	 * @param Locator which Type of Locator you to use
	 * @param Value   Give their Corresponding Locator's Value
	 * @exception NoSuchElementException if the Element is not find it throws this Exception
	 * @return it will returns the WebElement based on your given Element's Value
	 */
	public WebElement elementFinding(String Locator,String Value);


	/**
	 * It is used for finding group of WebElements
	 * @param Locator Which Type of Locator You to use
	 * @param Value  Give their Corresponding Loactor's Value 
	 * @return It will returns List<WebElement> based on your given Element's Value
	 * @exception  throws the empty List
	 */
	public List<WebElement> elementsFinding(String Locator,String Value);


	/**
	 * 
	 * @param element  Give the Element Which you want to Clear
	 * @exception NoSuchElementException if the element is not identifying it throws this Exception
	 */
	public void clear(WebElement element);

	/**
	 * 
	 * @exception ElementClickInterceptedException it will happen while the element is notEnabled
	 * {@link NoSuchElementException} it will happen while the Element is not to find
	 * @param element Give the Element which you want to click
	 */
	public void click(WebElement element);


	/**
	 * it has used for clicking the WebElement(Buttons)
	 * @param element  Mention the WebElement which you want to type the text
	 * @param text  Given text Values will be passing through the mentioned WebElement
	 * @exception  NoSuchElementException if the element is not present there it throws this Exception
	 */
	public void entertext(WebElement element,String text);

	/**
	 * it has used for Entering the Values through the WebElement(text Boxes)
	 * Checking the Given Element is displayed or NotDisplayed
	 * @param element Only giving the WebElement 
	 * @exception NoSuchElementException if the element is not present there it throws this Exception 
	 * @return  while it returns "true" if the element is Visible else if it is not Visible it returns "false" 
	 */
	public boolean visibleOrNot(WebElement element);

	/**
	 * Checking the Given Element is Selected or NotSelected
	 * @param element Only giving the WebElement
	 * @exception NoSuchElementException if the element is not present there it throws this Exception 
	 * @return while it returns "true" if the element is Selected else if it is not Selected it returns "false"
	 */
	public boolean selectOrNot(WebElement element);

	/**
	 * Checking the Given Element is Enabled or NotEnabled
	 * @param element Only giving the WebElement
	 * @exception NoSuchElementException if the element is not present there it throws this Exception 
	 * @return while it returns "true" if the element is Enabled else if it is not Enabled it returns "false"
	 */
	public boolean enableOrNot(WebElement element);

	/**
	 * it has used for submit the WebElement
	 * @param element Only giving the WebElement
	 *  @exception NoSuchElementException if the element is not present there it throws this Exception 
	 */
	public void submit(WebElement element);

	/**
	 * it has used for getting the predefined Text in the WebPage based on your Given Element
	 * @param element Only giving the WebElement
	 * @return it will returns the text Value in the WebPage
	 * @exception  NoSuchElementException if the element is not present there it throws this Exception 
	 */
	public String getText(WebElement element);

	/**
	 * 
	 * @param typeOfAlert  Give the Type of Alert you want to Handle(Like...Simple,Confirm,Prompt)
	 * @return it will returns the Alert
	 * @exception UnhandledAlertException it will happen while doing the other actions instead of not handling the Alert
	 * @exception NoAlertPresentException it will happen while you're handling the not present Alert
	 */
	public void alertBox(String typeOfAlert,String alertText);
	
	
	/**
	 * it has used for switching the frame based on given Index Value
	 * @param enterTheIndex Give the IndexValue which frame you want to switch
	 * @exception NoSuchElementException it will happens if you're try to interact with inside frame element without switching.
	 * @exception NoSuchFrameException it will happens if you're mistaking by giving the index's value  
	 */
	public void frameByIndex(int enterTheIndex);
	
	/**
	 * it has used for switching the frame based on given String Value(id or name)
	 * @exception NoSuchElementException it will happens if you're inside frame element without switching.
	 * @exception NoSuchFrameException it will happens if you're mistaking by giving the id(or)name's value  
	 * @param enterTheValue Give the StringValue(id or name) you want to switch
	 */
	public void frameByString(String enterTheValue);
	
	/**
	 * it has used for switching the frame based on given Element's Value
	 * @exception NoSuchElementException it will happens if inside frame element without switching.
	 * @exception NoSuchFrameException it will happens if you're mistaking by giving the Element's Value  
	 * @param enterTheElementValue Give the ElementValue you want to switch
	 */
	public void frameByWebElement(WebElement enterTheElemnetValue);
	
	
	/**
	 * it has used for getting out from the Frames
	 * Whether it has Two Ways 
	 * 1.defaultContent - it is totally getOut from all frames
	 * 2.ParentFrame - it is used for getting out from one step backward
	 * @param directOrOneByOne select which type you to getOut from the Frame
	 */
	public void getOutFromFrame(String directOrOneByOne);
	
	/**
	 * it has used for select the value in DropDown based on your's Index Value
	 * @param element Give the Element which you want to select
	 * @param enterTheIndex Give the Index Value Which option you want to select
	 * @exception IndexOutOfBoundsException it will happens while you're giving the out of Options
	 * @exception NoSuchElementException it will happen if the element is not present
	 */
	public void singleDropDownByIndex(WebElement element,int enterTheIndex);
	
	/**
	 *  it has used for select the value in DropDown based on your's given Value
	 * @param element Give the Element which you want to select
	 * @param enterTheValue Give the Value that is present in the DOM Which option you want to select
	 */
	public void singleDropDownByValue(WebElement element,String enterTheValue);
	
	/**
	 *  it has used for select the value in DropDown based on your's given text Value
	 * @param element Give the Element which you want to select
	 * @param enterTheText Give the VisibletextValue in the DropDown Which you want to select
	 */
	public void singleDropDownByVisibleText(WebElement element,String enterTheText);
	
	/**
	 * it has used for doing DropDown's performed operations.
	 * @param selectTheFunction We have some other functions present in Select class
	 * choose anyOne you to Perform(like... getOptions,getFirstSelectedOption,getAllSelectedOtions) 
	 */
	public void dropDownFunctions(String selectTheFunction);
	
	/**
	 * it has used for selecting multiple options in a DropDown
	 * @param element Give the Element which you want to select
	 */
	public void multipleDropDownByIndex(String selectOrDeselect,WebElement element);
	
	/**
	 * it has used for doing KeyBoard Actions(Like...press Down,Press Enter)
	 * @exception AWTException it throws abstract window toolkit Exception
	 */
	public void robotKey(int noOfTimes);
	
	
	/**
	 * it has used for doing mouse's specific operations like(mouseHover,RightClick etc :-)
	 * One Important thing must Know While using Actions Class Functions.You To Tell build().perform() is mandatory for doing every Actions Class Functions 
	 * @param options Give The Mouse Action you do Perform
	 * @param element Give the Element Which you want to do perform the Mouse Operation
	 * @exception NoSuchElementException if the Element is not found it throws this Exception
	 */
	public void mouseActions(String options,WebElement element) ;
	
	/**
	 * it has used for doing drag and drop operation based on your's given Element
	 * @param sourceElement Where to Take
	 * @param targetElement Where to put
	 * @exception NoSuchElementException if the element is not found it throws this Exception
	 */
	public void dragAndDrop(WebElement sourceElement,WebElement targetElement);
	
	/**
	 * 
	 * @param element
	 */
	public void dragAndDropBy(WebElement element);
	
	public void location(WebElement element);
	
	/**
	 * It has used for doing Scrolling through the WebPage With use Of JavaScriptExecutor
	 * and also SendingKeys,doing Click Click actions Through JSExecutor
	 * @param script  Give the AnyOne JavaScript Options
	 * @param element Give the Element which you want to Perform
	 * @exception JavascriptException -It will happen when you make mistakes in script writing.
	 */
	public void javaScriptExecutor(String script,WebElement element);
	
	/**
	 * it has used for taking ScreenShot
	 * @param location Give the Location for Saving your's ScreenShot
	 */
	public void fullShot(String location);

	/**
	 * it has used for taking ScreenShot for Particular Element
	 * @param location Give the Location for Saving your's ScreenShot 
	 * @Exception NoSuchElementException if the element is not to find that time it will happen
	 */
	public void elementShot(WebElement element,String location);
	
	/**
	 * This Method is used for doing WindowsHandling 
	 * @param windowsId it contains allCurrently Opened Window's Id
	 * @param index Give the Index Value Which Window You want to Switch
	 * @exception IndexOutOfBoundsException -it will happen when you gave the out of Index Value
	 * @exception NoSuchWindowException -it will happen when you try to switch the Closed or Not Opened Window
	 * @exception NoSuchElementException -it will happen when you not to switch the window but you try to access that Window's element
	 */
	public void windowHandling(Set<String> windowsId,int index);

	/**
	 * it has used for doing several wait options(click,select,visible)
	 * @param options Give the Which type of wait option you want 
	 * @param element Give the Element which you want to wait
	 */
	public void explicitWait(String options,WebElement element);

}

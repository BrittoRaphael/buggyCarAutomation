package Utils.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;
import dev.failsafe.internal.util.Assert;

public class HomePage extends BaseClass {
	
	
	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Hi, Justine')]")
	private WebElement hiUser;
	
	@FindBy(xpath = "//*[contains(text(),'Profile')]")
	private WebElement profile;
	
	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	private WebElement logout;
	
	@FindBy(xpath = "//*[contains(text(),'Buggy Rating')]")
	private WebElement buggyRating;
	 
	@FindBy(xpath = "//*[@title='Alfa Romeo']")
	private WebElement popularMake;
	
	@FindBy(xpath = "//*[@title='Guilia Quadrifoglio']")
	private WebElement popularModel;
	
	@FindBy(xpath = "//*[contains(text(),'Overall Rating')]")
	private WebElement overallRating;
	
	@FindBy(xpath = "//*[contains(text(),'Invalid username/password')]")
	private WebElement errorMessage;
	
	@FindBy(xpath = "//*[contains(text(),'Registration is successful')]")
	private WebElement userCreationMessage;
	
	@FindBy(xpath = "/html/body/my-app/div/main/my-profile/div/form/div[3]/div")
	private WebElement profileUpdatedMessage;
	
	@FindBy(xpath = "//*[contains(text(),'Profile')]")
	private WebElement voteButton;
	
	@FindBy(xpath = "//*[contains(text(),'Thank you for your vote!')]")
	private WebElement votedMessage;
	
	public boolean checkElementPresent(String element) {
		pauseExecution("medium");
		String elementName = element;
		if (elementName.equalsIgnoreCase("profile"))
			return profile.isDisplayed();
		else if (elementName.equalsIgnoreCase("errorMessage"))
			return errorMessage.isDisplayed();
		else if (elementName.equalsIgnoreCase("userCreationMessage"))
			return userCreationMessage.isDisplayed();
		else if (elementName.equalsIgnoreCase("hiUser"))
			return hiUser.isDisplayed();
		else if (elementName.equalsIgnoreCase("profileUpdatedMessage"))
			return profileUpdatedMessage.isDisplayed();
		else if (elementName.equalsIgnoreCase("voteButton"))
			return voteButton.isDisplayed();
		else if (elementName.equalsIgnoreCase("votedMessage"))
			return votedMessage.isDisplayed();
		else if (elementName.equalsIgnoreCase("logout"))
			return logout.isDisplayed();
		return false;
	}
	
	public boolean checkNavigation(String page) {
			
		if (page.equalsIgnoreCase("model")) {
			try {
				popularModel.click();
				pauseExecution("medium");
				String landedURL = driver.getCurrentUrl();
				if(landedURL.contains("model"))
				return true;
				else
					return false;
				}
			catch (Exception e) {
				return false;
				}
		}
		
		else if (page.equalsIgnoreCase("home")) {
			try {
	        buggyRating.click();
	        pauseExecution("medium");
	        String landedURL = driver.getCurrentUrl();
	        if(landedURL.equalsIgnoreCase("https://buggy.justtestit.org/"))
				return true;
				else
					return false;
				}
			catch (Exception e) {
				return false;
				}
			}
		
		else if (page.equalsIgnoreCase("profile")) {
			try {
	        profile.click();
	        pauseExecution("medium");
	        String landedURL = driver.getCurrentUrl();
	        if(landedURL.contains("profile"))
				return true;
				else
					return false;
				}
			catch (Exception e) {
				return false;
				}
			}
		return false;
	}
	
	public boolean logOut()
	{
		try {
		pauseExecution("short");
		logout.click();
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}

}

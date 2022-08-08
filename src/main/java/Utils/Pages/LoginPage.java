package Utils.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class LoginPage extends BaseClass {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "login")
	private WebElement UserID;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//*[contains(text(),'Login')]")
	private WebElement login;
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	private WebElement register;
	
	public boolean enterUsername(String Username)
	{
		try {
		UserID.sendKeys(Username);
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean enterPasssword(String Password)
	{
		try {
		password.sendKeys(Password);
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean clickLogin()
	{
		try {
			login.click();
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean clickRegister()
	{
		try {
		register.click();
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean getURL(String url) {
		try {
		driver.get(readFile(configFilePath,url));
		return true;
		}
		catch(Exception e) {
			return false;
		}

	}
	

}

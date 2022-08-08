package Utils.Pages;

import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class RegistrationPage extends BaseClass {

private WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement login;
	
	@FindBy(name = "firstName")
	private WebElement firstName;
	
	@FindBy(name = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name = "confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//*[contains(text(),'Registration is successful')]")
	private WebElement userCreationMessage;
	
	
	public boolean enterUserDetails()
	{
		try {
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String newUserName = "Tester"+ uuid.substring(7, 11);
		writeToFile("Username", newUserName);
		login.sendKeys(newUserName);
		firstName.sendKeys("FName");
		lastName.sendKeys("LName");
		password.sendKeys("Test@123er");
		confirmPassword.sendKeys("Test@123er");
		pauseExecution("short");
		return true;
		}
		catch(Exception e) {
			return false;
		}
		
	}
	
}

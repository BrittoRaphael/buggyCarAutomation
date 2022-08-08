package Utils.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class ProfilePage extends BaseClass {
	
private WebDriver driver;
	
	public ProfilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	public boolean enterFirstName(String value)
	{
		try {
			firstName.clear();
			firstName.sendKeys(value);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}

}

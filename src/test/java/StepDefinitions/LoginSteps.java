package StepDefinitions;
import Utils.BaseClass;
import Utils.Pages.HomePage;
import Utils.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class LoginSteps extends BaseClass {

	
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);

	@Given("^user navigates to \"([^\"]*)\" url$")
    public void navigates_to_something_url(String url) {
		assertTrue("Navigation to url not successful", loginPage.getURL(url));
    }

	@When("^user enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) {
		assertTrue("Username not entered", loginPage.enterUsername(username));
		assertTrue("Password not entered", loginPage.enterPasssword(password));
    }
	
	@And("^user clicks on \"([^\"]*)\" button$")
    public void clicks_on_something_button(String action) {
        
		if (action.equalsIgnoreCase("login")) {
			assertTrue("Login not successful", loginPage.clickLogin());
		}
		
		else if(action.equalsIgnoreCase("register")) {
			assertTrue("Register not successful", loginPage.clickRegister());
		}
		
		else if(action.equalsIgnoreCase("logout")) {
			assertTrue("Logout not successful", homePage.logOut());
		}
		
    }

	@Then("^verify if \"([^\"]*)\" is displayed$")
    public void verify_if_something_is_displayed(String element) {
  
		boolean elementPresent = homePage.checkElementPresent(element);
		assertTrue(element+"Element not present", elementPresent);
    
    }

}

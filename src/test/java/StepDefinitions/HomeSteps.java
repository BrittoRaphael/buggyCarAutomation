package StepDefinitions;
import static org.junit.Assert.assertTrue;

import Utils.BaseClass;
import Utils.Pages.HomePage;
import io.cucumber.java.en.Then;

public class HomeSteps extends BaseClass {
	
	HomePage homePage = new HomePage(driver);
	
	@Then("^verify navigation to \"([^\"]*)\" page$")
    public void verify_navigation_to_something_page(String page) {
		
		assertTrue(page+"page not navigated", homePage.checkNavigation(page));
	
	}

}

package StepDefinitions;

import static org.junit.Assert.assertTrue;

import Utils.BaseClass;
import Utils.Pages.ProfilePage;
import io.cucumber.java.en.Then;

public class ProfileSteps extends BaseClass {
	
	ProfilePage profilePage = new ProfilePage(driver);
	
	@Then("^user updates name field as \"([^\"]*)\"$")
    public void user_updates_name_field_as_something(String value) {

		assertTrue("Updated profile first name mot entered",profilePage.enterFirstName(value));
		
    }

}

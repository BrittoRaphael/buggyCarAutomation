package StepDefinitions;

import static org.junit.Assert.assertTrue;

import Utils.BaseClass;
import Utils.Pages.RegistrationPage;
import io.cucumber.java.en.When;

public class RegistrationSteps extends BaseClass {
	
	RegistrationPage registrationPage = new RegistrationPage(driver);
	
	 @When("^user fills all the required fields$")
	    public void user_fills_all_the_required_fields() {
		 
		 assertTrue("Registration form data entry failed", registrationPage.enterUserDetails());
	        
	    }
	 

}

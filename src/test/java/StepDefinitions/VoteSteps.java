package StepDefinitions;
import static org.junit.Assert.assertTrue;

import Utils.BaseClass;
import Utils.Pages.LoginPage;
import Utils.Pages.VotePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class VoteSteps extends BaseClass {
	
	VotePage votePage = new VotePage(driver);
	LoginPage loginPage = new LoginPage(driver);
	
	@And("^user checks the change in number of votes after voting$")
    public void user_checks_the_change_in_number_of_votes_after_voting() {
		
		writeToFile("BeforeVote", votePage.getNumberOfVotes(votePage.numberOfVotes));
        writeToFile("AfterVote", votePage.submitVote());
        assertTrue("Vote count has not increased by 1 after voting", votePage.checkVoteChange());
    }
	
	@When("^user enters username$")
    public void user_enters_username() {
        assertTrue("Username not entered", loginPage.enterUsername(readFile(resultFilePath, "Username")));
    }

    @And("^user enters password$")
    public void user_enters_password() {
    	assertTrue("Password not entered",loginPage.enterPasssword("Test@123er"));
    }

}

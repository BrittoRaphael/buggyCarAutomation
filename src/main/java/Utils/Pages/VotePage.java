package Utils.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class VotePage extends BaseClass {
	
private WebDriver driver;
	
	public VotePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[contains(text(),'Vote!')]")
	public WebElement voteButton;
	
	@FindBy(xpath = "//div/h4/strong")
	public WebElement numberOfVotes;
	
	public String getNumberOfVotes(WebElement numberOfVotes)
	{
		String numberText = numberOfVotes.getText();
		return numberText;
	}
	
	public String submitVote() {
		voteButton.click();
		pauseExecution("long");
		return getNumberOfVotes(numberOfVotes);
	}
	
	public boolean checkVoteChange() {
		String beforeVote = readFile(resultFilePath,"BeforeVote");
		int beforeVoteNo = Integer.parseInt(beforeVote);
		String afterVote = readFile(resultFilePath,"AfterVote");
		int afterVoteNo = Integer.parseInt(afterVote);
		if(afterVoteNo-beforeVoteNo==1)
			return true;
		else
		return false;
	}

}

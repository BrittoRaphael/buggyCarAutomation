package StepDefinitions;

import Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {	
	
	
	BaseClass baseClass;
	
	@Before
	public void setup() {
		baseClass = new BaseClass();
		baseClass.initiateDefaultDriver();
	}
	
	@After
	public void tearDown() {
		baseClass = new BaseClass();
		baseClass.closeDriver();
	}

}

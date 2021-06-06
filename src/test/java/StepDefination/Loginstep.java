package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep {
	
	@Given("User is on Facebook.com")
	public void user_is_on_facebook_com() {
		
	}
	   

		@When("User Enters {string} and {string}")
		public void user_enters_and(String username, String password) {
		System.out.println("usernameis"+username);	
		} 
	    

	@When("clicks on Login button")
	public void clicks_on_login_button() {
	}

	@Then("User is on Home Page")
	public void user_is_on_home_page() {
	    
	}
}

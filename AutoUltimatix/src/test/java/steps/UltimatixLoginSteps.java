package steps;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class UltimatixLoginSteps {

	  @Given("^User is able access the Ultimatix url$")
	    public void user_is_able_access_the_ultimatix_url() {
		  
		  System.out.println("123");
		  System.out.println("456");
		 
	        
	    }

	    @When("^User login to ultimatix with correct userId$")
	    public void user_login_to_ultimatix_with_correct_userid() throws Throwable {
	       
	    	 System.out.println("123");
		        
	    }

	    @Then("^User should be able to login successfully and ultimatix Home page should display$")
	    public void user_should_be_able_to_login_successfully_and_ultimatix_home_page_should_display() throws Throwable {
	        
	    	 System.out.println("123");
		        
	    }

	    @And("^with correct Password$")
	    public void with_correct_password() throws Throwable {
	        
	    	 System.out.println("123");
		        
	    }
	
}
